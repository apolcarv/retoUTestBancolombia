package uTest.Bancolombia.helpers;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static uTest.Bancolombia.helpers.WebActions.click;
import static uTest.Bancolombia.ui.frmCreateUser.RegistreAboutYourSelfUi.*;

public class Date {
    private Date() {
    }

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    public static int getNumberYearRandom() {
        return faker.number().numberBetween(Constant.TWO, getlocatorListYear().size());
    }

    public static void selectRandomYear() {
        click(getlocatorListYear().get(getNumberYearRandom()));
    }

    public static int getNumberMonthRandom() {
        return faker.number().numberBetween(Constant.TWO, getlocatorListMonth().size());
    }

    public static void selectRandomMonth() {
        click(getlocatorListMonth().get(getNumberMonthRandom()));
    }

    public static int getNumberDayRandom() {
        return faker.number().numberBetween(Constant.TWO, getlocatorListDay().size());
    }

    public static void selectRandomDay() {
        click(getlocatorListDay().get(getNumberDayRandom()));
    }

}
