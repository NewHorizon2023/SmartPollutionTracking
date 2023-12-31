package project.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServerPropertiesUtil {

	public static final String USERNAME_STRING = "user.username";
	public static final String PASSWORD_STRING = "user.password";

	public static final String TOKEN_SECRET_KEY = "token.secret";
	public static final String TOMEN_EXPIRATION_TIME = "token.expiration";

	private static Properties properties;

	static {
		// Load properties file in static code block
		properties = new Properties();
		try (InputStream inputStream = ServerPropertiesUtil.class.getClassLoader()
				.getResourceAsStream("properties/server_config.properties")) {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
