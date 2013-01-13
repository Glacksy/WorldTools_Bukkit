package com.TopicaRP.WorldTools.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.TopicaRP.WorldTools.Files.WorldToolsMysql;

public class WorldToolsConnection {
		  Logger log = Logger.getLogger("Minecraft");
		  WorldToolsMysql mysql = new WorldToolsMysql();

		   boolean useSql;
		   boolean connected;
		   String SQLdriver;
		   String SQLusername;
		   String SQLpassword;
		   String SQLdb;

	/**
	 * 
	 * loads the MySQL Connection
	 * 
	 */
	public void loadSettings() {
		useSql = mysql.useMysql();
		SQLdriver = mysql.getDriver();
		SQLusername = mysql.getUser();
		SQLpassword = mysql.getPass();
		SQLdb = mysql.getDataBase();
		getConnection();
	}

	/**
	 * 
	 * gets the MySQLConnection
	 * 
	 * @return null if we could not create connection
	 * @return connection if we got connection
	 */
	public Connection getConnection() {
		if (useSql) {
			try {
				return DriverManager.getConnection(SQLdb+ "?autoReconnect=true&user=" + SQLusername+ "&password=" + SQLpassword);
			} catch (SQLException ex) {
				log.log(Level.SEVERE,
						"[WorldTools] exception while connection to database");
			}
		}
		connected = false;
		return null;
	}
}
