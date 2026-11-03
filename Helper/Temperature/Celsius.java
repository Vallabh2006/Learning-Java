package Helper.Temperature;

public class Celsius {

    public static float celsius2kelvin(float celsius){
        return celsius + 273.15f;
    }
    public static float celsius2fahrenheit(float celsius) {
        return (celsius * 1.8f) + (32f);
    }
    public static float celsius2fahrenheit(float celsius, int precision){
        float multiplier = (float)Math.pow(10, precision);
        return Math.round(((celsius * 1.8f) + 32f) * multiplier) / multiplier;
    }

}