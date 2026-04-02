package weather;

public class Email implements Notifier{

    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}