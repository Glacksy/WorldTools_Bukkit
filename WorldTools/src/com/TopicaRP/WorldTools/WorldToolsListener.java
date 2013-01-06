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

import net.minecraft.server.v1_4_6.EntityOcelot;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

public class WorldToolsListener implements Listener {   
WorldToolsProperties properties = new WorldToolsProperties();
   /**
    * Block onExplosion related stuff
    * @author Glacksy
    */

   public boolean onExplode(Block block)
   {
	 if ((properties.BlockTntExplosion) && (block.getStatus() == 1)) {
	   event.setCancelled(true);return;
	 }
	 if ((properties.BlockCreeperExplosion) && (block.getStatus() == 2)) {
		 if (!properties.DisableCreeperDamage){
			for (Player player : Bukkit.getServer().getOnlinePlayers()) {
			    if (WorldToolsVoids.isInExplosionRadius(player, block)) {
			     player.setHealth(player.getHealth() - WorldToolsVoids.calculateDamage(player, block));
			    if (player.getHealth() < 1) {
			        player.dropInventory();}}}}
	   event.setCancelled(true);return;
	 }
     if ((properties.BlockGhastExplosion) && (block.getStatus() == 3)) {
       event.setCancelled(true);return;
     }
     return;
   }
   
   /**
    * Block Portal Creating
    * @author Glacksy
    */
   public boolean onPortalCreate(Block[][] blocks)
   {
	if (properties.BlockPortalCreating)
	{
	  event.setCancelled(true);return;
    }
	return;
   }
   
   /**
    * Block Portal Destroying
    */
   public boolean onPortalDestroy(Block[][] blocks)
   {
	if (properties.BlockPortalDestroying)
	{
		event.setCancelled(true);return;
    }
	return;
   }

   /**
    * Prevent enderman from picking up blocks
    */
   public boolean onEndermanPickup(Enderman entity, Block block)
   {
    if (properties.DisableEndermanBlockPickup)
    {
	   event.setCancelled(true);return;
    }
   return;
   }



   /**
    * Block different types of fire stuff
    * @author Glacksy
    */
   @EventHandler
   public void onBlockIgnite(BlockIgniteEvent event)
   {
	   Block block = event.getBlock();
	   IgniteCause cause = event.getCause();
     if ((properties.BlockLavaFire) && (cause == IgniteCause.LAVA)) {
       event.setCancelled(true);
       return;
     }
     if ((properties.BlockLighter) && (cause == IgniteCause.FLINT_AND_STEEL)
     {
         event.setCancelled(true);
         return;
     }
     if ((properties.BlockFireSpread) && (cause == IgniteCause.FIREBALL) {
         event.setCancelled(true);
         return;
     }
     if ((properties.BlockFireBlockDestory) && (cause == IgniteCause.FIREBALL) {
         event.setCancelled(true);
         return;
     }
     if ((properties.BlockLightningFire) && (cause == IgniteCause.LIGHTNING) {
         event.setCancelled(true);
         return;
     }
     return;
   }
   
   /**
    * Disable water and lava flow with config
    * @author Glacksy
    */
   @EventHandler
   public void onBlockFromTo(BlockFromToEvent event)
   {
	   Block blockFrom = event.getBlock();
	   Block blockTo = event.getToBlock();
	if ((properties.DisableWaterFlow) && (blockFrom.getTypeId() == 8 || blockFrom.getTypeId() == 9))
   {
		event.setCancelled(true);
		return;
   }
	if ((properties.DisableLavaFlow) && (blockFrom.getTypeId() == 10 || blockFrom.getTypeId() == 11))
   {
		event.setCancelled(true);
		return;
   }
       if ((properties.ClassicWater) && (blockFrom.getTypeId() == 8) || (blockFrom.getTypeId() == 9)) {
	      int bB = blockFrom.getWorld().getBlockTypeIdAt(blockFrom.getX(), blockFrom.getY() - 1, blockFrom.getZ()); 
	      if ((bB != 0) && (bB != 8) && (bB != 9)) { 
	    	  blockFrom.getWorld().getBlockAt(blockFrom.getX(), blockFrom.getY(), blockFrom.getZ()).setTypeId(9);
	    	  return;
	    }
       }
	return;
   }
	/**
	 * 
	 * TODO: damage values support
	 */
/*	if (DisallowLavaSpreadBlocks != null && blockFrom.getTypeId() == 10 || blockFrom.getTypeId() == 11) {
		int a1337 = blockFrom.getWorld().getBlockTypeIdAt(blockTo.getX(), blockTo.getY() - 1, blockTo.getZ());
        if (!DisallowLavaSpreadBlocks.contains(a1337)) {
            event.setCancelled(true);return;  //TODO: Test this code, added multiworld used to be etc.getServer
     //   }
    } */
//	return;
  // }
	/**
	 * TODO: Multiworld support and damage values support (damage values impossibru :O)
	 * Does ONLY support default world at the moment
	 */
	/*if (DisallowWaterSpreadBlocks != null && blockFrom.getTypeId() == 8 || blockFrom.getTypeId() == 9) {
		int a1337 = etc.getServer().getWorld(0).getBlockTypeIdAt(blockTo.getX(), blockTo.getY() - 1, blockTo.getZ());
        if (!DisallowLavaSpreadBlocks.contains(a1337)) {
            event.setCancelled(true);return;
        }
    }
	return;
   }*/
   
   /**
    * List of damage types which can be disabled
    */
   @EventHandler
   public void onEntityDamageByBlock(EntityDamageByBlockEvent event)
   {
	   Entity e = event.getEntity();
	   DamageCause type = event.getCause();
     if (e instanceof Player) {
       Player player = ((Player) e).getPlayer();

       if ((properties.DisableFallDamage) && (type == DamageCause.FALL)) {
         event.setCancelled(true);
         return;
       }
       if ((properties.DisableLavaDamage) && (type == DamageCause.LAVA)) {
         event.setCancelled(true);return;
       }
       if ((properties.DisableFireDamage) && ((type == DamageCause.FIRE))) { 
         event.setCancelled(true);return;
       }
       if ((properties.DisableFireTickDamage) && (type == DamageCause.FIRE_TICK)) {
           event.setCancelled(true);return;
        }
       if ((properties.DisableCactusDamage) && (type == DamageCause.CONTACT)) {
           event.setCancelled(true);return;
       }
       if ((properties.DisableEntityDamage) && (type == DamageCause.ENTITY_ATTACK)) {
           event.setCancelled(true);return;
       }
       if ((properties.DisableCreeperDamage) && (type == DamageCause.ENTITY_EXPLOSION)) {
           event.setCancelled(true);return;
       }
       if ((properties.DisableLightningDamage) && (type == DamageCause.LIGHTNING)) {
           event.setCancelled(true);return;
       }
       if ((properties.DisableStarvationDamage) && (type == DamageCause.STARVATION)) {
           event.setCancelled(true);return;
         }
       if ((properties.DisableSuffocationDamage) && (type == DamageCause.SUFFOCATION)) {
          event.setCancelled(true);return;
         }
       if ((properties.DisableWaterDamage) && (type == DamageCause.DROWNING)) {
           event.setCancelled(true);return;
        }
       if ((properties.DisablePotionDamage) && (type == DamageCause.POISON)) {
           event.setCancelled(true);return;
        }
     }
       if (e instanceof Wolf){
				Wolf wolf = (Wolf) e;
				wolf.isTamed(); {
    	  
           if ((properties.AntiWolfDumbness) && (type == DamageCause.FALL)) {
             event.setCancelled(true);return;
           }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.LAVA)) {
             event.setCancelled(true);return;
           }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.FIRE_TICK)) {
               event.setCancelled(true);return;
            }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.CONTACT)) {
               event.setCancelled(true);return;
           }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.LIGHTNING)) {
               event.setCancelled(true);return;
           }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.SUFFOCATION)) {
              event.setCancelled(true);return;
             }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.DROWNING)) {
               event.setCancelled(true);return;
            }
           if ((properties.AntiWolfDumbness) && (type == DamageCause.POISON)) {
               event.setCancelled(true);return;
            }
           }
       }
			if (e instanceof Ocelot){
					Ocelot ocelot = (Ocelot)e;
					if (ocelot.isTamed()){
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.FALL)) {
	             event.setCancelled(true);return;
	           }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.LAVA)) {
	             event.setCancelled(true);return;
	           }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.FIRE_TICK)) {
	               event.setCancelled(true);return;
	            }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.CONTACT)) {
	               event.setCancelled(true);return;
	           }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.LIGHTNING)) {
	               event.setCancelled(true);return;
	           }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.SUFFOCATION)) {
	              event.setCancelled(true);return;
	             }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.DROWNING)) {
	               event.setCancelled(true);return;
	            }
	           if ((properties.AntiOcelotDumbness) && (type == DamageCause.POISON)) {
	               event.setCancelled(true);return;
	            }
	           }
          }	      
     return;
   }
   
   /**
    * Disable block physics
    */
   @EventHandler
   public void onBlockPhysics(BlockPhysicsEvent event)
   {
	   Block block = event.getBlock();
     if ((properties.DisablePhysicsGravel) && (block.getTypeId() == 13)) {
       event.setCancelled(true);
       return;
     }

     if ((properties.DisablePhysicsSand) && (block.getTypeId() == 12)) {
         event.setCancelled(true);
         return;
     }
     if ((properties.AllowPortalEverywhere) && (block.getTypeId() == 90)) {
         event.setCancelled(true);
         return;
       }
  return;
   }
   
   /**
    * Disable LeafDecay
    */
   @EventHandler
   public void onLeavesDecay(LeavesDecayEvent event)
   {
	   Block block = event.getBlock();
	   if (properties.BlockLeafDecay) { 
		   String[] damages = properties.leavetypes.split(",");
		   List<String> damagess = Arrays.asList(damages);
		   if (damagess.contains(block.getData())){
			   event.setCancelled(true);
			   return;
		   }
	    }
	   return;  
   }
   
   /**
    * Block players from eating
    * This is also pointless but might be useful.
    */
   public boolean onEat(Player player,ItemStack item)
   {
	   if (properties.BlockEating && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canEat")) {
		   event.setCancelled(true);return;
	   }
	  return; 
   }
   
   /**
    * Block Dispenser
    * This is also pointless
    */
@EventHandler
   public void onBlockDispense(BlockDispenseEvent event)
   {
	   if (properties.BlockDispenser) {
		   event.setCancelled(true);
		   return;
	   }
	  return;
   }
//TODO add unallowed dispenable items
   
   /**
    * Block any player from destrying farmland 
    * by jumping or walking on it.
    */
@EventHandler
   public void onBlockForm(BlockFormEvent event)
   {
	Block block = event.getBlock();
	   if ((properties.FarmlandDestroy) && (block.getTypeId() == 60)) {
		   event.setCancelled(true);
		   return;
	   }
	    if (properties.BlockIceMelting && block.getTypeId() == 79){
	    	event.setCancelled(true);
			return;
	    }
	    if (properties.BlockWaterFreezing && block.getTypeId() == 9){
	    	event.setCancelled(true);
			return;
	    }
	    if (properties.BlockLavaObsidian && block.getTypeId() == 11){
	    	event.setCancelled(true);
			return;
	    }
	    if (properties.BlockSnowMelting && block.getTypeId() == 78){
	    	event.setCancelled(true);
			return;
	    }
	  return;
   }
   
   /**
    * Disable mob despawning
    * This can cause serverside issues and lag
    * But the possibility is still here.. 
    */
   public boolean onEntityDespawn(BaseEntity entity)
   {
	   if (DisableEntityDespawning){  //TODO: add a list of mobs which shouldnt despawn
		   event.setCancelled(true);return;
	   }
	  return; 
   }
   
   /**
    * This is pointless but i prefer having the possibility.
    * Disable Cow Milking
    */
   public boolean onCowMilk(Player player, Mob cow)
   {
	   if (BlockCowMilking && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canMilk")) {
		   event.setCancelled(true);return;
	   }
	  return; 
   }
   
   /**
    * Disable lightning strikes
    */
   public boolean onLightningStrike(BaseEntity entity)
   {
	   if (DisableLightningStrike) {
		   event.setCancelled(true);return;
	   }
	   
	   if ((DisablePigZombificatio) && (entity.isAnimal())) {
		   entity.destroy(); //destory the entity, should only destory pig but couldnt figure out how :o
		   event.setCancelled(true);return;
	   }
	   
	  return; 
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
				   event.setCancelled(true);return;
			   }
			   if (inventory.getContentsSize() == 1){
				   player.sendMessage("§cYou can't open this inventory!");
				   event.setCancelled(true);return;
			   }
			   if (inventory.getContentsSize() == 3){
				   player.sendMessage("§cYou can't open this inventory!");
				   event.setCancelled(true);return;
			   }
			   if (inventory.getContentsSize() == 54){
				   player.sendMessage("§cYou can't open this inventory!");
				   event.setCancelled(true);return;
			   }
		   }
		   event.setCancelled(true);return;
	   }
	  return; 
   }
   
   
   /**
    * Disable item pickup
    * TODO: blacklist of items which shouldnt be picked up with ignore command(cant work with damagevalues :))
    * pickup blacklist should be in props, should work with damage values
    */
   public boolean onItemPickUp(Player player, ItemEntity item)
   {
	   if (DisableItemPickup && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canPickup")) {
		   event.setCancelled(true);return;
	   }
	  return; 
   }
   
   /**
    * Disable item dropping
    * TODO: blacklist of items which shouldnt be dropped with ignore command(cant work with damagevalues :))
    * Same as above
    */
   public boolean onItemDrop(Player player, ItemEntity item)
   {
	   if (DisableItemDropping && !player.canUseCommand("/worldtools") && !player.canUseCommand("/canDrop")) {
		   event.setCancelled(true);return;
	   }
	  return; 
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
		   event.setCancelled(true);return;
	   }
	   if (AlwaysRaining) { 
		   if (etc.getServer().getDefaultWorld().isRaining()){   //have to clean and fix this afterwards
			   etc.getServer().getDefaultWorld().setRaining(true);} //TODO:  test this
		   event.setCancelled(true);return;
	   }
	  return; 
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
		   event.setCancelled(true);return;
	   }
	  return; 
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
		   return;
		   }
	   }
	   if (DisableDayTime){
		   if (etc.getServer().getDefaultWorld().getTime() > 18000){
		   etc.getServer().getDefaultWorld().setTime(18000);
		   return;
		   } 
	   }
	  return;
   }
  
     /**
      * sponge feature code
      * @author spenk
      */
public boolean onBlockCreate(Player player,Block block,Block blockClicked,int itemInHand){
	if (player.canUseCommand("/worldtools") || player.canUseCommand("/canPlaceSponge")){
		if (block != null){
		int type = block.getTypeId();
	if (type == 19){
		if (rlsponge == false){
			WorldToolsVoids.airout(block,rad);
			return;
		}
	}
	}
	return;
	}
	return;
}

public boolean onBlockDestroy(Player player,Block block){
	if (block.getTypeId() == 19 || player.canUseCommand("/worldtools") || player.canUseCommand("/canBreakSponge")){
		if (rlsponge == false){
			WorldToolsVoids.replacewater(block,rad);
		return;
		}
	}
	return;
}

public boolean onBlockRightClick(Player player,Block block,Item itemInHand){
	if (block.getTypeId() == 19 || player.canUseCommand("/worldtools") || player.canUseCommand("/useSponge")){
		if (rlsponge){
			if(WorldToolsVoids.iswater(block, rad)){
				WorldToolsVoids.airout(block,rad);
				return;
			}else{
				WorldToolsVoids.fillarea(block,rad);
				return;
			}
		}
		return;
	}
	return;
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
        event.setCancelled(true);return;
   }
	
	if (newValue < 1){
		if (kickondeath){
			if (!player.canUseCommand("/worldtools")){
			reason = reason.replace("&", "§");
		player.kick(reason);	
		}	
	  }
	}
	return;
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
				return;
			}
			if (f.containsKey(c.getX()+","+c.getZ())){
				player.notify("There is already an loadsign on this chunk!");
				return;
			}
			WorldToolsVoids.savechunk(c.getX()+","+c.getZ(),sign.getX()+","+sign.getY()+","+sign.getZ());
			player.sendMessage("§2This chunk will be forever loaded from now!");
			return;
		}
		player.notify("You are not allowed to place these signs!");
		event.setCancelled(true);return;
	}
	return;
}

public void onChunkUnload(Chunk chunk){
	PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/WorldToolsChunks.properties");
	if (f.containsKey(chunk.getX()+","+chunk.getZ())){
		String[] ia = f.getProperty(chunk.getX()+","+chunk.getZ()).split(",");
		int x =Integer.parseInt(ia[0]);
		int y =Integer.parseInt(ia[1]);
		int z =Integer.parseInt(ia[2]);
		if (chunk.getBlockTypeIdAt(x, y, z) == 63 || chunk.getBlockTypeIdAt(x, y, z) == 68){
			Sign s = (Sign)chunk.getWorld().getComplexBlock(x, y, z);
			if (s.getText(1).equalsIgnoreCase("[LoadChunk]")){
			chunk.getWorld().loadChunk(chunk.getX(),chunk.getZ());
			}
		}
	}
}
public boolean onBlockBreak(Player player,Block block){
	PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/WorldToolsChunks.properties");
	if (block.getTypeId() == 63 || block.getTypeId() == 68){
		Sign sign = (Sign)block.getWorld().getComplexBlock(block.getX(), block.getY(), block.getZ());
		if (sign.getText(1).equalsIgnoreCase("[LoadChunk]")){
			if (player.canUseCommand("/worldtools")){
			Chunk chunk = block.getWorld().getChunk(block);
			f.removeKey(chunk.getX()+","+chunk.getZ());
			player.sendMessage("§4Sign sucsessfully destroyed!");
			return;
		}
			player.notify("You cant break this sign block!");
			event.setCancelled(true);return;
		}
	}
	return;
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

public boolean onDamage(DamageCause type, BaseEntity attacker, BaseEntity defender, int amount)
{
if ((defender.isPlayer()) && 
	      (god.contains(defender.getPlayer().getName()))) {
	      Player localplayer = defender.getPlayer();

	      if ((localplayer.canUseCommand("/godmode")) && 
	        (type.equals(DamageCause.ENTITY)) && 
	        (type.equals(DamageCause.CACTUS)) && 
	        (type.equals(DamageCause.FALL)) && 
	        (type.equals(DamageCause.FIRE)) && 
	        (type.equals(DamageCause.LAVA)) && 
	        (type.equals(DamageCause.SUFFOCATION)) && 
	        (type.equals(DamageCause.FIRE_TICK)) &&
	        (type.equals(DamageCause.CREEPER_EXPLOSION)) &&
	        (type.equals(DamageCause.EXPLOSION)) &&
	        (type.equals(DamageCause.POTION)) &&
	        (type.equals(DamageCause.STARVATION)) &&
	        (type.equals(DamageCause.WATER)) &&
	        (type.equals(DamageCause.LIGHTNING)))
	      {
	        event.setCancelled(true);return;
	      }
	    }
return;
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

    return;
  }

}
//end of class
   