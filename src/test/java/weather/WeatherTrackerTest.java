package weather;

import weather.WeatherTracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class WeatherTrackerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final NotifierFactory notifierFactory = new NotifierFactory(); // 변경

    @Test
    public void testReturnsCurrentWeather() {
        WeatherTracker tracker = new WeatherTracker(notifierFactory); // 파라미터 형태 변경됨.
        tracker.setCurrentConditions("rainy");

        assertEquals("rainy", tracker.currentConditions);
    }

    @Test
    public void testAlertsPhoneUsersWhenRaining() {
        WeatherTracker tracker = new WeatherTracker(notifierFactory);
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }

    @Test
    public void testAlertsViaEmailWhenSunny() {
        WeatherTracker tracker = new WeatherTracker(notifierFactory);
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}
