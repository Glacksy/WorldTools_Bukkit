package com.TopicaRP.WorldTools.Handlers;

import org.bukkit.inventory.ItemStack;

public class WorldToolsRepair {
	
	/**
	 * these values must be defined in the properties
	 */
	boolean repair;//allows repairing / has to be listed in each world file
	boolean iCoRepair;//allows economy repair
	
	boolean crtool;
	boolean crarmour;
	
	boolean crwood;
	boolean crleather;
	boolean crstone;
	boolean crhain;
	boolean criron;
	boolean crgold;
	boolean crdiamond;
	boolean crstring;
	
	double cwood;
	double cleather;
	double cstone;
	double cchain;
	double ciron;
	double cgold;
	double cdiamond;
	double ccstring;
	
/**
 * 
 * repairs the item
 * 
 * @param item
 * @param needItem
 * @return amount of repaired damage
 */
	public int repairItem(ItemStack item, boolean needItem){
		if (!needItem){
			
		}else{
			
		}
		return 0;
	}
	
	/**
	 * 
	 * checks if the item needs wood to be repaired
	 * 
	 * @param item
	 * @return true if the item needs wood
	 */
	public boolean isWood(ItemStack item){
		switch(item.getTypeId()){
		case 268: return true;
		case 269: return true;
		case 270: return true;
		case 271: return true;
		case 290: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item needs leather to be repaired
	 * 
	 * @param item
	 * @return true if the item needs leather
	 */
	public boolean isLeather(ItemStack item){
		switch(item.getTypeId()){
		case 298: return true;
		case 299: return true;
		case 300: return true;
		case 301: return true;
		}
		return false;
	}

	/**
	 * 
	 * checks if the item needs stone to be repaired
	 * 
	 * @param item
	 * @return true if the item needs stone
	 */
	public boolean isStone(ItemStack item){
		switch(item.getTypeId()){
		case 272: return true;
		case 273: return true;
		case 274: return true;
		case 275: return true;
		case 291: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item needs chain to be repaired
	 * 
	 * @param item
	 * @return true if the item needs chain
	 */
	public boolean isChain(ItemStack item){
		switch(item.getTypeId()){
		case 302: return true;
		case 303: return true;
		case 304: return true;
		case 305: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item needs iron to be repaired
	 * 
	 * @param item
	 * @return true if the item needs iron
	 */
	public boolean isIron(ItemStack item){
		switch(item.getTypeId()){
		case 256: return true;
		case 257: return true;
		case 258: return true;
		case 259: return true;
		case 267: return true;
		case 292: return true;
		case 359: return true;
		case 306: return true;
		case 307: return true;
		case 308: return true;
		case 309: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item needs gold to be repaired
	 * 
	 * @param item
	 * @return true if the item needs gold
	 */
	public boolean isGold(ItemStack item){
		switch(item.getTypeId()){
		case 283: return true;
		case 284: return true;
		case 285: return true;
		case 286: return true;
		case 294: return true;
		case 314: return true;
		case 315: return true;
		case 316: return true;
		case 317: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item needs diamond to be repaired
	 * 
	 * @param item
	 * @return true if the item needs diamond
	 */
	public boolean isDiamond(ItemStack item){
		switch(item.getTypeId()){
		case 276: return true;
		case 277: return true;
		case 278: return true;
		case 279: return true;
		case 293: return true;
		case 310: return true;
		case 311: return true;
		case 312: return true;
		case 313: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item needs string to be repaired
	 * 
	 * @param item
	 * @return true if the item needs string
	 */
	public boolean isString(ItemStack item){
		switch(item.getTypeId()){
		case 346: return true;
		case 261: return true;
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item is a tool
	 * 
	 * @param item
	 * @return true if the item is a tool
	 */
	public boolean isTool(ItemStack item){
		switch(item.getTypeId()){
		
		}
		return false;
	}
	
	/**
	 * 
	 * checks if the item is Armour
	 * 
	 * @param item
	 * @return true if the item is Armour
	 */
	public boolean isArmour(ItemStack item){
		switch(item.getTypeId()){
		
		}
		return false;
	}
	
}
