package com.TopicaRP.WorldTools.Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class WorldToolsWarps {
	Logger log = Logger.getLogger("minecraft");
	WorldToolsConnection connector = new WorldToolsConnection();
	
	public Map<String,Location> getWarps() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Map<String,Location> warps = new HashMap<String,Location>();
        try {
            conn = connector.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Warps");
            rs = ps.executeQuery();
            while (rs.next()) {
                String w = rs.getString("world");
                double x = rs.getDouble("x");
                double y = rs.getDouble("y");
                double z = rs.getDouble("z");
                float yaw = rs.getFloat("yaw");
                float pitch = rs.getFloat("pitch");
                World bw = Bukkit.getWorld(w);
                Location location= new Location(bw,x,y,z,yaw,pitch);
                String warp = rs.getString("name");
                warps.put(warp, location);
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Unable to retreive homes from home table Warps");
            return null;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
		return warps;
}

public boolean addWarp(String warp, Location loc) {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        conn = connector.getConnection();
        ps = conn.prepareStatement("INSERT INTO Warps (name, x, y, z, yaw, pitch, `world`) VALUES(?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, warp);
        ps.setDouble(2, loc.getX());
        ps.setDouble(3, loc.getY());
        ps.setDouble(4, loc.getZ());
        ps.setFloat(5, loc.getYaw());
        ps.setFloat(6, loc.getPitch());
        ps.setString(7, loc.getWorld().getName());
        ps.executeUpdate();
    } catch (SQLException ex) {
        log.log(Level.SEVERE, "Unable to insert home into Warps table", ex);
        return false;
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {}
    }
    return true;
}

public boolean removeWarp(String warp) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
        conn = connector.getConnection();
        ps = conn.prepareStatement("DELETE FROM Warps WHERE name = ?");
        ps.setString(1, warp);
        ps.executeUpdate();
    } catch (SQLException ex) {
        log.log(Level.SEVERE, "Unable to update home in homes table", ex);
        return false;
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {}
    }
    return true;
}
}
