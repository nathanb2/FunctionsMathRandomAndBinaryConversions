import java.util.Random;

public class Main {



    public static void main(String[] args) {

        //create BadWather instance and call the 3 fun
        System.out.println(BadWeather.badCelsiusToFareneight(3));
        System.out.println(BadWeather.badFareneightToCelsius(3));
        System.out.println(BadWeather.tempCelsiusRandomPrevision());
    }

}