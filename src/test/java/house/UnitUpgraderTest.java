package house;

import house.PenthouseSuite;
import house.Studio;
import house.UnitUpgrader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UnitUpgraderTest {
    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
//        UnitUpgrader upgrader = new UnitUpgrader();
        UnitUpgrader upgrader = new PentHouseUpgrader(); //방법 2용
        upgrader.upgrade(penthouse);

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();
//        UnitUpgrader upgrader = new UnitUpgrader();
        UnitUpgrader upgrader = new PentHouseUpgrader(); //방법 2용
        upgrader.upgrade(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
//        UnitUpgrader upgrader = new UnitUpgrader();
        UnitUpgrader upgrader = new StudioUpgrader(); //방법 2용
        upgrader.upgrade(studio);

        assertEquals(590, studio.squareFootage);
    }

    @Test
    public void testUpgraderDoesntAddBedroomToStudios() {
        Studio studio = new Studio();
//        UnitUpgrader upgrader = new UnitUpgrader();
        UnitUpgrader upgrader = new StudioUpgrader(); //방법 2용
        upgrader.upgrade(studio);

        assertEquals(0, studio.numberOfBedrooms);
    }
}
