package com.TopicaRP.WorldTools.Files.DataBase;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.TopicaRP.WorldTools.Files.PropertiesFile;

public class WorldToolsRules {
	
	String directory = "plugins/config/WorldTools/";
	PropertiesFile global = new PropertiesFile(directory+"GlobalRules.properties");
	Logger log = Logger.getLogger("minecraft");

	/**
	 * 
	 * adds a global rule
	 * 
	 * @param rule
	 */
	public void addGlobalRule(String rule){
		int key = getGlobalRules().size()+1;
		global.setString(key+"", rule);
	}
	
	/**
	 * 
	 * adds a local rule
	 * 
	 * @param worldName
	 * @param rule
	 */
	public void addWorldRule(String worldName, String rule){
		PropertiesFile rules = new PropertiesFile(directory+worldName+"/Rules.properties");
		int key = getWorldRules(worldName).size()+1;
		rules.setString(key+"", rule);
	}
	
	/**
	 * 
	 * removes a global rule
	 * 
	 * @param ruleNumber
	 */
	public void removeGlobalRule(int ruleNumber){
		global.removeKey(ruleNumber+"");
	}
	
	/**
	 * 
	 * removes a local rule
	 * 
	 * @param worldName
	 * @param ruleNumber
	 */
	public void removeWorldRule(String worldName, int ruleNumber){
		PropertiesFile rules = new PropertiesFile(directory+worldName+"/Rules.properties");
		rules.removeKey(ruleNumber+"");
	}
	
	/**
	 * 
	 * gets all global rules
	 * 
	 * @return a Map<String,String> of all rules
	 */
	public Map<String,String> getGlobalRules(){
		try {
			return global.returnMap();
		} catch (Exception e) {
			log.log(Level.SEVERE,"[WorldTools] - could not read global rules file");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 
	 * gets all the local rules
	 * 
	 * @param worldName
	 * @return Map<String,String> or world rules
	 */
	public Map<String,String> getWorldRules(String worldName){
		PropertiesFile rules = new PropertiesFile(directory+worldName+"/Rules.properties");
		try {
			return rules.returnMap();
		} catch (Exception e) {
			log.log(Level.SEVERE,"[WorldTools] - could not read rules file");
			e.printStackTrace();
			return null;
		}
	}
}
