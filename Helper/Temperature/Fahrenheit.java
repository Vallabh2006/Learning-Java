package Helper.Temperature;

public class Fahrenheit {

    public static float fahrenheit2kelvin(float fahrenheit){
        return fahrenheit2celsius(fahrenheit) + 273.15f;
    }
    public static float fahrenheit2celsius(float fahrenheit){
        return (fahrenheit - 32f) * (5f/9f);
    }
    public static float fahrenheit2celsius(float fahrenheit, int precision){
        float multiplier = (float)Math.pow(10, precision);
        return Math.round((fahrenheit - 32f) * (5f/9f) * multiplier) / multiplier;
    }

}
