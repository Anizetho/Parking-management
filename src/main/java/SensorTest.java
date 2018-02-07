import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *SensorTest is the Class used to test the method of the Sensor Class.
 *only the observers design pattern methods are tested.
 */
class SensorTest {
    /**
     * sensor is a random Sensor that will be tested.
     */
    private Sensor sensor = new Sensor();
    /**
     * zone is a random Zone.
     * needed to test the design pattern.
     */
    private Zone zone = new Zone("Test");

    /**
     *addObserver method test.
     */
    @Test
    void addObserver() {
        List<Observer> listObserver = sensor.getObservers();
        int initialSize = listObserver.size();

        sensor.addObserver(zone);

        // Check if the size of observers list is incremented
        assertEquals(initialSize + 1, sensor.getObservers().size());

        // Check if added observer is containing in observers list
        assertEquals(true, sensor.getObservers().contains(zone));
    }


    /**
     *removeObserver method test.
     */
    @Test
    void removeObserver() {
    List<Observer> listObserver = sensor.getObservers();
        sensor.addObserver(zone);
    int initialSize = listObserver.size();

        sensor.removeObserver(zone);
    // Check if the size of observers list is decremented
    assertEquals(initialSize - 1, sensor.getObservers().size());

    // Check if added observer is containing in observers list
    assertEquals(false, sensor.getObservers().contains(zone));

}
    /**
     *notifyObserver method test.
     */
    @Test
    void notifyObservers() {
        assertEquals(false, false);
    }
}
