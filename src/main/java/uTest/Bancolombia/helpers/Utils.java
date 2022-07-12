package uTest.Bancolombia.helpers;

import com.github.javafaker.Faker;

import java.util.*;

import static uTest.Bancolombia.helpers.WebActions.click;
import static uTest.Bancolombia.ui.frmCreateUser.RegiserDevicesUi.*;
import static uTest.Bancolombia.ui.frmCreateUser.RegistreAboutYourSelfUi.getLocatorLanguagesList;


public class Utils {
    private Utils(){ }

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    private static final List<String> dataCities = new ArrayList<>();
    private static final List<String> dataCredentials = new ArrayList<>();
    private static final String LOG_CLASE = "Utils -> ";


    public static int getNumberRandonForSelectALanguages() {
        return faker.number().numberBetween(Constant.ONE, getLocatorLanguagesList().size());
    }

    public static void selectRandomLanguages(){
        click(getLocatorLanguagesList().get(getNumberRandonForSelectALanguages()));
    }

    public static List<String> generateCities() {
        dataCities.add(faker.options().option("BOGOTA", "MEDELLIN", "CALI", "BUCARAMANGA", "PASTO", "VALLEDUPAR", "SANTAMARTA", "BARRANQUILLA"));
        ManagerLog.printSuccessful(LOG_CLASE + "the generation of the address was generated successfully");
        return dataCities;
    }

    public static int getNumberRandonForSelectAYourMobileDevicesList() {
        return faker.number().numberBetween(Constant.ZERO, getYourMobileDevicesList().size());
    }

    public static void selectYourMobileDevices(){
        click(getYourMobileDevicesList().get(getNumberRandonForSelectAYourMobileDevicesList()));
    }

    public static int getNumberRandonForSelectAModelList() {
        return faker.number().numberBetween(Constant.ZERO, getModelList().size());
    }

    public static void selectModelList(){
        click(getModelList().get(getNumberRandonForSelectAModelList()));
    }

    public static int getNumberRandonForSelectAOperatingSystemList() {
        return faker.number().numberBetween(Constant.ZERO, getOperatingSystemList().size());
    }

    public static void selectOperatingSystemList(){
        click(getOperatingSystemList().get(getNumberRandonForSelectAOperatingSystemList()));
    }

    public static List<String> getPassword() {
        dataCredentials.add("RXN0YUVzVW5hQ29udHJhc2XDsWEyMDIyKys=");
        return dataCredentials;
    }

    public static String decode64(String texto){
        String text = new String(Base64.getDecoder().decode(texto));
        return text;
    }

}
