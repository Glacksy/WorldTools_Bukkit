package com.TopicaRP.WorldTools.Files.DataBase;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import com.TopicaRP.WorldTools.Files.PropertiesFile;

public class WorldToolsWarps {

	public String directory = "plugins/config/WorldTools/Warps.properties";
	
	public boolean setWarp(String warp, Location loc){
		File dir = new File(directory);
		if (dir.exists()){
			PropertiesFile data = new PropertiesFile(directory); 
			String s = loc.getWorld().getName()+","+loc.getX()+","+loc.getY()+","+loc.getZ()+","+loc.getPitch()+","+loc.getYaw();
			data.setString(warp, s);
			return true;
		}
		return false;
	}
	
	public boolean existsWarp(String warp){
		Map<String,Location> warps = getWarps();
		if (warps != null){
			return warps.containsKey(warp); 
		}
		return false;
	}
	
	public Location getWarp(String warp){
		Map<String,Location> warps = getWarps();
		if (warps != null && warps.containsKey(warp)){
			return warps.get(warp);
		}
		return null;
	}
	
	public boolean removeWarp(String warp){
		if (existsWarp(warp)){
			PropertiesFile data = new PropertiesFile(directory); 
			data.removeKey(warp);
			return true;
		}
		return false;
	}
	
	public Map<String,Location> getWarps(){
		File dir = new File(directory);
		Map<String, Location> warps = new HashMap<String,Location>();
		if (dir.exists()){
			PropertiesFile data = new PropertiesFile(directory);
			try {
				Map<String,String> dat = data.returnMap();
				for(String s : dat.keySet()){
					String[] split = dat.get(s).split(",");
					World w = Bukkit.getWorld(split[0]);
					double x = Double.parseDouble(split[1]);
					double y = Double.parseDouble(split[2]);
					double z = Double.parseDouble(split[3]);
					Float pitch = Float.parseFloat(split[4]);
					Float yaw = Float.parseFloat(split[4]);
					Location home = new Location(w, x, y, z, yaw, pitch);
					warps.put(s, home);
				}
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return warps;
		}
		return null;
	}
	
}
