package com.TopicaRP.WorldTools.Files;


public class WorldToolsCommands {

	/**
	 * 
	 * checks if the command is enabled
	 * 
	 * @param command
	 * @return true if the command is enabled
	 */
	public boolean isCommandEnabled(String command) {
		PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/Commands.properties");
		if (!f.containsKey(command)) {
			return false;
		} else {
			return Boolean.parseBoolean(f.getProperty(command));
		}
	}
}
