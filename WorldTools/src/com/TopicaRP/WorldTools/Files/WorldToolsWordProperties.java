package com.TopicaRP.WorldTools.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class WorldToolsWordProperties {
	String directory = "plugins/config/WorldTools/";
	Logger log = Logger.getLogger("minecraft");
	
	public void createFiles(){
	for(World w : Bukkit.getWorlds()){
		String worldName = w.getName();
		File worldFile = new File(directory+worldName);
		worldFile.mkdirs();
		File worldFileFile = new File(directory+worldName+"/WorldProperties.properties");
		try {
			worldFileFile.createNewFile();
		} catch (IOException e) {
			log.log(Level.SEVERE, "[WorldTools] Could not create WorldProperties files!");
		}
		createProperties(worldName);
	}
	}
	
	public void createProperties(String world){
		try {
			File f = new File(directory+world+"/WorldProperties.properties");
			BufferedWriter out = new BufferedWriter(new FileWriter(f));
			out.write("#==========================#"); out.newLine();
			out.write("#WorldTools Settings File#"); out.newLine();
			out.write("#Set it True to enable and false to disable"); out.newLine();
			out.write("#==========================#"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block fire from spreading"); out.newLine();
			out.write("block-fire-spread=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block lava from causing fire"); out.newLine();
			out.write("block-lava-fire=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block lighter from being used"); out.newLine();
			out.write("#To ignore this, give the player/group this permission: /lighter-usage "); out.newLine();
			out.write("block-lighter=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block Fire from destrying blocks"); out.newLine();
			out.write("block-fire-block-destroy=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block lightning from creating fire"); out.newLine();
			out.write("block-lightning-fire=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block creepers from causing world damage"); out.newLine();
			out.write("block-creeper-explosion=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block Ghasts from causing world and player damage"); out.newLine();
			out.write("block-ghast-explosion=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block nether portals from being activated"); out.newLine();
			out.write("block-nether-portal-creating=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block nether portals from being activated"); out.newLine();
			out.write("block-ender-portal-creating=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block nether portals from being destroyed"); out.newLine();
			out.write("block-nether-portal-destroying=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block ender portals from being destroyed"); out.newLine();
			out.write("block-ender-portal-destroying=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block TnT from dealing damage to player and world"); out.newLine();
			out.write("block-tnt-explosion=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable fall damage"); out.newLine();
			out.write("disable-fall-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable lava damage"); out.newLine();
			out.write("disable-lava-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Fire Damage"); out.newLine();
			out.write("disable-fire-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Firetick Damage"); out.newLine();
			out.write("disable-firetick-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable cactus damage"); out.newLine();
			out.write("disable-cactus-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Mob/Entity Damage"); out.newLine();
			out.write("disable-entity-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Creeper - player damage(not world damage)"); out.newLine();
			out.write("disable-creeper-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable lightning damage"); out.newLine();
			out.write("disable-lightning-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Hunger/Starvation damage"); out.newLine();
			out.write("disable-starvation-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable suffocation damage"); out.newLine();
			out.write("disable-suffocation-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Drowning/water Damage"); out.newLine();
			out.write("disable-drowning-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Potion Damage"); out.newLine();
			out.write("disable-potion-damage=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Water Flow"); out.newLine();
			out.write("disable-water-flow=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Lava Flow"); out.newLine();
			out.write("disable-lava-flow=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable sand physics"); out.newLine();
			out.write("disable-gravel-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable sand physics"); out.newLine();
			out.write("disable-sand-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable leaf decay"); out.newLine();
			out.write("disable-leaf-decay=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Leave DamageValues"); out.newLine();
			out.write("#these are leaves wich arnt allowed to decay"); out.newLine();
			out.write("Leave-DamageValues=0,1,2,3"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block cow milking"); out.newLine();
			out.write("#Its pointless but might be useful"); out.newLine();
			out.write("block-cow-milking=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block Players From Eating"); out.newLine();
			out.write("block-eating=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Block Dispensers from shooting"); out.newLine();
			out.write("block-dispensers=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#block players / mobs from destrying farmland by walking and jumping on it"); out.newLine();
			out.write("block-farmland-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#block Ice from melting"); out.newLine();
			out.write("block-Ice-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#block snow from melting"); out.newLine();
			out.write("block-snow-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#block Water from Freezing"); out.newLine();
			out.write("block-Water-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#block Lava from turning into obsidian"); out.newLine();
			out.write("block-Lava-physics=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Entity Despawning"); out.newLine();
			out.write("disable-entity-despawning=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Lightning Strikes"); out.newLine();
			out.write("disable-lightning-strike=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Inventories, this does not work for player inventory only furnace,dispenser,chest..etc.."); out.newLine();
			out.write("disable-inventories=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Item Pickup"); out.newLine();
			out.write("disable-item-pickup=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Item Dropping"); out.newLine();
			out.write("disable-item-dropping=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Anti Wolf dumbness."); out.newLine();
			out.write("anti-wolf-dumbness=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Anti Ocelot dumbness."); out.newLine();
			out.write("anti-ocelot-dumbness=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable weather"); out.newLine();
			out.write("disable-weather=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Thunder Weather"); out.newLine();
			out.write("disable-thunder-weather=false"); out.newLine();
			out.write(" "); out.newLine();
	        out.write("#Force rain and snow on all the time."); out.newLine();
			out.write("always-raining=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Night Time/Skip Night Time"); out.newLine();
			out.write("disable-night-time=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Disable Day Time/Skip Day Time"); out.newLine();
			out.write("disable-day-time=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Restore the functionality of sponges to remove water"); out.newLine();
			out.write("#when placed and rightclicked"); out.newLine();
			out.write("#Permissions: /useSponge, /canPlaceSponge, /canDestroySponge"); out.newLine();
			out.write("use-sponge=false"); out.newLine();
			out.write("sponge-radius=2"); out.newLine();
	        out.write(" "); out.newLine();
			out.write("#ExactSpawn"); out.newLine();
			out.write("enable-exact-spawn=true"); out.newLine();
	        out.write(" "); out.newLine();
	        out.write("#ExactSpawn x,y,z,rotation,pitch,World"); out.newLine();
	        out.write("exact-spawn-location=0,0,0,0,0,world"); out.newLine();
	        out.write(" "); out.newLine();
			out.write("#Classic water simulation"); out.newLine();
			out.write("classic-water=false"); out.newLine();
	        out.write(" "); out.newLine();
			out.write("#Prevent enderman from picking up blocks"); out.newLine();
			out.write("disable-enderman-pickup=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Prevent Wolfs from being tamed"); out.newLine();
			out.write("prevent-wolf-tame=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Instand Tame wolfs"); out.newLine();
			out.write("instand-tame=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Prevent lightning from turning a pig in to a pigzombie!"); out.newLine();
			out.write("disable-pig-zombification=false"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Teleport an player to the nether/end when he reaches a certain level"); out.newLine();
			out.write("Teleport-Player-OnReachLayer=false"); out.newLine();
			out.write("#World to teleport player when he reaches an certain level (choose Nether or End)"); out.newLine();
			out.write("World-To-Teleport-Player-To=Nether"); out.newLine();
			out.write("#Y level wich a player needs to reach to get teleported (- values are accepted)"); out.newLine();
			out.write("Y-Level=-1"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Kick a player on death"); out.newLine();
			out.write("Kick-on-Death=false"); out.newLine();
			out.write("#Kick Message - Reason (use &colorcode for colors)"); out.newLine();
			out.write("Reason=&cYou died :/ Please rejoin"); out.newLine();
			out.write(" "); out.newLine();
			out.write("#Allow portal placement everywhere"); out.newLine();
			out.write("allow-portal-everywhere=false"); out.newLine();
			out.newLine(); 
			out.close();
		}catch (IOException e){
			log.log(Level.SEVERE,"[WorldTools] - Couldn't Create Settings File!");
		}
	}
	
	/*public void loadprops(String file){
	  properties = new PropertiesFile(file);
	  
	  // Anti Grief protections
	  BlockFireSpread =Boolean.parseBoolean(properties.getProperty("block-fire-spread"));
	  BlockLavaFire = Boolean.parseBoolean(properties.getProperty("block-lava-fire"));
	  BlockLighter = Boolean.parseBoolean(properties.getProperty("block-lighter"));
	  BlockFireBlockDestory = Boolean.parseBoolean(properties.getProperty("block-fire-block-destroy"));
	  BlockLightningFire = Boolean.parseBoolean(properties.getProperty("block-lightning-fire"));
	  BlockCreeperExplosion = Boolean.parseBoolean(properties.getProperty("block-creeper-explosion"));
	  BlockGhastExplosion = Boolean.parseBoolean(properties.getProperty("block-ghast-explosion"));
	  BlockPortalNetherCreating = Boolean.parseBoolean(properties.getProperty("block-nether-portal-creating"));
	  BlockPortalEnderCreating = Boolean.parseBoolean(properties.getProperty("block-ender-portal-creating"));
	  BlockPortalEnderDestroying = Boolean.parseBoolean(properties.getProperty("block-ender-portal-destroying"));
	  BlockPortalNetherDestroying = Boolean.parseBoolean(properties.getProperty("block-nether-portal-destroying"));
	  BlockTntExplosion = Boolean.parseBoolean(properties.getProperty("block-tnt-explosion"));
	  
	  // Disable different damage types
	  DisableFallDamage = Boolean.parseBoolean(properties.getProperty("disable-fall-damage"));
	  DisableLavaDamage = Boolean.parseBoolean(properties.getProperty("disable-lava-damage"));
	  DisableFireDamage = Boolean.parseBoolean(properties.getProperty("disable-fire-damage"));
	  DisableFireTickDamage = Boolean.parseBoolean(properties.getProperty("disable-firetick-damage"));
	  DisableCactusDamage = Boolean.parseBoolean(properties.getProperty("disable-cactus-damage"));
	  DisableEntityDamage = Boolean.parseBoolean(properties.getProperty("disable-entity-damage"));
	  DisableCreeperDamage = Boolean.parseBoolean(properties.getProperty("disable-creeper-damage"));
	  DisableLightningDamage = Boolean.parseBoolean(properties.getProperty("disable-lightning-damage"));
	  DisableStarvationDamage = Boolean.parseBoolean(properties.getProperty("disable-starvation-damage"));
	  DisableSuffocationDamage = Boolean.parseBoolean(properties.getProperty("disable-suffocation-damage"));
	  DisableWaterDamage = Boolean.parseBoolean(properties.getProperty("disable-drowning-damage"));
	  DisablePotionDamage = Boolean.parseBoolean(properties.getProperty("disable-potion-damage"));
	  DisableWaterFlow = Boolean.parseBoolean(properties.getProperty("disable-water-flow"));
	  DisableLavaFlow = Boolean.parseBoolean(properties.getProperty("disable-lava-flow"));
	  
	 //Disable lava, fire and water spread on custom blocks
//  DisallowFireSpreadBlocks = toBlockIDSet(properties.getProperty("disallowed-fire-spread-blocks"));
//  DisallowLavaSpreadBlocks = toBlockIDSet(properties.getProperty("disallowed-lava-spread-blocks"));
//  DisallowWaterSpreadBlocks = toBlockIDSet(properties.getProperty("disallowed-water-spread-blocks"));

// Other Random Stuff
	  //AllowPortalEverywhere = Boolean.parseBoolean(properties.getProperty("allow-portal-everywhere"));
	  BlockSnowMelting = Boolean.parseBoolean(properties.getProperty("block-snow-physics"));
	  AntiOcelotDumbness = Boolean.parseBoolean(properties.getProperty("anti-ocelot-dumbness"));
	  AntiWolfDumbness = Boolean.parseBoolean(properties.getProperty("anti-wolf-dumbness"));
    DisablePhysicsGravel = Boolean.parseBoolean(properties.getProperty("disable-gravel-physics"));
    DisablePhysicsSand = Boolean.parseBoolean(properties.getProperty("disable-sand-physics"));
    BlockLeafDecay = Boolean.parseBoolean(properties.getProperty("disable-leaf-decay"));
    leavetypes = properties.getProperty("Leave-DamageValues");
    BlockCowMilking = Boolean.parseBoolean(properties.getProperty("block-cow-milking"));
    BlockEating = Boolean.parseBoolean(properties.getProperty("block-eating"));
    BlockDispenser = Boolean.parseBoolean(properties.getProperty("block-dispensers"));
    FarmlandDestroy = Boolean.parseBoolean(properties.getProperty("block-farmland-physics"));
    DisableEntityDespawning = Boolean.parseBoolean(properties.getProperty("disable-entity-despawning"));
    DisableLightningStrike = Boolean.parseBoolean(properties.getProperty("disable-lightning-strike"));
    DisableInventories = Boolean.parseBoolean(properties.getProperty("disable-inventories"));
    DisableItemPickup = Boolean.parseBoolean(properties.getProperty("disable-item-pickup"));
    DisableItemDropping = Boolean.parseBoolean(properties.getProperty("disable-item-dropping"));
    DisableWeather = Boolean.parseBoolean(properties.getProperty("disable-weather"));
    DisableThunderWeather = Boolean.parseBoolean(properties.getProperty("disable-thunder-weather"));
    DisableNightTime = Boolean.parseBoolean(properties.getProperty("disable-night-time"));
    AlwaysRaining = Boolean.parseBoolean(properties.getProperty("always-raining"));
    ClassicWater = Boolean.parseBoolean(properties.getProperty("classic-water"));
    DisableEndermanBlockPickup = Boolean.parseBoolean(properties.getProperty("disable-enderman-pickup"));   
    DisableDayTime = Boolean.parseBoolean(properties.getProperty("disable-day-time"));
    DisableWolfTame = Boolean.parseBoolean(properties.getProperty("prevent-wolf-tame"));
    Instandtame = Boolean.parseBoolean(properties.getProperty("instant-tame"));
    DisablePigZombificatio = Boolean.parseBoolean(properties.getProperty("disable-pig-zombification"));
    teleporttootherworld = Boolean.parseBoolean(properties.getProperty("Teleport-Player-OnReachLayer"));
    world = properties.getProperty("World-To-Teleport-Player-To");
    try{level = Integer.parseInt(properties.getProperty("Y-Level"));}catch(NumberFormatException nfe){log.info("[WorldTools] - The Y-Level must be an number!"); level = -1;}
    BlockIceMelting = Boolean.parseBoolean(properties.getProperty("block-Ice-physics"));
    BlockWaterFreezing = Boolean.parseBoolean(properties.getProperty("block-Water-physics"));
    BlockLavaObsidian = Boolean.parseBoolean(properties.getProperty("block-Lava-physics"));
    
    ExactSpawn = Boolean.parseBoolean(properties.getProperty("enable-exact-spawn"));
    ExactSpawnLoc = properties.getProperty("enable-exact-location");

// ExactSpawn = Boolean.parseBoolean(properties.getProperty("disable-exact-spawn"));

rlsponge = Boolean.parseBoolean(properties.getProperty("use-sponge"));
	  try{ rad = Integer.parseInt(properties.getProperty("sponge-radius"));}catch(NumberFormatException nfe){log.info("[WorldTools] - The sponge radius must be an number!"); rad = 2;}
}*/
//TODO add individual getter & setter for eatch option above in Files.WorldProperties.java


}
