package com.TopicaRP.WorldTools;

import java.util.Map;

import org.bukkit.Location;

import com.TopicaRP.WorldTools.Files.WorldToolsMysql;

public class WorldToolsDataParser {
	WorldToolsMysql mysql = new WorldToolsMysql();
 com.TopicaRP.WorldTools.Files.DataBase.WorldToolsHomes fileHomes = new com.TopicaRP.WorldTools.Files.DataBase.WorldToolsHomes();
 com.TopicaRP.WorldTools.Mysql.WorldToolsHomes mysqlHomes = new com.TopicaRP.WorldTools.Mysql.WorldToolsHomes();
 
 /**
  * 
  * sets the player home on mysql or flatfile
  * 
  * @param world
  * @param player
  * @param loc
  * @return action succeed
  */
	public boolean setHome(String world, String player, Location loc) {
		if (mysql.useMysql()) {
			return mysqlHomes.addHome(world, player, loc);
		}
		return fileHomes.setHome(world, player, loc);
	}
	
	/**
	 * 
	 * checks if a player has a home
	 * 
	 * @param world
	 * @param player
	 * @return true if the player has a home
	 */
	public boolean hasHome(String world, String player) {
		if (mysql.useMysql()) {
			return mysqlHomes.hasHome(player, world);
		}
		return fileHomes.hasHome(world, player);
	}
	
	/**
	 * 
	 * gets the players home from mysql or flatfile
	 * 
	 * @param world
	 * @param player
	 * @return location of players home
	 */
	public Location getHome(String world, String player) {
		if (mysql.useMysql()) {
			return mysqlHomes.getHome(player, world);
		}
		return fileHomes.getHome(world, player);
	}
	
	/**
	 * 
	 * removes the players home
	 * 
	 * @param world
	 * @param player
	 * @return true if the action succeed
	 */
	public boolean removeHome(String world, String player){
		 if (mysql.useMysql()){
			 return mysqlHomes.removeHome(world, player);
		 }
		 return fileHomes.removeHome(world, player);
	}
	
	/**
	 * 
	 * get all homes in a specified world
	 * 
	 * @param world
	 * @return Map<String,String> of all homes in a world
	 */
	public Map<String,Location> getHomes(String world){
		 if (mysql.useMysql()){
			 return mysqlHomes.getHomes(world);
		 }
		 return fileHomes.getHomes(world);
	}
 
}
