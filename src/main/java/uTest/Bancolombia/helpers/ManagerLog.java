package uTest.Bancolombia.helpers;


import java.util.logging.Logger;


public class ManagerLog {

    static Logger logger = Logger.getLogger("MyLog");
    private ManagerLog(){
    }

    public static void printMessage(String message) {
        logger.info(message);
    }

    public static void  printFault(String message) {
        logger.info(message);
    }

    public static void printSuccessful(String message) {
        logger.info(message);
    }



}
