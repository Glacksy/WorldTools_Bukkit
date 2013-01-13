package com.TopicaRP.WorldTools;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.TopicaRP.WorldTools.Files.WorldToolsCommands;

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
public class WorldToolsVoids implements Listener{
	
	/**
	 * 
	 * checks if a player has decent permissions
	 *
	 * @param player
	 * @param permission
	 */
	public boolean hasPermission(CommandSender player, String permissionLabel){
		if (player.isOp()){
			return true;
		}
		WorldTools tools = new WorldTools();
		return tools.perms.has(player,permissionLabel);
	}
	
	/**
	 * 
	 * checks if a command is enabled
	 * 
	 * @param command
	 * @return
	 */
	public boolean isCommandEnabled(String command){
		WorldToolsCommands cmdCheck = new WorldToolsCommands();
		return cmdCheck.isCommandEnabled(command);
	}

	/**
	 * 
	 * heal players
	 * 
	 * @param world
	 * @param player
	 * @param type
	 * 
	 * type must be an integer
	 * 0 = in world
	 * 1 = in playerworld
	 * 2 = all players
	 * 3 = in player radius
	 * 
	 * @param radius
	 */
	public void healPlayers(World world , Player player, int type, int radius){
		if (type == 0){
			for(Player p : world.getPlayers()){
				p.setHealth(20);
			}
		}
		if (type == 1){
			for(Player p : player.getWorld().getPlayers()){
				p.setHealth(20);
			}
		}
		if (type == 2){
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				p.setHealth(20);
			}
		}
		if(type == 3){
			List<Player> players = getPlayers(player, radius);
			for (Player p : players){
				p.setHealth(20);
			}
		}
	}
	
	/**
	 * 
	 * @param world
	 * @param player
	 * @param type
	 * 
	 * type must be an integer
	 * 0 = in world
	 * 1 = in playerworld
	 * 2 = all players
	 * 3 = in player radius
	 * 
	 * @param radius
	 */
	public void killPlayers(World world , Player player, int type, int radius){
		if (type == 0){
			for(Player p : world.getPlayers()){
				p.setHealth(0);
			}
		}
		if (type == 1){
			for(Player p : player.getWorld().getPlayers()){
				p.setHealth(0);
			}
		}
		if (type == 2){
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				p.setHealth(0);
			}
		}
		if(type == 3){
			List<Player> players = getPlayers(player, radius);
			for (Player p : players){
				p.setHealth(0);
			}
		}
	}
	
	/**
	 * 
	 * slap players
	 * 
	 * @param world
	 * @param player
	 * @param type
	 * 
	 * type must be an integer
	 * 0 = in world
	 * 1 = in playerworld
	 * 2 = all players
	 * 3 = in player radius
	 * 
	 * @param radius
	 */
	public void slapPlayers(World world , Player player, int type, int radius){
		if (type == 0){
			for(Player p : world.getPlayers()){
				p.setHealth(p.getHealth()-1);
			}
		}
		if (type == 1){
			for(Player p : player.getWorld().getPlayers()){
				p.setHealth(p.getHealth()-1);
			}
		}
		if (type == 2){
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				p.setHealth(p.getHealth()-1);
			}
		}
		if(type == 3){
			List<Player> players = getPlayers(player, radius);
			for (Player p : players){
				p.setHealth(p.getHealth()-1);
			}
		}
	}
	
	/**
	 * 
	 * maim players
	 * 
	 * @param world
	 * @param player
	 * @param type
	 * 
	 * type must be an integer
	 * 0 = in world
	 * 1 = in player world
	 * 2 = all players
	 * 3 = in player radius
	 * 
	 * @param radius
	 */
	public void maimPlayers(World world , Player player, int type, int radius){
		if (type == 0){
			for(Player p : world.getPlayers()){
				p.setHealth(1);
			}
		}
		if (type == 1){
			for(Player p : player.getWorld().getPlayers()){
				p.setHealth(1);
			}
		}
		if (type == 2){
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				p.setHealth(1);
			}
		}
		if(type == 3){
			List<Player> players = getPlayers(player, radius);
			for (Player p : players){
				p.setHealth(1);
			}
		}
	}
	
	/**
	 * 
	 * feed players
	 * 
	 * @param world
	 * @param player
	 * @param type
	 * 
	 * type must be an integer
	 * 0 = in world
	 * 1 = in player world
	 * 2 = all players
	 * 3 = in player radius
	 * 
	 * @param radius
	 */
	public void feedPlayers(World world , Player player, int type, int radius){
		if (type == 0){
			for(Player p : world.getPlayers()){
				p.setFoodLevel(20);
			}
		}
		if (type == 1){
			for(Player p : player.getWorld().getPlayers()){
				p.setFoodLevel(20);
			}
		}
		if (type == 2){
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				p.setFoodLevel(20);
			}
		}
		if(type == 3){
			List<Player> players = getPlayers(player, radius);
			for (Player p : players){
				p.setFoodLevel(20);
			}
		}
	}
	
	/**
	 * 
	 * starvate players
	 * 
	 * @param world
	 * @param player
	 * @param type
	 * 
	 * type must be an integer
	 * 0 = in world
	 * 1 = in playerworld
	 * 2 = all players
	 * 3 = in player radius
	 * 
	 * @param radius
	 */
	public void starvatePlayers(World world , Player player, int type, int radius){
		if (type == 0){
			for(Player p : world.getPlayers()){
				p.setFoodLevel(0);
			}
		}
		if (type == 1){
			for(Player p : player.getWorld().getPlayers()){
				p.setFoodLevel(0);
			}
		}
		if (type == 2){
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				p.setFoodLevel(0);
			}
		}
		if(type == 3){
			List<Player> players = getPlayers(player, radius);
			for (Player p : players){
				p.setFoodLevel(0);
			}
		}
	}
	
	/**
	 * 
	 * replaces all lava in a player radius with air
	 * 
	 * @param player
	 * @param radius
	 */
	public void drainLava(Player player , int radius){
		replaceBlock(player, radius, 10, 0);
		replaceBlock(player, radius, 11, 0);
	}
	
	/**
	 * 
	 * replaces all water in a player radius with air
	 * 
	 * @param player
	 * @param radius
	 */
	public void drainWater(Player player , int radius){
		replaceBlock(player, radius, 8, 0);
		replaceBlock(player, radius, 9, 0);
	}

	/**
	 * 
	 * replaces all lava in a player radius with stationary lava
	 * 
	 * @param player
	 * @param radius
	 */
	public void fixLava(Player player , int radius){
		replaceBlock(player, radius, 10, 11);
		replaceBlock(player, radius, 11, 11);
	}
	
	/**
	 * 
	 * replaces all water in a player radius flowing water
	 * 
	 * @param player
	 * @param radius
	 */
	public void FixWater(Player player , int radius){
		replaceBlock(player, radius, 8, 8);
		replaceBlock(player, radius, 9, 8);
	}
	
	/**
	 * 
	 * removes all snow and ice in an area around the player
	 * 
	 * @param player
	 * @param radius
	 */
	public void thaw(Player player , int radius){
		replaceBlock(player, radius, 78, 0);
		replaceBlock(player, radius, 79, 9);
	}
	
	/**
	 * 
	 * replaces any block in a radius
	 * 
	 * @param player
	 * @param radius
	 * @param fromid
	 * @param toid
	 */
	public static void replaceBlock(Player player, int radius , int fromid, int toid){
		
		int px = (int)Math.ceil(player.getLocation().getX());
		int py = (int)Math.ceil(player.getLocation().getY());
		int pz = (int)Math.ceil(player.getLocation().getZ());
		
		int xmin = (int)px-radius;
		int ymin = (int)py-radius;
		int zmin = (int)pz-radius;
		
		int xmax = (int)px+radius;
		int ymax = (int)py+radius;
		int zmax = (int)pz+radius;
		
		for (int x = xmin; x <= xmax; x++) {
			for (int y = ymin; y <= ymax; y++) {
				for (int z = zmin; z <= zmax; z++) {
					if (player.getWorld().getBlockTypeIdAt(x, y, z) == fromid){
						player.getWorld().getBlockAt(x, y, z).setTypeId(toid);
					}
				}
			}
		}
	  }
	
	/**
	 * 
	 * kills all mobs in a players radius
	 * 
	 * @param player
	 * @param radius
	 * @param fromid
	 * @param toid
	 * @return
	 */
	public static int killMobs(Player player, int radius , int fromid, int toid){
		
		int px = (int)Math.ceil(player.getLocation().getX());
		int py = (int)Math.ceil(player.getLocation().getY());
		int pz = (int)Math.ceil(player.getLocation().getZ());
		
		int xmin = (int)px-radius;
		int ymin = (int)py-radius;
		int zmin = (int)pz-radius;
		
		int xmax = (int)px+radius;
		int ymax = (int)py+radius;
		int zmax = (int)pz+radius;
		
		int mobcount = 0;
		
		for (int x = xmin; x <= xmax; x++) {
			for (int y = ymin; y <= ymax; y++) {
				for (int z = zmin; z <= zmax; z++) {
					for (Entity e : player.getWorld().getEntities()){
						if (e instanceof LivingEntity){
							LivingEntity le = (LivingEntity) e;
							if (!(le instanceof Player)){
						if ( (e.getLocation().getX() == x) && (e.getLocation().getY() == y) && (e.getLocation().getZ() == z)){
							le.setHealth(-1);
							mobcount++;
						}
						}
						}
					}
				}
			}
		}
		return mobcount;
	  }
	
	/**
	 * 
	 * get all players in a radius of a player
	 * 
	 * @param player
	 * @param radius
	 * @return List<player>
	 */
	public List<Player> getPlayers(Player player, int radius){
		int px = (int)Math.ceil(player.getLocation().getX());
		int py = (int)Math.ceil(player.getLocation().getY());
		int pz = (int)Math.ceil(player.getLocation().getZ());
		
		int xmin = (int)px-radius;
		int ymin = (int)py-radius;
		int zmin = (int)pz-radius;
		
		int xmax = (int)px+radius;
		int ymax = (int)py+radius;
		int zmax = (int)pz+radius;
		
		List<Player> players = new ArrayList<Player>();
		
		for (int x = xmin; x <= xmax; x++) {
			for (int y = ymin; y <= ymax; y++) {
				for (int z = zmin; z <= zmax; z++) {
					for (Player p : player.getWorld().getPlayers()){
						int p2x = (int)Math.floor(p.getLocation().getX());
						int p2y = (int)Math.floor(player.getLocation().getY());
						int p2z = (int)Math.floor(player.getLocation().getZ());
						if (p2x == x && p2y == y && p2z == z){
							players.add(player);
						}
					}
				}
			}
		}
		return players;
	}

	/**
	 * 
	 * checks if its valid to put the item in players head and does it
	 * 
	 * @param player
	 * @return error id
	 * @return -1 if the transaction was successful 
	 */
	public int putHat(Player player){
		if (player.getItemInHand() == null){
			return 0;
		}
		if (player.getInventory().getHelmet() != null){
			return 1;
		}
		if (player.getItemInHand().getTypeId() > 200){
			return 2;
		}
		player.getItemInHand().setAmount(player.getItemInHand().getAmount()-1);
		player.getInventory().setHelmet(new ItemStack(player.getItemInHand().getTypeId()));
		return -1;
	}
	
	
	public static void fillarea(Block b, int radius){
		int xmin = (int)b.getX()-radius;
		int xmax = (int)b.getX()+radius;
		int ymin = (int)b.getY()-radius;
		int ymax = (int)b.getY()+radius;
		int zmin = (int)b.getZ()-radius;
		int zmax = (int)b.getZ()+radius;
		for (int x = xmin; x <= xmax; x++) {
			for (int y = ymin; y <= ymax; y++) {
				for (int z = zmin; z <= zmax; z++) {
					if (b.getWorld().getBlockTypeIdAt(x, y, z) == 0){b.getWorld().getBlockAt(x, y, z).setTypeId(9);}
				}
			}
		}
	  }
	
	/**
	 * @param b
	 * @param radius
	 * @return
	 */
	public static boolean isinarea(Block b,int radius){
		int radi = radius+1;
		int xmin = (int)b.getX()-radi;
		int xmax = (int)b.getX()+radi;
		int ymin = (int)b.getY()-radi;
		int ymax = (int)b.getY()+radi;
		int zmin = (int)b.getZ()-radi;
		int zmax = (int)b.getZ()+radi;
		for (int x = xmin; x <= xmax; x++) {
			for (int y = ymin; y <= ymax; y++) {
				for (int z = zmin; z <= zmax; z++) {
					if (b.getWorld().getBlockTypeIdAt(x, y, z) == 19){return true;}
				}
			}
		}
		return false;
	}
/**
 * 
 * @param b
 * @param radius
 * @return
 */
	public boolean isinarea2(Block b,int radius){
		int radi = radius;
		int xmin = (int)b.getX()-radi;
		int xmax = (int)b.getX()+radi;
		int ymin = (int)b.getY()-radi;
		int ymax = (int)b.getY()+radi;
		int zmin = (int)b.getZ()-radi;
		int zmax = (int)b.getZ()+radi;
		for (int x = xmin; x <= xmax; x++) {
			for (int y = ymin; y <= ymax; y++) {
				for (int z = zmin; z <= zmax; z++) {
					if (b.getWorld().getBlockTypeIdAt(x, y, z) == 19){return true;}
				}
			}
		}
		return false;
	}
	/**
	 * 
	 * @param b
	 * @param radius
	 * @return
	 */
		public static boolean iswater(Block b, int radius){
			int xmin = (int)b.getX()-radius;
			int xmax = (int)b.getX()+radius;
			int ymin = (int)b.getY()-radius;
			int ymax = (int)b.getY()+radius;
			int zmin = (int)b.getZ()-radius;
			int zmax = (int)b.getZ()+radius;
			for (int x = xmin; x <= xmax; x++) {
				for (int y = ymin; y <= ymax; y++) {
					for (int z = zmin; z <= zmax; z++) {
						if (b.getWorld().getBlockTypeIdAt(x, y, z) == 8 || b.getWorld().getBlockTypeIdAt(x, y, z) == 9){return true;}
					}
				}
			}
		return false;
	  }
		
	    /**
	     * 
	     * Setup replace feature and radius
	     * @author Spenk
	     *
		 * @param player
		 * @param from
		 * @param to
		 * @param radius
		 */
	     public static void replace(Player player, int from, int to, int radius){
	         int xmin = (int)player.getLocation().getX()-radius;
	         int xmax = (int)player.getLocation().getX()+radius;
	         int ymin = (int)player.getLocation().getY()-radius;
	         int ymax = (int)player.getLocation().getY()+radius;
	         int zmin = (int)player.getLocation().getZ()-radius;
	         int zmax = (int)player.getLocation().getZ()+radius;
	        
	         for (int x = xmin; x <= xmax; x++) {
	                 for (int y = ymin; y <= ymax; y++) {
	                         for (int z = zmin; z <= zmax; z++) {    
	                                 if (player.getWorld().getBlockTypeIdAt(x, y, z) == from){player.getWorld().getBlockAt(x, y, z).setTypeId(to);}
	                         }
	                       }
	                     }
	                   }
	     
	     
	     /**
	      * Count mobs in the world the player perform the command
	      * @author Billyoyo
	      * @param r
	      */
	     public static void cMob(Player player, int r)
	     {
	       World world = player.getWorld();
	       for (int x = -r; x <= r; x++)
	         for (int z = -r; z <= r; z++)
	           for (int y = -r; y <= r; y++) {
	             Block check = world.getBlockAt((int)player.getLocation().getX() + x, (int)player.getLocation().getY() + y, (int)player.getLocation().getZ() + z);
	             for (Entity m : world.getEntities()) {
	               if (((int)m.getLocation().getX() == check.getX()) && ((int)m.getLocation().getY() == check.getY()) && ((int)m.getLocation().getZ() == check.getZ())) {
	                 m.remove();
	               }
	             }
	             for (Entity m : world.getEntities())
	               if (((int)m.getLocation().getX() == check.getX()) && ((int)m.getLocation().getY() == check.getY()) && ((int)m.getLocation().getZ() == check.getZ()))
	                 m.remove();
	          }
	        }
	     
	     }
//end of class