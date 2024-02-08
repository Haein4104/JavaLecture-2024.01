package mysql.sec01_basic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Ex04_Properties {

	public static void main(String[] args) {
		// 절대 경로
		Properties prop = new Properties();			// Map<String, String>
		String path = "C:/Workspace/Java/lesson/src/mysql/mysql.properties";
		try {
			InputStream is = new FileInputStream(path);
			prop.load(is);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String host = prop.getProperty("host");
		String port = prop.getProperty("port");
		String database = prop.getProperty("database");
		
		String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
		System.out.println(connStr);
		System.out.println("DriverManager.getConnection(connStr, user, password);");
	}

}