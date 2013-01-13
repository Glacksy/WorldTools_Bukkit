package com.TopicaRP.WorldTools.Files;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorldToolsFileCreator {
	
	Logger log = Logger.getLogger("minecraft");
	String directory = "plugins/config/WorldTools/";
	WorldToolsFileWriter writer = new WorldToolsFileWriter();
	
	/**
	 * 
	 * creates the MySQL file
	 * 
	 */
	public void createMysqlFile(){
		File f = new File(directory+"MySQL.properties");
		if (!f.exists()){
			f.mkdirs();
			createFile(f, "MySQL");
			writer.writeMysql(f);
		}
	}
	/**
	 * 	
	 * creates the global Rules
	 * 
	 */
	public void createGlobalRules(){
		File f = new File(directory+"GlobalRules.properties");
		if (!f.exists()){
			f.mkdirs();
			createFile(f, "GlobalRules");
		}
	}
	
	/**
	 * 
	 * creates the commands file
	 * 
	 */
	public void createCommandsFile(){
		File f = new File(directory+"Commands.properties");
		if (!f.exists()){
			f.mkdirs();
			createFile(f, "Commands");
			writer.writeCommands(f);
		}
	}
	
	/**
	 * 	
	 * creates the global properties
	 * 
	 */
	public void createGlobalProperties(){
		File f = new File(directory+"GlobalProperties.properties");
		if (!f.exists()){
			f.mkdirs();
			createFile(f, "GlobalProperties");
			writer.writeGlobalProperties(f);
		}
	}
	
	/**
	 * 
	 * creates the warps file
	 * 
	 */
	public void createWarpsFile(){
		File warps = new File(directory+"Warps.properties");
		if (!warps.exists()){
			warps.mkdirs();
			createFile(warps, "Warps");
		}
	}
	
	/**
	 * 
	 * creates the world properties
	 * 
	 * @param worldName
	 */
	public void createWorldProperties(String worldName){
		File config = new File(directory+worldName+"/WorldProperties.properties");
		if (!config.exists()){
			config.mkdirs();
			if(createFile(config, worldName)){
			writer.writeWorldProperties(config,worldName);
			}
		}
	}
	
	/**
	 * 
	 * creates the homes file for a world	
	 * 
	 */
	public void createHomesFile(String worldName){
		File homes = new File(directory+worldName+"/Homes.properties");
		if (!homes.exists()){
			homes.mkdirs();
			createFile(homes, "Homes");
		}
	}
	
	/**
	 * 
	 * creates the kits file for a world
	 * 
	 * @param worldName
	 */
	public void createKitsFile(String worldName){
		File kits = new File(directory+worldName+"/Kits.properties");
		if (!kits.exists()){
			kits.mkdirs();
			createFile(kits, "Kits");
		}
	}
	
	/**
	 * 
	 * creates the rules file for a world
	 * 
	 */
	public void createRulesFile(String worldName){
		File rules = new File(directory+worldName+"/Rules.properties");
		if (!rules.exists()){
			rules.mkdirs();
			createFile(rules, "Rules");
		}
	}
	
	/**
	 * 
	 * creates the file
	 * 
	 * @param f
	 * @param world
	 * @return true if operation succeed
	 */
	public boolean createFile(File f, String world){
		try {
			f.createNewFile();
		} catch (IOException e) {
			log.log(Level.SEVERE, "[WorldTools] could not create a propertiesfile for "+world);
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
