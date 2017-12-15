import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    Sensor sensor = new Sensor();
    Zone zone = new Zone();

    @Test
    void addObserver() {
        List<Observer> listObserver = sensor.getObservers();
        int initialSize = listObserver.size();

        sensor.addObserver(zone);

        // Check if the size of observers list is incremented when addObserver is used
        assertEquals(initialSize + 1, sensor.getObservers().size());

        // Check if added observer is containing in observers list
        assertEquals(true, sensor.getObservers().contains(zone));
    }


    @Test
    void removeObserver(){
        List<Observer> listObserver = sensor.getObservers();
        int initialSize = listObserver.size();

        sensor.removeObserver(zone);

        // Check if the size of observers list is incremented when addObserver is used
        assertEquals(initialSize - 1, sensor.getObservers().size());

        // Check if added observer is containing in observers list
        assertEquals(false, sensor.getObservers().contains(zone));

    }

    @Test
    void notifyObservers() {
        assertEquals(false, false);
    }

}
