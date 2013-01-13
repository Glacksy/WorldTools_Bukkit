package com.TopicaRP.WorldTools.Files;


public class WorldToolsCommands {

	public boolean isCommandEnabled(String command) {
		PropertiesFile f = new PropertiesFile("plugins/config/WorldTools/Commands.properties");
		if (!f.containsKey(command)) {
			return false;
		} else {
			return Boolean.parseBoolean(f.getProperty(command));
		}
	}
}
