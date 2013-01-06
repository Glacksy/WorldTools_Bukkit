package com.TopicaRP.WorldTools;
/*
 * WorldTools
 * Copyright (C) 2012
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is the main class file for WorldTools
 * @author Glacksy
 */

public class WorldTools extends JavaPlugin {

	  static WorldToolsListener listener = new WorldToolsListener();
	  static WorldToolsProperties properties = new WorldToolsProperties();
	  static PlayerTools playertools = new PlayerTools();
	  
	  private static Logger log = Logger.getLogger("Minecraft");
	  private static Object logger;
	  
	  static String pluginName = "WorldTools";
	  static String version = "1.0";
	  static String Author = "Glacksy & Spenk";
	  static String Updatr = "Updatr";
	  public static String TVer = "1.0";
	  
	  private final static String Dir = "plugins/config/WorldTools/"; 
	  private final static String Set = "WorldTools.properties";
	  
	  private static Location exactSpawn = null;
	  private static PropertiesFile Settings;
	  
	  public static int explosionRad = 4;
	  Server server = Bukkit.getServer();
	  public Permission perms = null;

/**
 * this will load our hooks it will check if you have the latest build and it will create the configurations
 */
public void onEnable()
{
	if (this.isPermissionsEnabled()){
	getServer().getPluginManager().registerEvents(listener, this);
	log.info(pluginName + " " + version + " by " + Author + " Enabled");
	if(Listener.isLatest()){
	log.info("[WorldTools] - There is an update available!");}
	
	Listener.LoadAll();
	log.info("[WorldTools] - Files Created & Loaded!");
	}else{
		log.info("[WorldTools] Error no vault found! Disabeling WorldTools!");
		Bukkit.getServer().getPluginManager().disablePlugin(this);
		return;
	}
}

public boolean isPermissionsEnabled() {
	if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
		return false;
	}
	RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
	if (rsp == null) {
		return false;
	}
	perms = rsp.getProvider();
	return perms != null;
}

public void onDisable()
{
	log.info(pluginName + " " + version + " by " + Author + " Disabled");
}

public static class Listener{
    
	// Get Folder and Dir
	public static String getDir() {
		return Dir;
	}
	// Get Properties file
    public static String getSet() {
	    return Set;
    }
    // Return both Folder and Props
    public static String getDirSet() { 
    	return Dir+Set;
    }
    // Return pluginName
    public static String pluginName() { 
    	return pluginName;
    }
    // Return pluginName
    public static String Version() { 
    	return version;
    }
    // Return Updatr logger
    public static Object logger() { 
    	return logger;
    }
    // Return settings
    public static PropertiesFile Settings() {  
    	return Settings;
    }
    public static Location exactSpawn() {  
    	return exactSpawn;
    }
    public static void LoadAll() {
    	updatr.createUpdatrFile();
    	properties.createfile();
    }
    
    
 /**
  * Check if your running latest version
  * @author darkdiplomat
  * 
  */
    public static boolean isLatest(){
	String address = "http://www.topica-rp.com/Download/version.html";
	URL url = null;
	try {
		url = new URL(address);
	} catch (MalformedURLException e) {
		return true;
	}
	String[] Vpre = new String[1]; 
	BufferedReader in;
	try {
		in = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			if (inputLine.contains("WorldTools=")){
				Vpre = inputLine.split("=");
				TVer = Vpre[1].replace("</p>", "");
			}
		}
		in.close();
	} catch (IOException e) {
		return true;
	}
	return (version.equals(TVer));
  } 
 }
}


//end of class