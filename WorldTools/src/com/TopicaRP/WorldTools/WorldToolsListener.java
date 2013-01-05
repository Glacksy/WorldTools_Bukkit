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

/**

 * @Author Glacksy & Spenk
 * @category World
 * @Version 2.0
 * 
 * @Description
 * tools for World
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class WorldToolsListener implements Listener {   
WorldToolsProperties properties = new WorldToolsProperties();
   /**
    * Block onExplosion related stuff
    * @author Glacksy
    */

   public boolean onExplode(Block block)
   {
	 if ((BlockTntExplosion) && (block.getStatus() == 1)) {
	   return true;
	 }
	 if ((BlockCreeperExplosion) && (block.getStatus() == 2)) {
		 if (!DisableCreeperDamage){
			for (Player player : etc.getServer().getPlayerList()) {
			    if (WorldToolsVoids.isInExplosionRadius(player, block)) {
			     player.setHealth(player.getHealth() - WorldToolsVoids.calculateDamage(player, block));
			    if (player.getHealth() < 1) {
			        player.dropInventory();}}}}
	   return true;
	 }
     if ((BlockGhastExplosion) && (block.getStatus() == 3)) {
       return true;
     }
     return false;
   }
   
   /**
    * Block Portal Creating
    * @author Glacksy
    */
   public boolean onPortalCreate(Block[][] blocks)
   {
	if (BlockPortalCreating)
	{
	  return true;
    }
	return false;
   }
   
   /**
    * Block Portal Destroying
    */
   public boolean onPortalDestroy(Block[][] blocks)
   {
	if (BlockPortalDestroying)
	{
		return true;
    }
	return false;
   }

   /**
    * Prevent enderman from picking up blocks
    */
   public boolean onEndermanPickup(Enderman entity, Block block)
   {
    if (DisableEndermanBlockPickup)
    {
	   return true;
    }
   return false;
   }



   /**
    * Block different types of fire stuff
    * @author Glacksy
    */
   public boolean onIgnite(Block block, Player player)
   {
     if ((BlockLavaFire) && (block.getStatus() == 1)) {
       return true;
     }
     if ((BlockLighter) && (block.getStatus() == 2))
     {
       return true;
     }
     if ((BlockFireSpread) && (block.getStatus() == 3)) {
       return true;
     }
     if ((BlockFireBlockDestory) && (block.getStatus() == 4)) {
         return true;
     }
     if ((BlockLightningFire) && (block.getStatus() == 5)) {
         return true;
     }
     return false;
   }
   
   /**
    * Disable water and lava flow with config
    * @author Glacksy
    */
   public boolean onFlow(Block blockFrom, Block blockTo)
   {
	if ((DisableWaterFlow) && (blockFrom.getType() == 8 || blockFrom.getType() == 9))
   {
		return true;
   }
	if ((DisableLavaFlow) && (blockFrom.getType() == 10 || blockFrom.getType() == 11))
   {
		return true;
   }
       if ((ClassicWater) && (blockFrom.getType() == 8) || (blockFrom.getType() == 9)) {
	      int bB = blockFrom.getWorld().getBlockIdAt(blockFrom.getX(), blockFrom.getY() - 1, blockFrom.getZ()); 
	      if ((bB != 0) && (bB != 8) && (bB != 9)) { 
	    	  blockFrom.getWorld().setBlockAt(9, blockFrom.getX(), blockFrom.getY(), blockFrom.getZ());
	        return false;
	    }
       }
	return false;
   }
	/**
	 * 
	 * TODO: damage values support
	 */
/*	if (DisallowLavaSpreadBlocks != null && blockFrom.getType() == 10 || blockFrom.getType() == 11) {
		int a1337 = blockFrom.getWorld().getBlockIdAt(blockTo.getX(), blockTo.getY() - 1, blockTo.getZ());
        if (!DisallowLavaSpreadBlocks.contains(a1337)) {
            return true;  //TODO: Test this code, added multiworld used to be etc.getServer
     //   }
    } */
//	return false;
  // }
	/**
	 * TODO: Multiworld support and damage values support (damage values impossibru :O)
	 * Does ONLY support default world at the moment
	 */
	/*if (DisallowWaterSpreadBlocks != null && blockFrom.getType() == 8 || blockFrom.getType() == 9) {
		int a1337 = etc.getServer().getWorld(0).getBlockIdAt(blockTo.getX(), blockTo.getY() - 1, blockTo.getZ());
        if (!DisallowLavaSpreadBlocks.contains(a1337)) {
            return true;
        }
    }
	return false;
   }*/
   
   /**
    * List of damage types which can be disabled
    */
   public boolean onDamage(PluginLoader.DamageType type, BaseEntity attacker, BaseEntity defender, int amount)
   {
     if (defender.isPlayer()) {
       defender.getPlayer();

       if ((DisableFallDamage) && (type == PluginLoader.DamageType.FALL)) {
         return true;
       }
       if ((DisableLavaDamage) && (type == PluginLoader.DamageType.LAVA)) {
         return true;
       }
       if ((DisableFireDamage) && ((type == PluginLoader.DamageType.FIRE))) { 
         return true;
       }
       if ((DisableFireTickDamage) && (type == PluginLoader.DamageType.FIRE_TICK)) {
           return true;
        }
       if ((DisableCactusDamage) && (type == PluginLoader.DamageType.CACTUS)) {
           return true;
       }
       if ((DisableEntityDamage) && (type == PluginLoader.DamageType.ENTITY)) {
           return true;
       }
       if ((DisableCreeperDamage) && (type == PluginLoader.DamageType.CREEPER_EXPLOSION)) {
           return true;
       }
       if ((DisableLightningDamage) && (type == PluginLoader.DamageType.LIGHTNING)) {
           return true;
       }
       if ((DisableStarvationDamage) && (type == PluginLoader.DamageType.STARVATION)) {
           return true;
         }
       if ((DisableSuffocationDamage) && (type == PluginLoader.DamageType.SUFFOCATION)) {
          return true;
         }
       if ((DisableWaterDamage) && (type == PluginLoader.DamageType.WATER)) {
           return true;
        }
       if ((DisablePotionDamage) && (type == PluginLoader.DamageType.POTION)) {
           return true;
        }
     }
       if (defender.getEntity() instanceof OEntityWolf){
				Wolf wolf = new Wolf((OEntityWolf) defender.getEntity());
				wolf.isTame(); {
    	  
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.FALL)) {
             return true;
           }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.LAVA)) {
             return true;
           }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.FIRE_TICK)) {
               return true;
            }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.CACTUS)) {
               return true;
           }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.LIGHTNING)) {
               return true;
           }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.SUFFOCATION)) {
              return true;
             }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.WATER)) {
               return true;
            }
           if ((AntiWolfDumbness) && (type == PluginLoader.DamageType.POTION)) {
               return true;
            }
           }
       }
			if (defender.getEntity() instanceof OEntityOcelot){
					Ocelot ocelot = new Ocelot((OEntityOcelot) defender.getEntity());
					ocelot.isTame(); {
	    	  
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.FALL)) {
	             return true;
	           }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.LAVA)) {
	             return true;
	           }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.FIRE_TICK)) {
	               return true;
	            }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.CACTUS)) {
	               return true;
	           }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.LIGHTNING)) {
	               return true;
	           }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.SUFFOCATION)) {
	              return true;
	             }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.WATER)) {
	               return true;
	            }
	           if ((AntiOcelotDumbness) && (type == PluginLoader.DamageType.POTION)) {
	               return true;
	            }
	           }
          }	      
     return false;
   }
   
   /**
    * Disable block physics
    */
   public boolean onBlockPhysics(Block block, boolean placed)
   {
     if ((DisablePhysicsGravel) && (block.getType() == 13)) {
       return true;
     }

     if ((DisablePhysicsSand) && (block.getType() == 12)) {
       return true;
     }
     if ((AllowPortalEverywhere) && (block.getType() == 90)) {
         return true;
       }
  return false;
   }
   
   /**
    * Disable LeafDecay
    */
   public boolean onLeafDecay(Block block)
   {
	   if (BlockLeafDecay) { 
		   String[] damages = leavetypes.split(",");
		   List<String> damagess = Arrays.asList(damages);
		   if (damagess.contains(block.getData())){
			   return true;
		   }
	    }
	   return false;   
   }
   
   /**
    * Block players from eating
    * This is also pointless but might be useful.
    */
   public boolean onEat(Player player,ItemStack item)
   {
	   if (BlockEating && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canEat")) {
		   return true;
	   }
	  return false; 
   }
   
   /**
    * Block Dispenser
    * This is also pointless
    */
   public boolean onDispense(Dispenser dispenser, BaseEntity tobedispensed)
   {
	   if (BlockDispenser) {
		   return true; //block it
	   }
	  return false;  // enable it
   }
   
   /**
    * Block any player from destrying farmland 
    * by jumping or walking on it.
    */
   public boolean onBlockUpdate(Block block)
   {
	   if ((FarmlandDestroy) && (block.getType() == 60)) {
		   return true;
	   }
	    if (BlockIceMelting && block.getType() == 79){
	    	return true;
	    }
	    if (BlockWaterFreezing && block.getType() == 9){
	    	return true;
	    }
	    if (BlockLavaObsidian && block.getType() == 11){
	    	return true;
	    }
	    if (BlockSnowMelting && block.getType() == 78){
	    	return true;
	    }
	  return false; 
   }
   
   /**
    * Disable mob despawning
    * This can cause serverside issues and lag
    * But the possibility is still here.. 
    */
   public boolean onEntityDespawn(BaseEntity entity)
   {
	   if (DisableEntityDespawning){  //TODO: add a list of mobs which shouldnt despawn
		   return true;
	   }
	  return false; 
   }
   
   /**
    * This is pointless but i prefer having the possibility.
    * Disable Cow Milking
    */
   public boolean onCowMilk(Player player, Mob cow)
   {
	   if (BlockCowMilking && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canMilk")) {
		   return true;
	   }
	  return false; 
   }
   
   /**
    * Disable lightning strikes
    */
   public boolean onLightningStrike(BaseEntity entity)
   {
	   if (DisableLightningStrike) {
		   return true;
	   }
	   
	   if ((DisablePigZombificatio) && (entity.isAnimal())) {
		   entity.destroy(); //destory the entity, should only destory pig but couldnt figure out how :o
		   return true;
	   }
	   
	  return false; 
   }
   
   /**
    * Disable Inventories
    * NOTE: THIS DOES NOT WORK FOR PLAYER INVENTORY ONLY DISPENSER,FURNACE AND SUCH
    * TODO: add a inventory list you want to disable (you do it lol)
    */
   public boolean onOpenInventory(Player player,Inventory inventory){
	   if (DisableInventories) { 
		   if (!player.canUseCommand("/ignoreinv") && !player.canUseCommand("/worldtools")){
			   if (inventory.getContentsSize() == 27){
				   player.sendMessage("§cYou cant open this inventory!");
				   return true;
			   }
			   if (inventory.getContentsSize() == 1){
				   player.sendMessage("§cYou can't open this inventory!");
				   return true;
			   }
			   if (inventory.getContentsSize() == 3){
				   player.sendMessage("§cYou can't open this inventory!");
				   return true;
			   }
			   if (inventory.getContentsSize() == 54){
				   player.sendMessage("§cYou can't open this inventory!");
				   return true;
			   }
		   }
		   return true;
	   }
	  return false; 
   }
   
   
   /**
    * Disable item pickup
    * TODO: blacklist of items which shouldnt be picked up with ignore command(cant work with damagevalues :))
    * pickup blacklist should be in props, should work with damage values
    */
   public boolean onItemPickUp(Player player, ItemEntity item)
   {
	   if (DisableItemPickup && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canPickup")) {
		   return true;
	   }
	  return false; 
   }
   
   /**
    * Disable item dropping
    * TODO: blacklist of items which shouldnt be dropped with ignore command(cant work with damagevalues :))
    * Same as above
    */
   public boolean onItemDrop(Player player, ItemEntity item)
   {
	   if (DisableItemDropping && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canDrop")) {
		   return true;
	   }
	  return false; 
   }
   
   /**
    * Disable weather from changing, this can cause problems if you enable it when its raining
    * cause then it will rain forever.
    */
   public boolean onWeatherChange(World world, boolean newValue)
   {
	   if (DisableWeather) {
		   if (etc.getServer().getDefaultWorld().isRaining()){
		   etc.getServer().getDefaultWorld().setRaining(false);}
		   return true;
	   }
	   if (AlwaysRaining) { 
		   if (etc.getServer().getDefaultWorld().isRaining()){   //have to clean and fix this afterwards
			   etc.getServer().getDefaultWorld().setRaining(true);} //TODO:  test this
		   return true;
	   }
	  return false; 
   }
   
   /**
    * Disable thunder weather from happening
    * TODO: Set weather thunder to normal weather only if the weather is thunder.
    */
   public boolean onThunderChange(World world, boolean newValue)
   {
	   if (DisableThunderWeather)  {
	       if (etc.getServer().getDefaultWorld().isThundering()){
	       etc.getServer().getDefaultWorld().setThundering(false);}
		   return true;
	   }
	  return false; 
   }
   
   /**
    * @author spenk
    * Prevent Changing of time.
    */
   public boolean onTimeChange(World world, long newValue)
   {
	   if (DisableNightTime){
		   if (etc.getServer().getDefaultWorld().getTime() < 18000){
		   etc.getServer().getDefaultWorld().setTime(0);
		   return false;
		   }
	   }
	   if (DisableDayTime){
		   if (etc.getServer().getDefaultWorld().getTime() > 18000){
		   etc.getServer().getDefaultWorld().setTime(18000);
		   return false;
		   } 
	   }
	  return false;
   }
  
     /**
      * sponge feature code
      * @author spenk
      */
public boolean onBlockCreate(Player player,Block block,Block blockClicked,int itemInHand){
	if (player.canUseCommand("/worldtools") || player.canUseCommand("/canPlaceSponge")){
		if (block != null){
		int type = block.getType();
	if (type == 19){
		if (rlsponge == false){
			WorldToolsVoids.airout(block,rad);
			return false;
		}
	}
	}
	return false;
	}
	return false;
}

public boolean onBlockDestroy(Player player,Block block){
	if (block.getType() == 19 || player.canUseCommand("/worldtools") || player.canUseCommand("/canBreakSponge")){
		if (rlsponge == false){
			WorldToolsVoids.replacewater(block,rad);
		return false;
		}
	}
	return false;
}

public boolean onBlockRightClick(Player player,Block block,Item itemInHand){
	if (block.getType() == 19 || player.canUseCommand("/worldtools") || player.canUseCommand("/useSponge")){
		if (rlsponge){
			if(WorldToolsVoids.iswater(block, rad)){
				WorldToolsVoids.airout(block,rad);
				return false;
			}else{
				WorldToolsVoids.fillarea(block,rad);
				return false;
			}
		}
		return false;
	}
	return false;
}
public PluginLoader.HookResult onTame(Player player,Mob wolf,boolean shouldSucceed){
	if (DisableWolfTame){
		if (player.canUseCommand("/worldtools")){
		return PluginLoader.HookResult.PREVENT_ACTION;
	}else{
		return PluginLoader.HookResult.DEFAULT_ACTION;
	}
}
	if (Instandtame){
		return PluginLoader.HookResult.ALLOW_ACTION;
	}
	return PluginLoader.HookResult.DEFAULT_ACTION;
}
public void onPlayerMove(Player player,Location from,Location to){
	if (teleporttootherworld){
		if (to.y > level && to.dimension == 0){
		if (world.equalsIgnoreCase("Nether")){
			World[] w = etc.getServer().getWorld(player.getWorld().getName());
			player.switchWorlds(w[1]);
			player.teleportTo(w[1].getSpawnLocation());
		}
		if (world.equalsIgnoreCase("End")){
			World[] w = etc.getServer().getWorld(player.getWorld().getName());
			player.switchWorlds(w[2]);
			player.teleportTo(w[1].getSpawnLocation());
		}
		}
	}
}
public boolean onHealthChange(Player player,int oldValue,int newValue){
	
	if ((TpHomeOnDeath) || (oldValue <= 0) || (newValue == 20)) {
        Warp loc = etc.getDataSource().getHome(player.getName());
        if (loc != null) {
          player.teleportTo(loc.Location);
        }
        return true;
   }
	
	if (newValue < 1){
		if (kickondeath){
			if (!player.canUseCommand("/worldtools")){
			reason = reason.replace("&", "§");
		player.kick(reason);	
		}	
	  }
	}
	return false;
}
/**
 * @function keep chunks loaded
 * @author Spenk
 */
public boolean onSignChange(Player player,Sign sign){
	PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/WorldToolsChunks.properties");
	if (sign.getText(1).equalsIgnoreCase("[LoadChunk]")){
		if (player.canUseCommand("/worldTools")){
			sign.setText(1, "[LoadChunk]");
			sign.update();
			Chunk c = sign.getWorld().getChunk(sign.getBlock());
			if (c == null){
				log.info("Chunk not found!");
				player.notify("Chunk not found!");
				return false;
			}
			if (f.containsKey(c.getX()+","+c.getZ())){
				player.notify("There is already an loadsign on this chunk!");
				return false;
			}
			WorldToolsVoids.savechunk(c.getX()+","+c.getZ(),sign.getX()+","+sign.getY()+","+sign.getZ());
			player.sendMessage("§2This chunk will be forever loaded from now!");
			return false;
		}
		player.notify("You are not allowed to place these signs!");
		return true;
	}
	return false;
}

public void onChunkUnload(Chunk chunk){
	PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/WorldToolsChunks.properties");
	if (f.containsKey(chunk.getX()+","+chunk.getZ())){
		String[] ia = f.getProperty(chunk.getX()+","+chunk.getZ()).split(",");
		int x =Integer.parseInt(ia[0]);
		int y =Integer.parseInt(ia[1]);
		int z =Integer.parseInt(ia[2]);
		if (chunk.getBlockIdAt(x, y, z) == 63 || chunk.getBlockIdAt(x, y, z) == 68){
			Sign s = (Sign)chunk.getWorld().getComplexBlock(x, y, z);
			if (s.getText(1).equalsIgnoreCase("[LoadChunk]")){
			chunk.getWorld().loadChunk(chunk.getX(),chunk.getZ());
			}
		}
	}
}
public boolean onBlockBreak(Player player,Block block){
	PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/WorldToolsChunks.properties");
	if (block.getType() == 63 || block.getType() == 68){
		Sign sign = (Sign)block.getWorld().getComplexBlock(block.getX(), block.getY(), block.getZ());
		if (sign.getText(1).equalsIgnoreCase("[LoadChunk]")){
			if (player.canUseCommand("/worldtools")){
			Chunk chunk = block.getWorld().getChunk(block);
			f.removeKey(chunk.getX()+","+chunk.getZ());
			player.sendMessage("§4Sign sucsessfully destroyed!");
			return false;
		}
			player.notify("You cant break this sign block!");
			return true;
		}
	}
	return false;
}

public void onPlayerMove(Player player, Location from, Location to) {
    if (frozen.contains(player.getName()))
      player.teleportTo(from);
  }
public void onLogin(Player player) {
    if (god.contains(player.getName()))
    if (god.contains(player.getName()))
      god.remove(player.getName());
      god.remove(player.getName());
  }

public boolean onDamage(PluginLoader.DamageType type, BaseEntity attacker, BaseEntity defender, int amount)
{
if ((defender.isPlayer()) && 
	      (god.contains(defender.getPlayer().getName()))) {
	      Player localplayer = defender.getPlayer();

	      if ((localplayer.canUseCommand("/godmode")) && 
	        (type.equals(PluginLoader.DamageType.ENTITY)) && 
	        (type.equals(PluginLoader.DamageType.CACTUS)) && 
	        (type.equals(PluginLoader.DamageType.FALL)) && 
	        (type.equals(PluginLoader.DamageType.FIRE)) && 
	        (type.equals(PluginLoader.DamageType.LAVA)) && 
	        (type.equals(PluginLoader.DamageType.SUFFOCATION)) && 
	        (type.equals(PluginLoader.DamageType.FIRE_TICK)) &&
	        (type.equals(PluginLoader.DamageType.CREEPER_EXPLOSION)) &&
	        (type.equals(PluginLoader.DamageType.EXPLOSION)) &&
	        (type.equals(PluginLoader.DamageType.POTION)) &&
	        (type.equals(PluginLoader.DamageType.STARVATION)) &&
	        (type.equals(PluginLoader.DamageType.WATER)) &&
	        (type.equals(PluginLoader.DamageType.LIGHTNING)))
	      {
	        return true;
	      }
	    }
return false;
}

public void onLogin(Player player)
{
  Location spawn = null;
  if (exactSpawn != null)
    spawn = exactSpawn;
  else {
    spawn = player.getWorld().getSpawnLocation();
  }

  if ((Math.abs(player.getX() - spawn.x) <= 12.0D) && (Math.abs(player.getZ() - spawn.z) <= 12.0D))
    player.teleport(spawn);
}

public boolean onHealthChange(Player player, int oldValue, int newValue) {
    Location spawn = null;
    if (exactSpawn != null)
      spawn = exactSpawn;
    else {
      spawn = player.getWorld().getSpawnLocation();
    }

    if ((oldValue <= 0) && (newValue == 20) && 
      (Math.abs(player.getX() - spawn.x) <= 12.0D) && (Math.abs(player.getZ() - spawn.z) <= 12.0D)) {
      player.teleport(spawn);
    }

    return false;
  }

}
//end of class
   