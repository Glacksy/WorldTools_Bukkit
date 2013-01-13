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
import org.bukkit.World;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.TopicaRP.WorldTools.Files.WorldToolsFileCreator;

/**
 * This is the main class file for WorldTools
 * @author Glacksy
 */

public class WorldTools extends JavaPlugin {

	  static WorldToolsListener listener = new WorldToolsListener();
	  static WorldToolsFileCreator filer = new WorldToolsFileCreator();
	  static PlayerTools playertools = new PlayerTools();
	  
	  private static Logger log = Logger.getLogger("Minecraft");
	  
	  static String pluginName = "WorldTools";
	  static String version = "1.0";
	  static String Author = "Glacksy & Spenk";
	  static String Updatr = "Updatr";
	  public static String TVer = "1.0";
	  
	  public static int explosionRad = 4;
	  public Permission perms;

	/**
	 * this will load our hooks it will check if you have the latest build and
	 * it will create the configurations
	 */
	public void onEnable() {
		if (this.isPermissionsEnabled()) {
			getServer().getPluginManager().registerEvents(listener, this);
			log.info(pluginName + " " + version + " by " + Author + " Enabled");
			if (isUpdate()) {
				log.info("[WorldTools] - There is an update available!");
			}

			LoadFiles();
			log.info("[WorldTools] - Files Created & Loaded!");
		} else {
			log.info("[WorldTools] Error no vault found! Disabeling WorldTools!");
			Bukkit.getServer().getPluginManager().disablePlugin(this);
			return;
		}
	}

	/**
	 * 
	 * this will check if the permissions and vault are enabled
	 * 
	 * @return true if vault is enabled
	 */
	public boolean isPermissionsEnabled() {
		if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		RegisteredServiceProvider<Permission> rsp = getServer()
				.getServicesManager().getRegistration(Permission.class);
		if (rsp == null) {
			return false;
		}
		perms = rsp.getProvider();
		return perms != null;
	}

	/**
	 * 
	 * this will message whenever the plugin unloads
	 * 
	 */
	public void onDisable() {
		log.info(pluginName + " " + version + " by " + Author + " Disabled");
	}

	/**
	 * 
	 * this will create all files needed for WorldTools to function
	 * 
	 */
	public static void LoadFiles() {
		updatr.createUpdatrFile();
		filer.createGlobalProperties();
		filer.createGlobalRules();
		filer.createCommandsFile();
		filer.createWarpsFile();
		filer.createMysqlFile();
		
		for(World w : Bukkit.getWorlds()){
			String worldName = w.getName();
			filer.createKitsFile(worldName);
			filer.createHomesFile(worldName);
			filer.createRulesFile(worldName);
			filer.createWorldProperties(worldName);
		}
		
	}


	/**
	 * 
	 * checks if you are running the latest WorldTools
	 * 
	 * @return true if you are running an old version
	 */
	public static boolean isUpdate() {
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
				if (inputLine.contains("WorldTools=")) {
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


//end of class