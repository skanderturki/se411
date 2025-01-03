import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reference tutorial: https://www.youtube.com/watch?v=tMLEbGJ2z7I
 */
public class App {
	
	static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		
		logger.debug("debug-selem");
		logger.info("info-selem");
		logger.warn("warn-selem");
		logger.error("error-selem");
		
		int result = sum(2, 3);
		System.err.println("2 + 3 is " + result);

	}

	private static int sum(int a, int b) {
		return a + b;
	}

}
