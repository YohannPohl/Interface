public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        // Log no console
        consoleLogger.log("debug", LogLevel.DEBUG);
        consoleLogger.log("aviso", LogLevel.WARNING);
        consoleLogger.log("erro", LogLevel.ERROR);

        // Log no arquivo
        fileLogger.log("debug", LogLevel.DEBUG);
        fileLogger.log("aviso", LogLevel.WARNING);
        fileLogger.log("erro", LogLevel.ERROR);
    }
}
