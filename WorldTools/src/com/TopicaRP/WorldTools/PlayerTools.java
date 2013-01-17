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

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Spenk & Glacksy
 * @version 1.0
 */
public class PlayerTools{
	
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
	
	WorldToolsVoids handler = new WorldToolsVoids();
	World world;
	
	/**
	 * 
	 * here do all commands get parsed
	 * 
	 * @param sender
	 * @param cmd
	 * @param label
	 * @param args
	 * @return true if you wish to end the command
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("Tree") && handler.hasPermission(sender, "WorldTools.tree") && handler.isCommandEnabled("tree")){
			//generate a tree /tree <type>
		}
		if (label.equalsIgnoreCase("Break") && handler.hasPermission(sender, "WorldTools.break") && handler.isCommandEnabled("break")){
			//breaks blocks you are looking at /break (radius)
		}
		if (label.equalsIgnoreCase("Explode") && handler.hasPermission(sender, "WorldTools.explode") && handler.isCommandEnabled("explode")){
			//creates an explosion with given power at location
		}
		if (label.equalsIgnoreCase("Enchant") && handler.hasPermission(sender, "WorldTools.enchant") && handler.isCommandEnabled("enchant")){
			//enchant command /enchant type power etc etc
		}
		if (label.equalsIgnoreCase("Feed") && handler.hasPermission(sender, "WorldTools.feed") && handler.isCommandEnabled("feed")){
			//feed a player or yourself or feed all
		}
		if (label.equalsIgnoreCase("heal") && handler.hasPermission(sender, "WorldTools.heal") && handler.isCommandEnabled("heal")){
			//heal a player or yourself or heal all
		}
		if (label.equalsIgnoreCase("starvate") && handler.hasPermission(sender, "WorldTools.starvate") && handler.isCommandEnabled("starvate")){
			//starvate a player or yourself or starvate all
		}
		if (label.equalsIgnoreCase("slap") && handler.hasPermission(sender, "WorldTools.slap") && handler.isCommandEnabled("slap")){
			//slap a player or yourself or slap all
		}
		if (label.equalsIgnoreCase("maim") && handler.hasPermission(sender, "WorldTools.maim") && handler.isCommandEnabled("maim")){
			//maim a player or yourself to an inch of their live or maim all
		}
		if (label.equalsIgnoreCase("kill") && handler.hasPermission(sender, "WorldTools.kill") && handler.isCommandEnabled("kill")){
			//kill a player or yourself or kill all
		}
		if (label.equalsIgnoreCase("hat") && handler.hasPermission(sender, "WorldTools.hat") && handler.isCommandEnabled("hat")){
			//put a block on a players head or your own or set it on all
		}
		if (label.equalsIgnoreCase("dive") && handler.hasPermission(sender, "WorldTools.dive") && handler.isCommandEnabled("dive")){
			//put a glass block in player helmet slot so he can breath underwater
		}
		if (label.equalsIgnoreCase("god") && handler.hasPermission(sender, "WorldTools.god") && handler.isCommandEnabled("god")){
			//put yourself or a player in godmode or set all in godmode
		}
		if (label.equalsIgnoreCase("kit") && handler.hasPermission(sender, "WorldTools.kit") && handler.isCommandEnabled("kit")){
			//give yourself or a player a kit or give all a kit
		}
		if (label.equalsIgnoreCase("home") && handler.hasPermission(sender, "WorldTools.home") && handler.isCommandEnabled("home")){
			//warp a player or yourself to home or home all
		}
		if (label.equalsIgnoreCase("spawn") && handler.hasPermission(sender, "WorldTools.spawn") && handler.isCommandEnabled("spawn")){
			//warp a player or yourself to spawn or spawn all
		}
		if (label.equalsIgnoreCase("warplist") && handler.hasPermission(sender, "WorldTools.warplist") && handler.isCommandEnabled("warplist")){
			//sends a list of warps
		}
		if (label.equalsIgnoreCase("warp") && handler.hasPermission(sender, "WorldTools.warp") && handler.isCommandEnabled("warp")){
			//warp a player or yourself to a warp or warp all
		}
		if (label.equalsIgnoreCase("sethome") && handler.hasPermission(sender, "WorldTools.sethome") && handler.isCommandEnabled("sethome")){
			//setwarp a player or yourself to sethome or home all
		}
		if (label.equalsIgnoreCase("setspawn") && handler.hasPermission(sender, "WorldTools.setspawn") && handler.isCommandEnabled("setspawn")){
			//setwarp a player or yourself to setspawn or spawn all
		}
		if (label.equalsIgnoreCase("setwarp") && handler.hasPermission(sender, "WorldTools.setwarp") && handler.isCommandEnabled("setwarp")){
			//setwarp a player or yourself to a setwarp or warp all
		}
		if ((label.equalsIgnoreCase("removewarp") || (label.equalsIgnoreCase("deletewarp") || label.equalsIgnoreCase("deletewarp"))) && handler.hasPermission(sender, "WorldTools.removewarp") && handler.isCommandEnabled("removewarp")){
			//setwarp a player or yourself to a setwarp or warp all
		}
		if (label.equalsIgnoreCase("repair") && handler.hasPermission(sender, "WorldTools.repair") && handler.isCommandEnabled("repair")){
			//repairs the item in your hand
		}
		if (label.equalsIgnoreCase("afk") && handler.hasPermission(sender, "WorldTools.afk") && handler.isCommandEnabled("afk")){
			//puts your status on afk or back - all messages / things sent to a player must be in mail form
		}
		if (label.equalsIgnoreCase("pos") && handler.hasPermission(sender, "WorldTools.pos") && handler.isCommandEnabled("pos")){
			//get your position and heading
		}
		if ((label.equalsIgnoreCase("msg") || label.equalsIgnoreCase("m")) && handler.hasPermission(sender, "WorldTools.msg") && handler.isCommandEnabled("msg")){
			//message a player //show in logs // and add admin can see support
		}
		if ((label.equalsIgnoreCase("reply") || label.equalsIgnoreCase("r")) && handler.hasPermission(sender, "WorldTools.reply") && handler.isCommandEnabled("reply")){
			//reply on your message
		}
		if ((label.equalsIgnoreCase("me")||label.equalsIgnoreCase("emote")) && handler.hasPermission(sender, "WorldTools.me") && handler.isCommandEnabled("me")){
			//says an action you could do /me color message ? or /me message
		}
		if ((label.equalsIgnoreCase("pinfo") || label.equalsIgnoreCase("whois") || label.equalsIgnoreCase("playerinfo")) && handler.hasPermission(sender, "WorldTools.playerinfo") && handler.isCommandEnabled("playerinfo")){
			//shows all player data ip location world name nick group etc etc
		}
		if (label.equalsIgnoreCase("rules") && handler.hasPermission(sender, "WorldTools.rules") && handler.isCommandEnabled("rules")){
			//shows the rules (im gonna add this for mysql and properties)
			//idea something with global rules for the whole server and local rules for each specified world
		}
		if (label.equalsIgnoreCase("addrule") && handler.hasPermission(sender, "WorldTools.addrule") && handler.isCommandEnabled("addrule")){
			//adds a rule include colors /addrule &4Rule4 etc etc should return a string
		}
		if (label.equalsIgnoreCase("deleterule") && handler.hasPermission(sender, "WorldTools.deleterule") && handler.isCommandEnabled("deleterule")){
			//deletes a rule
		}
		if (label.equalsIgnoreCase("seen") && handler.hasPermission(sender, "WorldTools.seen") && handler.isCommandEnabled("seen")){
			//checks when a player was on for the last time (yeah i also add a mysql table for this)
		}
		if (label.equalsIgnoreCase("played") && handler.hasPermission(sender, "WorldTools.played") && handler.isCommandEnabled("played")){
			//shows the amount someone played on the server (yeah also this is related with seen)
		}
		if (label.equalsIgnoreCase("cannon") && handler.hasPermission(sender, "WorldTools.cannon") && handler.isCommandEnabled("cannon")){
			//shoots a fire ball 
		}
		if (label.equalsIgnoreCase("arrow") && handler.hasPermission(sender, "WorldTools.arrow") && handler.isCommandEnabled("arrow")){
			//arrows a player
		}
		if ((label.equalsIgnoreCase("ci") || label.equalsIgnoreCase("clearinventory")) && handler.hasPermission(sender, "WorldTools.clearinventory") && handler.isCommandEnabled("clearinventory")){
			//clears your or another players inventory
		}
		if ((label.equalsIgnoreCase("broadcast")||label.equalsIgnoreCase("bc")) && handler.hasPermission(sender, "WorldTools.broadcast") && handler.isCommandEnabled("broadcast")){
			//sends a message to the server maybe /bc color message
		}
		if (label.equalsIgnoreCase("fire") && handler.hasPermission(sender, "WorldTools.fire") && handler.isCommandEnabled("fire")){
			//fire a player
		}
		if (label.equalsIgnoreCase("lightning") && handler.hasPermission(sender, "WorldTools.lightning") && handler.isCommandEnabled("lightning")){
			//lightning a player or a lightning wand
		}
		if ((label.equalsIgnoreCase("spawnmob")||label.equalsIgnoreCase("smob")) && handler.hasPermission(sender, "WorldTools.spawnmob") && handler.isCommandEnabled("spawnmob")){
			//spawn a mob (maybe add costs for a mob)
		}
		if (label.equalsIgnoreCase("mspawn") && handler.hasPermission(sender, "WorldTools.mspawn") && handler.isCommandEnabled("mspawn")){
			//change the spawner mob (add ico maybe costs)
		}
		if (label.equalsIgnoreCase("slaughter") && handler.hasPermission(sender, "WorldTools.slaughter") && handler.isCommandEnabled("slaughter")){
			//kill all mobs in radius / world /slaughter (w|r)
		}
		if ((label.equalsIgnoreCase("psay") || label.equalsIgnoreCase("/playersay")) && handler.hasPermission(sender, "WorldTools.playersay") && handler.isCommandEnabled("playersay")){
			//make a player parse a command or say something
		}
		if (label.equalsIgnoreCase("weather") && handler.hasPermission(sender, "WorldTools.weather") && handler.isCommandEnabled("weather")){
			//canary's weather command
		}
		if (label.equalsIgnoreCase("time") && handler.hasPermission(sender, "WorldTools.time") && handler.isCommandEnabled("time")){
			//canary's weather command
		}
		if (label.equalsIgnoreCase("timeshow") && handler.hasPermission(sender, "WorldTools.timeshow") && handler.isCommandEnabled("timeshow")){
			//shows the time of world /timeshow world
		}
		if ((label.equalsIgnoreCase("rtime")||label.equalsIgnoreCase("realtime")) && handler.hasPermission(sender, "WorldTools.realtime") && handler.isCommandEnabled("realtime")){
			//shows the real time
		}
		if ((label.equalsIgnoreCase("rdate")||label.equalsIgnoreCase("realdate")) && handler.hasPermission(sender, "WorldTools.realdate") && handler.isCommandEnabled("realdate")){
			//shows the real date
		}
		if (label.equalsIgnoreCase("tpa") && handler.hasPermission(sender, "WorldTools.tpa") && handler.isCommandEnabled("tpa")){
			//tpa to a player
		}
		if (label.equalsIgnoreCase("tp") && handler.hasPermission(sender, "WorldTools.tp") && handler.isCommandEnabled("tp")){
			//tp to a player
		}
		if (label.equalsIgnoreCase("tpahre") && handler.hasPermission(sender, "WorldTools.tpahere") && handler.isCommandEnabled("tpahere")){
			//tpa a player to you
		}
		if (label.equalsIgnoreCase("tphere") && handler.hasPermission(sender, "WorldTools.tphere") && handler.isCommandEnabled("tphere")){
			//tp a player to you
		}
		if (label.equalsIgnoreCase("tpto") && handler.hasPermission(sender, "WorldTools.tpto") && handler.isCommandEnabled("tpto")){
			//tp a player to coords or another player
		}
		if ((label.equalsIgnoreCase("wtp") || label.equalsIgnoreCase("worldtp")) && handler.hasPermission(sender, "WorldTools.worldtp") && handler.isCommandEnabled("worldtp")){
			//tp a player or yourself to another world / dimension
		}
		if (label.equalsIgnoreCase("tptoggle") && handler.hasPermission(sender, "WorldTools.tptoggle") && handler.isCommandEnabled("tptoggle")){
			//deny players to tp to you or tp you to them
		}
		if ((label.equalsIgnoreCase("ch") || label.equalsIgnoreCase("channel")) && handler.hasPermission(sender, "WorldTools.channel") && handler.isCommandEnabled("channel")){
			//change your chat channel (also /ch msg (player))
		}
		if ((label.equalsIgnoreCase("chcreate") || label.equalsIgnoreCase("channelcreate")) && handler.hasPermission(sender, "WorldTools.channelcreate") && handler.isCommandEnabled("channelcreate")){
			//create a new chat channel
		}
		if ((label.equalsIgnoreCase("chdelete") || label.equalsIgnoreCase("channeldelete")) && handler.hasPermission(sender, "WorldTools.channeldelete") && handler.isCommandEnabled("channeldelete")){
			//delete a chat channel
		}
		if ((label.equalsIgnoreCase("motd") || label.equalsIgnoreCase("motd")) && handler.hasPermission(sender, "WorldTools.motd") && handler.isCommandEnabled("motd")){
			//show the motd
		}
		if (label.equalsIgnoreCase("biome") && handler.hasPermission(sender, "WorldTools.biome") && handler.isCommandEnabled("biome")){
			//show the biome you are in (or another player is) maybe coords
		}
		if (label.equalsIgnoreCase("mail") && handler.hasPermission(sender, "WorldTools.mail") && handler.isCommandEnabled("mail")){
			//shows the mailbox ./mail x shows the mail page , /mail show x shows the specified mail. /mail del x deletes a specified mail,  /mail send player mails a player, / mail clear clears all mail
		}
		if ((label.equalsIgnoreCase("gm")||label.equalsIgnoreCase("mode")) && handler.hasPermission(sender, "WorldTools.gamemode") && handler.isCommandEnabled("gamemode")){
			//changes player gamemode or your own
		}
		if (label.equalsIgnoreCase("freeze") && handler.hasPermission(sender, "WorldTools.freeze") && handler.isCommandEnabled("freeze")){
			//freezes a player or yourself or all players
		}
		if (label.equalsIgnoreCase("melt") && handler.hasPermission(sender, "WorldTools.melt") && handler.isCommandEnabled("melt")){
			//melts the radius arround you from snow/ice
		}
		if (label.equalsIgnoreCase("snow") && handler.hasPermission(sender, "WorldTools.snow") && handler.isCommandEnabled("snow")){
			//snows the radius arround you
		}
		if (label.equalsIgnoreCase("wreplace") && handler.hasPermission(sender, "WorldTools.wreplace") && handler.isCommandEnabled("wreplace")){
			//replaces a block type arround you in a radius
		}
		if ((label.equalsIgnoreCase("fwater")||label.equalsIgnoreCase("fixwater")) && handler.hasPermission(sender, "WorldTools.fixwater") && handler.isCommandEnabled("fixwater")){
			//changes all flowing water in stable water arround you in a radius
		}
		if ((label.equalsIgnoreCase("flava")||label.equalsIgnoreCase("fixlava")) && handler.hasPermission(sender, "WorldTools.fixlava") && handler.isCommandEnabled("fixlava")){
			//changes all flowing lava in stable lava arround you in a radius
		}
		if ((label.equalsIgnoreCase("dwater")||label.equalsIgnoreCase("drainwater")) && handler.hasPermission(sender, "WorldTools.drainwater") && handler.isCommandEnabled("drainwater")){
			//drains all water arround you
		}
		if ((label.equalsIgnoreCase("dlava")||label.equalsIgnoreCase("drainlava")) && handler.hasPermission(sender, "WorldTools.drainlava") && handler.isCommandEnabled("drainlava")){
			//drains all lava arround you
		}
		if (label.equalsIgnoreCase("lighter") && handler.hasPermission(sender, "WorldTools.lighter") && handler.isCommandEnabled("lighter")){
			//gives you a lighter
		}
		if (label.equalsIgnoreCase("supertool") && handler.hasPermission(sender, "WorldTools.supertool") && handler.isCommandEnabled("supertool")){
			//changes the tool in your hand into a super blockbreaker (drops toggleable in props)
		}
		if ((label.equalsIgnoreCase("extinguish")||label.equalsIgnoreCase("ex")) && handler.hasPermission(sender, "WorldTools.extinguish") && handler.isCommandEnabled("extinguish")){
			//removes all fire in a radius
		}
		if ((label.equalsIgnoreCase("ri")||label.equalsIgnoreCase("removeitems"))&& handler.hasPermission(sender, "WorldTools.removeitems") && handler.isCommandEnabled("removeitems")){
			//removes all item entity's in a radius or in a world
		}
		if (label.equalsIgnoreCase("goto")&& handler.hasPermission(sender, "WorldTools.goto") && handler.isCommandEnabled("goto")){
			//go to the block you are pointing at
		}
		if (label.equalsIgnoreCase("up")&& handler.hasPermission(sender, "WorldTools.up") && handler.isCommandEnabled("up")){
			//go x amounts of blocks up
		}
		if (label.equalsIgnoreCase("enableplugin")&& handler.hasPermission(sender, "WorldTools.enableplugin") && handler.isCommandEnabled("enableplugin")){
			//enables a plugin
		}
		if (label.equalsIgnoreCase("reloadplugin")&& handler.hasPermission(sender, "WorldTools.reloadplugin") && handler.isCommandEnabled("reloadplugin")){
			//reloads a plugin
		}
		if (label.equalsIgnoreCase("disableplugin")&& handler.hasPermission(sender, "WorldTools.disableplugin") && handler.isCommandEnabled("disableplugin")){
			//disables a plugin
		}
		if (label.equalsIgnoreCase("worldtools")&& handler.hasPermission(sender, "WorldTools.worldtools") && handler.isCommandEnabled("worldtools")){
			//sends info about worldtools
		}
		if (label.equalsIgnoreCase("item")&& handler.hasPermission(sender, "WorldTools.item") && handler.isCommandEnabled("item")){
			//gives yourself or a player an item
		}
		if ((label.equalsIgnoreCase("nick") || label.equalsIgnoreCase("nickname")) && handler.hasPermission(sender, "WorldTools.nickname")&&handler.isCommandEnabled("nickname")){
			//Nicks the player
		}
		if (label.equalsIgnoreCase("tag") && handler.hasPermission(sender, "WorldTools.tag")&&handler.isCommandEnabled("tag")){
			//sets the tag above a players head
		}
		
		return false;
	}
	/*
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
	//setbiome*/
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