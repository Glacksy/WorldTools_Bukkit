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

public class WorldToolsHomes {
	
	Logger log = Logger.getLogger("minecraft");
	WorldToolsConnection connector = new WorldToolsConnection();
	
	public Map<String,Location> getHomes(String world) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Map<String,Location> homes = new HashMap<String,Location>();
        try {
            conn = connector.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Homes_"+world);
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
                String player = rs.getString("name");
                homes.put(player, location);
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "Unable to retreive homes from home table Homes");
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
		return homes;
}
	
	public boolean hasHome(String player, String world){
		return getHomes(world).containsKey(player);
	}
	
	public Location getHome(String player, String world){
		if (getHomes(world).containsKey(player)){
		return getHomes(world).get(player);
		}
		return null;
	}

	
public boolean addHome(String world, String player, Location loc) {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        conn = connector.getConnection();
        ps = conn.prepareStatement("INSERT INTO Homes_"+world+" (name, x, y, z, yaw, pitch, `world`) VALUES(?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, player);
        ps.setDouble(2, loc.getX());
        ps.setDouble(3, loc.getY());
        ps.setDouble(4, loc.getZ());
        ps.setFloat(5, loc.getYaw());
        ps.setFloat(6, loc.getPitch());
        ps.setString(7, loc.getWorld().getName());
        ps.executeUpdate();
    } catch (SQLException ex) {
        log.log(Level.SEVERE, "Unable to insert home into homes table", ex);
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

public boolean removeHome(String world, String player) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
        conn = connector.getConnection();
        ps = conn.prepareStatement("DELETE FROM Homes_" + world + " WHERE name = ?");
        ps.setString(1, player);
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

public boolean changeHome(String world, String player, Location loc) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
        conn = connector.getConnection();
        ps = conn.prepareStatement("UPDATE Homes_" + world + " SET x = ?, y = ?, z = ?, yaw = ?, pitch = ?, `world` = ? WHERE name = ?");
        ps.setDouble(1, loc.getX());
        ps.setDouble(2, loc.getY());
        ps.setDouble(3, loc.getZ());
        ps.setFloat(4, loc.getYaw());
        ps.setFloat(5, loc.getPitch());
        ps.setString(6, loc.getWorld().getName());
        ps.setString(7, player);
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
