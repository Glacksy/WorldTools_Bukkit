package com.TopicaRP.WorldTools.Files;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import com.TopicaRP.WorldTools.PropertiesFile;

public class WorldToolsHomes {
	
	Map<String,Location> homes = new HashMap<String,Location>();
	
	public boolean setHome(String world, String player,Location loc){
		File dir = new File("plugins/config/WorldTools/"+world+"/Homes.properties");
		if (dir.exists()){
			PropertiesFile data = new PropertiesFile("plugins/config/WorldTools/"+world+"/Homes.properties"); 
			String s = loc.getWorld().getName()+","+loc.getX()+","+loc.getY()+","+loc.getZ()+","+loc.getPitch()+","+loc.getYaw();
			data.setString(player, s);
			return true;
		}
		return false;
	}
	
	public boolean hasHome(String world, String player){
		Map<String,Location> homes = getHomes(world);
		if (homes != null){
			return homes.containsKey(player); 
		}
		return false;
	}
	
	public Location getHome(String world, String player){
		Map<String,Location> homes = getHomes(world);
		if (homes != null && homes.containsKey(player)){
			return homes.get(player);
		}
		return null;
	}
	
	public boolean removeHome(String world, String player){
		if (hasHome(world,player)){
			PropertiesFile data = new PropertiesFile("plugins/config/WorldTools/"+world+"/Homes.properties"); 
			data.removeKey(player);
			return true;
		}
		return false;
	}
	
	public Map<String,Location> getHomes(String world){
		File dir = new File("plugins/config/WorldTools/"+world+"/Homes.properties");
		Map<String, Location> homes = new HashMap<String,Location>();
		if (dir.exists()){
			PropertiesFile data = new PropertiesFile("plugins/config/WorldTools/"+world+"/Homes.properties");
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
					homes.put(s, home);
				}
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return homes;
		}
		return null;
	}

}
