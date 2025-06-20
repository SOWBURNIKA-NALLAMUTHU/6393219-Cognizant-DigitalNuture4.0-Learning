package SingletonPatternExample;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("First log message");
        logger2.log("Second log message");
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.Singleton works");
        } else {
            System.out.println("Different instances exist.Singleton failed.");
        }
    }
}
