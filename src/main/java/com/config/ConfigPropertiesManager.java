package com.config;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropertiesManager {
	
	public static Properties LoadProperties(String path) throws Exception {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream(path);
		properties.load(file);
		file.close();
		return properties;
	}
	}
