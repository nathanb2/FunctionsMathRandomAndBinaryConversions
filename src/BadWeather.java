import java.util.Random;

public class BadWeather {

    //constants for factors and delta
    public static final float CELSIUS_FARENEIHT_FACTOR = 1.8f;
    public static final float CELSIUS_FARENEIHT_DELTA = 32;

    //fun convert c to f return converted power 4
    public static int badCelsiusToFareneight(int temperature){
        int fareneightTemp = 0;

        fareneightTemp = (int) (temperature * CELSIUS_FARENEIHT_FACTOR + CELSIUS_FARENEIHT_DELTA);
        fareneightTemp = (int) Math.pow(fareneightTemp, 4);
        return fareneightTemp;
    }

    //fun convert f to c return converted power 4

    public static int badFareneightToCelsius(int temperature){
        int celsiusTemp = 0;

        celsiusTemp = (int) ((temperature - CELSIUS_FARENEIHT_DELTA) / CELSIUS_FARENEIHT_FACTOR);
        celsiusTemp = (int) Math.pow(celsiusTemp, 4);
        return celsiusTemp;
    }

    //fun return random temp in c between 100-200

    public static int tempCelsiusRandomPrevision(){
        int temperature = 0;
        Random random = new Random();

        temperature =  random.nextInt(100, 200);

        return temperature;
    }
}
