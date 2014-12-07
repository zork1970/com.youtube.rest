package com.youtube.dao;

import javax.naming.*;
import javax.sql.*;

public class Oracle308tube {

	private static DataSource Oracle308tube = null;
	private static Context context = null;

	public static DataSource Oracle308tubeConn() throws Exception {
		/**
		 * check to see if the database object is already defined... if it is,
		 * then return the connection, no need to look it up again.
		 */
		if (Oracle308tube != null) {
			return Oracle308tube;
		}
		try {
			/**
			 * This only needs to run one time to get the database object.
			 * context is used to lookup the database object in weblogic
			 * Oracle308tube will hold the database object
			 */
			if (context == null) {
				context = new InitialContext();
			}
			Oracle308tube = (DataSource) context.lookup("oracledb");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Oracle308tube;
	}
}
