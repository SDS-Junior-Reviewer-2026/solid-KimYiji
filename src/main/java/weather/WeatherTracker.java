package weather;

public class WeatherTracker {
    String currentConditions;
    Notifier notifier;
    NotifierFactory notifierFactory;


    public WeatherTracker(NotifierFactory notifierFactory) {
        this.notifierFactory = notifierFactory;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        notifier = notifierFactory.createNotifier(currentConditions);
        alertCurrentConditions(currentConditions);
    }

    private void alertCurrentConditions(String currentConditions) {
        System.out.print(notifier.generateWeatherAlert(currentConditions)); //println 대신 print Window 이슈
    }


}