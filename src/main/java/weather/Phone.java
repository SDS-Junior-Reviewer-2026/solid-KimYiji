package weather;

public class Phone implements Notifier{

    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}