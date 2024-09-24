// Singleton Logger class
class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Demo
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Application running");

        // Both logger and anotherLogger are the same instance
        System.out.println(logger == anotherLogger); // Output: true
    }
}
