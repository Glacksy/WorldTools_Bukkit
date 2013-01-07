package com.TopicaRP.WorldTools.Mysql;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.TopicaRP.WorldTools.PropertiesFile;

public class WorldToolsConnection {
		  private static Logger log = Logger.getLogger("Minecraft");

		  static boolean useSql;
		  static boolean enabled;
		  static String SQLdriver = "com.mysql.jdbc.Driver";
		  static String SQLusername = "root";
		  static String SQLpassword = "root";
		  static String SQLdb = "jdbc:mysql://localhost:3306/minecraft";


		public void loadSettings()
		  {
		    
		    if (!new File("/plugins/config/WorldTools/MySQL.properties").exists()) {
		      try {
				File f = new File("plugins/config/WorldTools/MySQL.properties");
				BufferedWriter out = new BufferedWriter(new FileWriter(f));
		        out.newLine();
		        out.write("#Your Mysql Driver");
		        out.write("SQLdriver=com.mysql.jdbc.Driver");out.newLine();
		        out.newLine();
		        out.write("#Your Mysql UserName");
		        out.write("SQLuser=root");out.newLine();
		        out.newLine();
		        out.write("#Your Mysql Password");
		        out.write("SQLpass=root");out.newLine();
		        out.newLine();
		        out.write("#Your Mysql DataBase");
			    out.write("SQLdb=jdbc:mysql://localhost:3306/minecraft");out.newLine();
				out.newLine();
				out.close();
				} catch (IOException e) {
					log.info("[WorldTools] - Error during creating SQL propertiesfile!");
					e.printStackTrace();
				}
		    }
		    PropertiesFile properties = new PropertiesFile("/plugins/config/WorldTools/MySQL.properties");
		    try {
		      SQLdriver = properties.getProperty("SQLdriver");
		      SQLusername = properties.getProperty("SQLuser");
		      SQLpassword = properties.getProperty("SQLpass");
		      SQLdb = properties.getProperty("SQLdb");
		    }
		    catch (Exception e) {
		      log.log(Level.SEVERE, 
		        "Exception while reading from the mysql properties", e);
		    }
		    getConnection();
		  }

		public Connection getConnection(){
		        try {
		                return DriverManager.getConnection(SQLdb + "?autoReconnect=true&user=" + SQLusername + "&password=" + SQLpassword);
		        } catch (SQLException ex) {
		                log.info("[WorldTools] exception while connection to database");
		        }
		        enabled = false;
		        return null;
		}
}
