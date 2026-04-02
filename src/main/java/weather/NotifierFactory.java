package weather;

public class NotifierFactory {
    public Notifier createNotifier(String weatherDescription) {
        if (weatherDescription.equals("rainy")) {
            return new Phone();
        }else if (weatherDescription.equals("sunny")) {
            return new Email();
        }else {
            throw new IllegalArgumentException("Invalid weather description");
        }
    }
}
