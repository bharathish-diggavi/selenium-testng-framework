package example.example.util;

import org.apache.log4j.Logger;

import example.example.listeners.LogListener;

/**
 * The Class has all Logging related utilities.
 *
 * @author Bharathish
 */
public class LoggerUtil {

	/** The logger. */
	private static Logger logger = Logger.getLogger(LogListener.class);

	/**
	 * Log.
	 *
	 * @param message the message
	 */
	public static void log(String message) {
		logger.info(message);
	}

	/**
	 * Gets the logger.
	 *
	 * @return the logger
	 */
	public static Logger getLogger() {
		return logger;
	}
}
