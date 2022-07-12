package uTest.Bancolombia.helpers;


import org.openqa.selenium.WebElement;


public class WebActions {


    private WebActions() {
    }

    public static void click(WebElement element) {
        final String ACTION = "click";
        try {
            element.click();
        } catch (Exception e) {
            ManagerLog.printFault(ACTION + AssertExceptions.getErrorStackTrace(e));
        }
    }

}
