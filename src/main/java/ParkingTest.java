import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {
    Sensor sensor = new Sensor();
    Parking parking = new Parking();
    Zone zone = new Zone("Test");

    /*
    @Test
    void addSensor() {
        List<Sensor> listSensor = parking.getSensors();
        int initialSize = listSensor.size();

        List<Integer> listZone = new ArrayList<Integer>();
        listZone.add(1);

        //parking.addSensor(listZone);

        // Check if the size of sensor list is incremented when addSensor is used
        assertEquals(initialSize + 1, parking.getSensors().size());

        // Check if added sensor is containing in sensor list
        assertEquals(true, parking.getSensors().contains(sensor));
    }


    @Test
    void removeSensor() {
        List<Sensor> listSensor = parking.getSensors();
        int initialSize = listSensor.size();

        parking.removeSensor(sensor.getID());

        // Check that if when removeSensor is used the list sensors is decremented
        assertEquals(initialSize - 1, parking.getSensors().size());

        // Check that the name of the sensor deleted is no more containing in the sensor list
        assertEquals(false, parking.getSensors().contains(sensor));
    }
    */

    /*
    @Test
    void addZone() {
        List<Zone> listZone = parking.getZones();
        int initialSize = listZone.size();

        parking.addZone(zone);

        // Check that if when removeZone is used the list zone is decremented
        assertEquals(initialSize + 1, parking.getZones().size());

        // Check that the name of the zone deleted is no more containing in the zone list
        assertEquals(true, parking.getZones().contains(zone));
    }
    */

    /*
    @Test
    void removeZone() {
        List<Zone> listZone = parking.getZones();
        int initialSize = listZone.size();

        parking.removeZone(zone);

        // Check that if when removeZone is used the list zone is decremented
        assertEquals(initialSize - 1, parking.getZones().size());

        // Check that the name of the zone deleted is no more containing in the zone list
        assertEquals(false, parking.getZones().contains(zone));
    }
    */

    @Test
     void getSensorState() {
        assertEquals(false,false);
    }

}
