package com.TopicaRP.WorldTools;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

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

	static Player player;  
	WorldToolsProperties props = new WorldToolsProperties();
	
    /**
	 * Load and enable ExactSpawn feature
	 * This load onEnable
	 */
	public void EnableExactSpawn() {
		  if (props.ExactSpawn) {
			Location exactSpawn;
		    String[] data = props.ExactSpawnLoc.split(",");
		    double x = Double.parseDouble(data[0]);
		    double y = Double.parseDouble(data[1]);
			double z = Double.parseDouble(data[2]);
		    float  rotX = Float.parseFloat(data[3]);
		    float  rotY = Float.parseFloat(data[4]);
		    World  world = Bukkit.getWorld(data[5]);
		    exactSpawn = new Location(world, x, y, z, rotX, rotY);
		  }
	}
	/**
	 *
	 * @param b
	 * @param radius
	 */
	
	public boolean hasPermission(Player player, String permissionLabel){
		if (player.isOp()){
			return true;
		}
		WorldTools tools = new WorldTools();
		return tools.perms.has(player,permissionLabel);
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
	 * 
	 * @param b
	 * @param radius
	 */
	public static void replacewater(Block b, int radius){
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
					if (b.getWorld().getBlockTypeIdAt(x, y, z) == 8 || b.getWorld().getBlockTypeIdAt(x, y, z) == 9){b.getWorld().getBlockAt(x, y, z).setTypeId(9);}
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
	     public static void cMob(int r)
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
	     /**
	      * @param coords1
	      * @param coords2
	      */
	     public static void savechunk(String coords1,String coords2){
	    	 PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/WorldToolsChunks.properties");
	    	 f.getString(coords1,coords2);
	    	 }
	     
	     
	     }
//end of class