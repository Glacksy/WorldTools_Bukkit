package com.TopicaRP.WorldTools.Files;


public class WorldToolsMysql {

	PropertiesFile properties = new PropertiesFile("plugins/config/WorldTools/MySQL.properties");
	
	/**
	 * 
	 * checks if the user wants to use MySQL 
	 * 
	 * @return true if the user wants to use MySQL
	 */
	public boolean useMysql(){
		return Boolean.parseBoolean(properties.getProperty("MySQL"));
	}
	
	/**
	 * 
	 * gets the MySQL username
	 * 
	 * @return the MySQL username
	 */
	public String getUser(){
		return properties.getProperty("SQLuser");
	}
	
	/**
	 * 
	 * gets the MySQL password
	 * 
	 * @return the MySQL password
	 */
	public String getPass(){
		return properties.getProperty("SQLpass");
	}
	
	/**
	 * 
	 * gets the MySQL database
	 * 
	 * @return the MySQL database
	 */
	public String getDataBase(){
		return properties.getProperty("SQLdb");
	}
	
	/**
	 * 
	 * gets the MySQL driver
	 * 
	 * @return the MySQL driver
	 */
	public String getDriver(){
		return properties.getProperty("SQLdriver");
	}

}
