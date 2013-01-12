package com.TopicaRP.WorldTools;
/*
 * WorldTools
 * Copyright (C) 2012
 *
 * This program is free software: you can redistribute it andor modify
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
 * along with this program. If not, see <http:www.gnu.orglicenses>.
 */

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Spenk & Glacksy
 * @category player Listener
 * @version 1.0
 * 
 * @description
 * tools for players
 * and admins
 *
 */
public class PlayerTools{
	
	public boolean isCommandEnabled(String c){
		return false;//some thing to check if a command is enabled
		// add feature to set in properties
	}
	
	public boolean isPlayer(CommandSender s){
		if (s instanceof Player){
			return true;
		}
		return false;
	}
	
	public Player getPlayerFromSender(CommandSender s){
		if (s instanceof Player){
			return (Player)s;
		}
		return null;
	}
	
	WorldTools w = new WorldTools();
	World world;
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("Tree") && w.perms.has(sender, "WorldTools.tree") && isCommandEnabled("tree")){
			//generate a tree /tree <type>
		}
		if (label.equalsIgnoreCase("Break") && w.perms.has(sender, "WorldTools.break") && isCommandEnabled("break")){
			//breaks blocks you are looking at /break (radius)
		}
		if (label.equalsIgnoreCase("Explode") && w.perms.has(sender, "WorldTools.explode") && isCommandEnabled("explode")){
			//generate a tree /explode (radius) || /explode (player) mess with power, createfire, breakblocks
		}
		if (label.equalsIgnoreCase("Explode") && w.perms.has(sender, "WorldTools.explode") && isCommandEnabled("explode")){
			//generate a tree /explode (radius) || /explode (player) mess with power, createfire, breakblocks
		}
		if (label.equalsIgnoreCase("Enchant") && w.perms.has(sender, "WorldTools.enchant") && isCommandEnabled("enchant")){
			//enchant command /enchant type power etc etc
		}
		if (label.equalsIgnoreCase("Feed") && w.perms.has(sender, "WorldTools.feed") && isCommandEnabled("feed")){
			//feed a player or yourself or feed all
		}
		if (label.equalsIgnoreCase("heal") && w.perms.has(sender, "WorldTools.heal") && isCommandEnabled("heal")){
			//heal a player or yourself or heal all
		}
		if (label.equalsIgnoreCase("starvate") && w.perms.has(sender, "WorldTools.starvate") && isCommandEnabled("starvate")){
			//starvate a player or yourself or starvate all
		}
		if (label.equalsIgnoreCase("slap") && w.perms.has(sender, "WorldTools.slap") && isCommandEnabled("slap")){
			//slap a player or yourself or slap all
		}
		if (label.equalsIgnoreCase("maim") && w.perms.has(sender, "WorldTools.maim") && isCommandEnabled("maim")){
			//maim a player or yourself to an inch of their live or maim all
		}
		if (label.equalsIgnoreCase("kill") && w.perms.has(sender, "WorldTools.kill") && isCommandEnabled("kill")){
			//kill a player or yourself or kill all
		}
		if (label.equalsIgnoreCase("hat") && w.perms.has(sender, "WorldTools.hat") && isCommandEnabled("hat")){
			//put a block on a players head or your own or set it on all
		}
		if (label.equalsIgnoreCase("god") && w.perms.has(sender, "WorldTools.god") && isCommandEnabled("god")){
			//put yourself or a player in godmode or set all in godmode
		}
		if (label.equalsIgnoreCase("kit") && w.perms.has(sender, "WorldTools.kit") && isCommandEnabled("kit")){
			//give yourself or a player a kit or give all a kit
		}
		if (label.equalsIgnoreCase("home") && w.perms.has(sender, "WorldTools.home") && isCommandEnabled("home")){
			//warp a player or yourself to home or home all
		}
		if (label.equalsIgnoreCase("spawn") && w.perms.has(sender, "WorldTools.spawn") && isCommandEnabled("spawn")){
			//warp a player or yourself to spawn or spawn all
		}
		if (label.equalsIgnoreCase("warp") && w.perms.has(sender, "WorldTools.warp") && isCommandEnabled("warp")){
			//warp a player or yourself to a warp or warp all
		}
		if (label.equalsIgnoreCase("sethome") && w.perms.has(sender, "WorldTools.sethome") && isCommandEnabled("sethome")){
			//setwarp a player or yourself to sethome or home all
		}
		if (label.equalsIgnoreCase("setspawn") && w.perms.has(sender, "WorldTools.setspawn") && isCommandEnabled("setspawn")){
			//setwarp a player or yourself to setspawn or spawn all
		}
		if (label.equalsIgnoreCase("setwarp") && w.perms.has(sender, "WorldTools.setwarp") && isCommandEnabled("setwarp")){
			//setwarp a player or yourself to a setwarp or warp all
		}
		if (label.equalsIgnoreCase("repair") && w.perms.has(sender, "WorldTools.repair") && isCommandEnabled("repair")){
			//repairs the item in your hand
		}
		if (label.equalsIgnoreCase("afk") && w.perms.has(sender, "WorldTools.afk") && isCommandEnabled("afk")){
			//puts your status on afk or back - all messages / things sent to a player must be in mail form
		}
		if (label.equalsIgnoreCase("pos") && w.perms.has(sender, "WorldTools.pos") && isCommandEnabled("pos")){
			//get your position and heading
		}
		if ((label.equalsIgnoreCase("msg") || label.equalsIgnoreCase("m")) && w.perms.has(sender, "WorldTools.msg") && isCommandEnabled("msg")){
			//message a player //show in logs // and add admin can see support
		}
		if ((label.equalsIgnoreCase("reply") || label.equalsIgnoreCase("r")) && w.perms.has(sender, "WorldTools.reply") && isCommandEnabled("reply")){
			//reply on your message
		}
		if (label.equalsIgnoreCase("me") && w.perms.has(sender, "WorldTools.me") && isCommandEnabled("me")){
			//says an action you could do /me color message ? or /me message
		}
		if ((label.equalsIgnoreCase("pinfo") || label.equalsIgnoreCase("whois") || label.equalsIgnoreCase("playerinfo")) && w.perms.has(sender, "WorldTools.playerinfo") && isCommandEnabled("playerinfo")){
			//shows all player data ip location world name nick group etc etc
		}
		if (label.equalsIgnoreCase("rules") && w.perms.has(sender, "WorldTools.rules") && isCommandEnabled("rules")){
			//shows the rules (im gonna add this for mysql and properties)
		}
		if (label.equalsIgnoreCase("addrule") && w.perms.has(sender, "WorldTools.addrule") && isCommandEnabled("addrule")){
			//adds a rule include colors /addrule &4Rule4 etc etc should return a string
		}
		if (label.equalsIgnoreCase("deleterule") && w.perms.has(sender, "WorldTools.deleterule") && isCommandEnabled("deleterule")){
			//deletes a rule
		}
		if (label.equalsIgnoreCase("seen") && w.perms.has(sender, "WorldTools.seen") && isCommandEnabled("seen")){
			//checks when a player was on for the last time (yeah i also add a mysql table for this)
		}
		if (label.equalsIgnoreCase("played") && w.perms.has(sender, "WorldTools.played") && isCommandEnabled("played")){
			//shows the amount someone played on the server (yeah also this is related with seen)
		}
		if (label.equalsIgnoreCase("cannon") && w.perms.has(sender, "WorldTools.cannon") && isCommandEnabled("cannon")){
			//shoots a fire ball 
		}
		if (label.equalsIgnoreCase("arrow") && w.perms.has(sender, "WorldTools.arrow") && isCommandEnabled("arrow")){
			//arrows a player
		}
		if ((label.equalsIgnoreCase("ci") || label.equalsIgnoreCase("clearinventory")) && w.perms.has(sender, "WorldTools.clearinventory") && isCommandEnabled("clearinventory")){
			//clears your or another players inventory
		}
		if ((label.equalsIgnoreCase("broadcast")||label.equalsIgnoreCase("bc")) && w.perms.has(sender, "WorldTools.broadcast") && isCommandEnabled("broadcast")){
			//sends a message to the server maybe /bc color message
		}
		if (label.equalsIgnoreCase("fire") && w.perms.has(sender, "WorldTools.fire") && isCommandEnabled("fire")){
			//fire a player
		}
		if (label.equalsIgnoreCase("lightning") && w.perms.has(sender, "WorldTools.lightning") && isCommandEnabled("lightning")){
			//lightning a player or a lightning wand
		}
		if ((label.equalsIgnoreCase("spawnmob")||label.equalsIgnoreCase("smob")) && w.perms.has(sender, "WorldTools.spawnmob") && isCommandEnabled("spawnmob")){
			//spawn a mob (maybe add costs for a mob)
		}
		if (label.equalsIgnoreCase("mspawn") && w.perms.has(sender, "WorldTools.mspawn") && isCommandEnabled("mspawn")){
			//change the spawner mob (add ico maybe costs)
		}
		if (label.equalsIgnoreCase("slaughter") && w.perms.has(sender, "WorldTools.slaughter") && isCommandEnabled("slaughter")){
			//kill all mobs in radius / world /slaughter (w|r)
		}
		if ((label.equalsIgnoreCase("psay") || label.equalsIgnoreCase("/playersay")) && w.perms.has(sender, "WorldTools.playersay") && isCommandEnabled("playersay")){
			//make a player parse a command or say something
		}
		if (label.equalsIgnoreCase("weather") && w.perms.has(sender, "WorldTools.weather") && isCommandEnabled("weather")){
			//canary's weather command
		}
		if (label.equalsIgnoreCase("time") && w.perms.has(sender, "WorldTools.time") && isCommandEnabled("time")){
			//canary's weather command
		}
		if (label.equalsIgnoreCase("timeshow") && w.perms.has(sender, "WorldTools.timeshow") && isCommandEnabled("timeshow")){
			//shows the time of world /timeshow world
		}
		if ((label.equalsIgnoreCase("rtime")||label.equalsIgnoreCase("realtime")) && w.perms.has(sender, "WorldTools.realtime") && isCommandEnabled("realtime")){
			//shows the real time
		}
		if ((label.equalsIgnoreCase("rdate")||label.equalsIgnoreCase("realdate")) && w.perms.has(sender, "WorldTools.realdate") && isCommandEnabled("realdate")){
			//shows the real date
		}
		if (label.equalsIgnoreCase("tpa") && w.perms.has(sender, "WorldTools.tpa") && isCommandEnabled("tpa")){
			//tpa to a player
		}
		if (label.equalsIgnoreCase("tp") && w.perms.has(sender, "WorldTools.tp") && isCommandEnabled("tp")){
			//tp to a player
		}
		if (label.equalsIgnoreCase("tpahre") && w.perms.has(sender, "WorldTools.tpahere") && isCommandEnabled("tpahere")){
			//tpa a player to you
		}
		if (label.equalsIgnoreCase("tphere") && w.perms.has(sender, "WorldTools.tphere") && isCommandEnabled("tphere")){
			//tp a player to you
		}
		if (label.equalsIgnoreCase("tpto") && w.perms.has(sender, "WorldTools.tpto") && isCommandEnabled("tpto")){
			//tp a player to coords or another player
		}
		if ((label.equalsIgnoreCase("wtp") || label.equalsIgnoreCase("worldtp")) && w.perms.has(sender, "WorldTools.worldtp") && isCommandEnabled("worldtp")){
			//tp a player or yourself to another world / dimension
		}
		if (label.equalsIgnoreCase("tptoggle") && w.perms.has(sender, "WorldTools.tptoggle") && isCommandEnabled("tptoggle")){
			//deny players to tp to you or tp you to them
		}
		if ((label.equalsIgnoreCase("ch") || label.equalsIgnoreCase("channel")) && w.perms.has(sender, "WorldTools.channel") && isCommandEnabled("channel")){
			//change your chat channel (also /ch msg (player))
		}
		if ((label.equalsIgnoreCase("chcreate") || label.equalsIgnoreCase("channelcreate")) && w.perms.has(sender, "WorldTools.channelcreate") && isCommandEnabled("channelcreate")){
			//create a new chat channel
		}
		if ((label.equalsIgnoreCase("chdelete") || label.equalsIgnoreCase("channeldelete")) && w.perms.has(sender, "WorldTools.channeldelete") && isCommandEnabled("channeldelete")){
			//delete a chat channel
		}
		if ((label.equalsIgnoreCase("motd") || label.equalsIgnoreCase("motd")) && w.perms.has(sender, "WorldTools.motd") && isCommandEnabled("motd")){
			//show the motd
		}
		if (label.equalsIgnoreCase("biome") && w.perms.has(sender, "WorldTools.biome") && isCommandEnabled("biome")){
			//show the biome you are in (or another player is) maybe coords
		}
		if (label.equalsIgnoreCase("mail") && w.perms.has(sender, "WorldTools.mail") && isCommandEnabled("mail")){
			//shows the mailbox ./mail x shows the mail page , /mail show x shows the specified mail. /mail del x deletes a specified mail,  /mail send player mails a player, / mail clear clears all mail
		}
		if ((label.equalsIgnoreCase("gm")||label.equalsIgnoreCase("mode")) && w.perms.has(sender, "WorldTools.gamemode") && isCommandEnabled("gamemode")){
			//changes player gamemode or your own
		}
		
		return false;
	}
	//playertime = change the time for the player
	//change speed limits ?
	//mail
	//nick
	//something to make item in hand or handswing parse a command
	//ban
	//kick
	//banip
	//mute
	//ban
	//unban
	//unmute
	//backup
	//enderchest <player>
	//jail commands
	//display server lagg memory etc
	//invsee ??
}
	
	/**ArrayList<String> god = new ArrayList<String>();
	ArrayList<String> frozen = new ArrayList<String>();
	
	//private static Location exactSpawn = null;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			Player player = (Player) sender;
			
			   if (label.equalsIgnoreCase("drain")){
				   if ((player.canUseCommand("worldtools"))||player.canUseCommand("drain")){
			       int dist = 0;
			       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable) {
			         } if (dist == 0) {
			         player.sendMessage("§9[§6-§8-§6-§8-§6-§9Drain Help§6-§8-§6-§8-§6-§9]");
			         player.sendMessage("§adrain <radius> - Drain waterlava");
			         player.sendMessage("§adrainwater <radius> - Drain water");
			         player.sendMessage("§adrainlava <radius>  - Drain lava");
			         player.sendMessage("§aext <radius> - Remove fire"); return true;
			       }
			         int radius = 0;
			       try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is drain <radius>");return true;}
			       int xmin = (int)player.getLocation().getX()-radius;
			         int xmax = (int)player.getLocation().getX()+radius;
			         int ymin = (int)player.getLocation().getY()-radius;
			         int ymax = (int)player.getLocation().getY()+radius;
			         int zmin = (int)player.getLocation().getZ()-radius;
			         int zmax = (int)player.getLocation().getZ()+radius;
			        
			         for (int x = xmin; x <= xmax; x++) {
			                 for (int y = ymin; y <= ymax; y++) {
			                         for (int z = zmin; z <= zmax; z++) {    
			                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 8){player.getWorld().getBlockAt(x, y, z).setTypeId(95);}
			                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 95){player.getWorld().getBlockAt( x, y, z).setTypeId(9);}
			                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 10){player.getWorld().getBlockAt( x, y, z).setTypeId(95);}
			                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 95){player.getWorld().getBlockAt( x, y, z).setTypeId(11);}
			                         }
			                       }
			                     }
			         player.sendMessage("§aLava & Water Successfully Drained!");
			         return true;
			                   }
			   player.sendMessage("§cYou cant use this command");return true;
	}


		     if (label.equalsIgnoreCase("drainlava")){
		    	 if ((player.canUseCommand("worldtools")) || (player.canUseCommand("drainlava"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable1) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: drainlava <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is drainlava <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 11){player.getWorld().setBlockAt(95, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 95){player.getWorld().setBlockAt(10, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§aLava Successfully Removed!");
		       return true;
		     }
		     player.sendMessage("§cYou cant use this command");return true;
	}

		     if (label.equalsIgnoreCase("drainwater")) {
		    	 if ((player.canUseCommand("worldtools")) || (player.canUseCommand("drainwater"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable2) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: drainwater <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is drainwater <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 9){player.getWorld().setBlockAt(95, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 95){player.getWorld().setBlockAt(8, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§aWater Successfully Removed!");
		       return true;
		     }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }

		     if (label.equalsIgnoreCase("ext")) {
		    	 if ((player.canUseCommand("worldtools")) || (player.canUseCommand("ext"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable3) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: ext <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is ext <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 51){player.getWorld().setBlockAt(0, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§aFire Successfully Extinguished");
		       return true;
		     }
		     player.sendMessage("§cYou cant use this command");return true;
	}

		     if (label.equalsIgnoreCase("melt")) {
		    	 if ((player.canUseCommand("worldtools")) || (player.canUseCommand("melt"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable4) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: melt <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is melt <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 78){player.getWorld().setBlockAt(0, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 79){player.getWorld().setBlockAt(8, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§aThe Snow & Ice has been successfully melted!");
		       return true;
		     }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }

		     if (label.equalsIgnoreCase("snow")) {
		    	 if ((player.canUseCommand("worldtools")) || (player.canUseCommand("snow"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable5) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: snow <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is snow <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 0){player.getWorld().setBlockAt(78, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 8){player.getWorld().setBlockAt(79, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 9){player.getWorld().setBlockAt(79, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§a Snow placed & water frozen!");
		       return true;
		     }
		     player.sendMessage("§cYou cant use this command");return true;
	}

		     if (label.equalsIgnoreCase("waterfix")) {
		    	 if ((player.canUseCommand("worldtools")) && (player.canUseCommand("waterfix"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable6) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: waterfix <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is waterfix <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 8){player.getWorld().setBlockAt(95, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 9){player.getWorld().setBlockAt(95, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 95){player.getWorld().setBlockAt(9, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§a Water Successfully Fixed!");
		       return true;
		     }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }

		     if (label.equalsIgnoreCase("lavafix")) {
		    	 if ((player.canUseCommand("worldtool")) || (player.canUseCommand("lavafix"))){
		       int dist = 0;
		       if (args.length == 1) try { dist = Integer.parseInt(args[0]); } catch (Throwable localThrowable7) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: lavafix <radius>"); return true; }
		         int radius = 0;
		         try {radius = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is lavafix <radius>");return true;}
		         int xmin = (int)player.getLocation().getX()-radius;
		         int xmax = (int)player.getLocation().getX()+radius;
		         int ymin = (int)player.getLocation().getY()-radius;
		         int ymax = (int)player.getLocation().getY()+radius;
		         int zmin = (int)player.getLocation().getZ()-radius;
		         int zmax = (int)player.getLocation().getZ()+radius;
		        
		         for (int x = xmin; x <= xmax; x++) {
		                 for (int y = ymin; y <= ymax; y++) {
		                         for (int z = zmin; z <= zmax; z++) {    
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 10){player.getWorld().setBlockAt(95, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 11){player.getWorld().setBlockAt(95, x, y, z);}
		                    if (player.getWorld().getBlockTypeIdAt(x, y, z) == 95){player.getWorld().setBlockAt(9, x, y, z);}
		                         }
		                       }
		                     }
		       player.sendMessage("§a Lava Successfully Fixed!");
		       return true;
		     }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }
		     
		     if (label.equalsIgnoreCase("lighter")){ 
		    	 if(player.canUseCommand("lighter") || (player.canUseCommand("worldtools"))) {
		       int dist = 0;
		       if (args.length == 0) try { dist = Integer.parseInt(label); } catch (Throwable localThrowable8) {
		         } if (dist == 0) { player.sendMessage("§cWrong syntax! Usage: lighter"); return true;
		       }
		       player.giveItem(260, 1);
		       player.sendMessage("§a No smoke without §6fire!"); 
		       return true;
		     }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }
		     
		     if (label.equalsIgnoreCase("cmob")){
		    	 if(player.canUseCommand("cmob") || (player.canUseCommand("worldtools"))) {
		         try {
		           int r = Integer.valueOf(args[0]).intValue();
		           WorldToolsVoids.cMob(r);
		           player.sendMessage("§aCleared mobs");
		           return true;
		         } catch (Exception e) {
		           player.sendMessage("§cWrong syntax! Usage: cmob <radius>");
		           return true;
		         }
		       }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }

		     if (label.equalsIgnoreCase("killmobs")){
		    		 if (player.canUseCommand("killmobs") || (player.canUseCommand("worldtools"))) {
		         int mobcount = player.getWorld().getMobList().size();
		         for (int i = 0; i < mobcount; i++) {
		           ((Mob)player.getWorld().getMobList().get(i)).setHealth(0);
		         }
		         player.sendMessage("§aYou Killed " + mobcount + " Mobs.");
		         return true;
		       }
		    		 player.sendMessage("§cYou cant use this command");return true;
		     }
		     
		     if (label.equalsIgnoreCase("wreplace")){
		    	 if ((player.canUseCommand("wreplace") || (player.canUseCommand("worldtools")))){
		         if (args.length != 3){
		                 player.sendMessage("§cThe correct usage is 'wreplace fromid toid radius'");
		                 return true;
		         } 
		         Integer.parseInt(args[0]); Integer.parseInt(args[1]);Integer.parseInt(args[2]);
		     int fromid = 0;
		     try{fromid = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is 'wreplace fromid toid radius");return true;}
		     int toid = 0;
		     try{fromid = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is 'wreplace fromid toid radius");return true;}
		     int radius = 0;
		     try{fromid = Integer.parseInt(args[0]);}catch(NumberFormatException nfe){player.sendMessage("§cThe correct usage is 'wreplace fromid toid radius");return true;}
		         WorldToolsVoids.replace(player,fromid,toid,radius);
		         
		         player.sendMessage("§aBlocks Replaced.");
		         return true;
		    	 }
		    	 player.sendMessage("§cYou cant use this command");return true;
		 }
		     
		     if ((label.equalsIgnoreCase("worldtools")) && (player.canUseCommand("worldtools"))) {
		    	 if (args.length != 0){player.sendMessage("§cThe correct usage is 'worldtools'");return true;}
		           player.sendMessage("§6 WorldTools " + WorldTools.version + " by Glacksy §8&§6 Spenk");
		           return true;
		         }
		     
		     if ((label.equalsIgnoreCase("suicide"))){
		    	 if ((player.canUseCommand("suicide") || (player.canUseCommand("worldtool")))){
		    		 if (args.length != 0){player.sendMessage("§cThe correct usage is 'suicide'");return true;}
		           player.setHealth(0);
		           player.sendMessage("§cYou committed suicide");
		           return true;
		    	 }
		    	 player.sendMessage("§cYou cant use this command");return true;
		     }
		     
		           if ((label.equalsIgnoreCase("kill"))){    
		        	   if ((player.canUseCommand("worldtools")) || (player.canUseCommand("kill"))){
		        		   if (args.length != 1){
		        		   player.sendMessage("§cThe correct usage is kill <player>");
		        		   return true;
		        	   }else{
		        		   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        		   if (player2 == null){
		        			   player.sendMessage("§c§cThis player Doesnt Exist or is currently not online!");
		        			   return true;
		        		   }
		        		   player2.sendMessage("§4You got killed by §2"+player.getName());
		        		   player2.dropInventory(player.getLocation());
		        		   player2.setHealth(0);
		        		   player.sendMessage("§2player sucsessfully killed!");
		        		   return true;
		        	   }
		        	   }
		        		   player.sendMessage("§cYou cant use this command");
		        		   return true;
		        	   }
		           
		           if ((label.equalsIgnoreCase("heal"))){           
		        	   if ((player.canUseCommand("worldtools")) || (player.canUseCommand("heal"))){
		    			   if (args.length != 1){
		            		   player.sendMessage("§cThe correct usage is heal <player>");
		            		   return true; 
		    			   }else{
		        		   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        		   if (player2 == null){
		        			   player.sendMessage("§cThis player Doesnt Exist or is currently not online!");
		        			   return true;
		        		   }
		        		   player2.sendMessage("§4You were healed by §2"+player.getName());
		        		   player2.setHealth(20);
		   				   player2.setFoodLevel(20);
		        		   player.sendMessage("§2player sucsessfully healed!");
		        		   return true;
		    			   }
		        	   }
		        		   player.sendMessage("§cYou cant use this command");return true;
		           }
		           
		           if (label.equalsIgnoreCase("save-inv")){
		        	   if (player.canUseCommand("worldtools") || (player.canUseCommand("save-inv"))){
		        		   if (args.length != 0){player.sendMessage("§cThe correct usage is 'save-inv'");return true;}
		        	   Bukkit.getServer().saveInventories();
		        	   player.sendMessage("§aInventories saved");
		               return true;
		           }
		        	   player.sendMessage("§cYou cant use this command");return true;
		           }
		           
		           if ((label.equalsIgnoreCase("godmode"))) {
		        	   if ((player.canUseCommand("godmode")) || (player.canUseCommand("worldtools"))){
		        		   if (args.length > 1){player.sendMessage("§cThe correct usage is godmode (player)");return true;
		        	   }
		        		   if (args.length == 0){
				        	      if (!god.contains(player.getName())) {
					        	        god.add(player.getName());
					        	        player.sendMessage("§3Godmode have been enabled");
					        	        return true;
					        	      }else{
					        	      god.remove(player.getName());
					        	      player.sendMessage("§3Godmode have been disabled");
					        	      return true;
					        	      }
		        		   }
		        		   if (args.length == 1){
		        			   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        			   if (player2 == null){player.sendMessage("§cThis player does not exist or is not logged in!");return true;}
		        	      if (!god.contains(player2.getName())) {
		        	        god.add(player2.getName());
		        	        player.sendMessage("§3Godmode have been enabled");
		        	        player2.sendMessage("§3Godmode have been enabled");
		        	        return true;
		        	      }else{
		        	      god.remove(player2.getName());
		        	      player.sendMessage("§3Godmode have been disabled");
		        	      player2.sendMessage("§3Godmode have been disabled");
		        	      return true;
		        	      }
		        	    }
		        	   player.sendMessage("§cYou cant use this command");return true;
		           }
		           }
		           if (label.equalsIgnoreCase("feed")){
		        	   if (player.canUseCommand("worldtools") || (player.canUseCommand("feed"))){
		        	   if (args.length != 1){
		        		   player.sendMessage("§cThe correct usage is feed player");
		        		   return true;
		        	   }
		        	   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        	   if (player2 == null) { player.sendMessage("§cThis player does not exist or is currently not logged in!"); return true;}
		        	   player2.setFoodLevel(20);
		        	   player.sendMessage("§2"+player2.getName()+"'s foodlevel is restored!");
		        	   player2.sendMessage("§2"+player.getName()+" Restored your foodlevel!");
		        	   return true;
		           }
		        	   player.sendMessage("§cYou cant use this command");return true;
		           }
		           if (label.equalsIgnoreCase("getip")){
		        	   if (player.canUseCommand("worldtools") || (player.canUseCommand("getip"))){
		        	   if (args.length != 1){
		        		   player.sendMessage("§cThe correct usage is getip <player>");
		        		   return true;
		        	   }
		        	   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        	   if (player2 == null){player.sendMessage("§cThis player doesnt exist or is not logged in");return true;}
		        	   player.sendMessage("§4"+player2.getName()+"§2 His IP is §4"+player2.getIP());
		        	   return true;
		           }
		           if (label.equalsIgnoreCase("forcewarp")){
		        	   if (player.canUseCommand("worldtools") || (player.canUseCommand("forcewarp"))){
		        	   if (args.length != 2){
		        		   player.sendMessage("§cThe correct usage is forcewarp player warpname");
		        		   return true;
		        	   }
		        	   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        	   if (player2 == null) { player.sendMessage("§cThis player does not exist or is currently not logged in!"); return true;}
		        	   Warp warp = etc.getDataSource().getWarp(args[1]);
		        	   if (warp == null){player.sendMessage("§cThis warp doesnt exist!");return true;}
		        	   player2.teleportTo(warp.Location);
		        	   player.sendMessage("§2"+player2.getName()+" is warped!");
		        	   player2.sendMessage("§2"+player.getName()+" warped you!");
		        	   return true;
		           }
		           player.sendMessage("§cYou cant use this command");return true;
		           }
		           
		           if (label.equalsIgnoreCase("switchworlds")){
		        	   if (player.canUseCommand("worldtools") || (player.canUseCommand("switchworlds"))){
		        	   if (args.length != 2){
		        		   player.sendMessage("§cThe correct usage is swichworlds player worldname");
		        		   player.sendMessage("§c-1 = nether, 0 = normal world , 1 = end");
		        		   return true;
		        	   }
		        	   Player player2 = Bukkit.getServer().matchPlayer(args[0]);
		        	   if (player2 == null) { player.sendMessage("§cThis player does not exist or is currently not logged in!"); return true;}
		        	   
		        	   File f = new File(args[1]);
		        	   if (!f.exists()){
		        		   player.sendMessage("§cThis World does not exist!");
		        		   return true;
		        	   }
		        	   
		        	   if (!Bukkit.getServer().isWorldLoaded(args[1])){
		        		   player.sendMessage("§cThis world isnt loaded! please load it before you try to teleport!");
		        		   return true;
		        	   }
		        	   
		        	   World[] w = Bukkit.getServer().getWorld(args[1]);
		        	   player2.switchWorlds(w[0]);
		        	   player.sendMessage("§2"+player2.getName()+" Has swiched to world "+w[0].getName());
		        	   player2.sendMessage("§2"+player.getName()+" Has swiched you to world "+w[0].getName());
		        	   return true;
		        	   }
		        	   player.sendMessage("§cYou cant use this command");return true;
		           }
		           
		             if (label.equalsIgnoreCase("freeze")) {
		        	   if (player.canUseCommand("freeze") || (player.canUseCommand("worldtools"))){
		        		   if (args.length != 1){player.sendMessage("§cThe correct usage is 'freeze <player>'");return true;}
		               Player offender = Bukkit.getServer().matchPlayer(args[0]);
		               if (offender == null){
		            	   player.sendMessage("§cThis player does not exist or is currently not logged in!");
		            	   return true;
		               }
		               
		               if ((!frozen.contains(offender.getName())) && (args[0] != null)) {
		                 offender.sendMessage("§2You have been frozen by §3" + player.getName() + "§e!");
		                 player.sendMessage("§2You froze §3" + offender.getName() + "§2!");
		                 frozen.add(offender.getName());
		                 return true;
		               }
		               offender.sendMessage("§2You have been thawed!");
		               player.sendMessage("§2You unfroze §3" + player.getName() + "§2!");
		               frozen.remove(offender.getName());
		               return true;
		             }
		        	   player.sendMessage("§cYou cant use this command");return true;
		           }
		           
		           if (label.equalsIgnoreCase("setspawn")){
		        	   if (player.canUseCommand("setspawn")||player.canUseCommand("worldtools")){
		        		   if (args.length != 0){player.sendMessage("§cThe correct usage is 'setspawn'");return true;}
		               exactSpawn = new Location(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), player.getLocation().getRotation(), player.getLocation().getPitch());
		               PropertiesFile props = new PropertiesFile("worldtools.properties");
		               props.setString("exact-spawn", exactSpawn.x + "," + exactSpawn.y + "," + exactSpawn.z + "," + exactSpawn.rotX + "," + exactSpawn.rotY);
		               return true;
		        	   }
		        	   player.sendMessage("§cYou cant use this command");return true;
		             }
		           
		           if (label.equalsIgnoreCase("spawn") && exactSpawn != null) {
		        	   if ((player.canUseCommand("spawn")) || player.canUseCommand("worldtools")){
		               player.teleport(exactSpawn);
		               return true;
		             }
		        	   player.sendMessage("§cYou cant use this command");return true;
		           }
		           
		             if (label.equalsIgnoreCase("locate")){
		            	 if (player.canUseCommand("locate")|| player.canUseCommand("worldtools")){
		            		 if (args.length != 1){
		            			 player.sendMessage("§cThe correct usage is 'locate <player>'");return true;
		            		 }
		            		 Player player2 = Bukkit.getServer().matchplayer(args[0]);
		            		 if (player2 == null){player.sendMessage("§c§cTis player doesnt exist or is currently not logged in!");return true;}
		            		 player.sendMessage(player2.getName()+"Is located in World:"+player2.getWorld().getName()+" in Dimension:"+player2.getLocation().dimension +" at location X:"+player2.getX() +" Y:"+player2.getY() +" Z:"+player2.getZ());
		            		 return true;
		            	 }
		            	 player.sendMessage("§cYou cant use this command");return true;
		             }
		             }
		}
		     return false;
		   }
}*/

/**
 * @commands
 * drain
 * drainlava
 * drainwater
 * ext
 * melt
 * snow
 * lavafix
 * waterfix
 * lighter
 * cmob
 * wreplace
 * killmobs
 * suicide
 * kill
 * heal
 * save-inv
 * freeze
 * godmode
 * food
 * swichworlds
 * getip
 */
 //end of class