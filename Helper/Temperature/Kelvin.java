package Helper.Temperature;

public class Kelvin {

    public static float kelvin2celsius(float kelvin){
        return kelvin - 273.15f;
    }
    public static float kelvin2fahrenheit(float kelvin) {
        return Celsius.celsius2fahrenheit(kelvin2celsius(kelvin));
    }
    public static float kelvin2fahrenheit(float kelvin, int precision){
        float multiplier = (float)Math.pow(10, precision);
        return Math.round(Celsius.celsius2fahrenheit(kelvin2celsius(kelvin)) * multiplier) / multiplier ;
    }

    public static float kelvin2celsius(float kelvin, int precision){
        float multiplier = (float)Math.pow(10, precision);
        return Math.round(Fahrenheit.fahrenheit2celsius(kelvin2fahrenheit(kelvin)) * multiplier) / multiplier ;
    }

}