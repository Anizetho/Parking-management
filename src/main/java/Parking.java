import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

/**
 * Parking is class which manage the element of a car park.
 */
public class Parking {

    /**
     *sensors contain all of the sensors in the car park.
     */
    private List<Sensor> sensors = new ArrayList<Sensor>();
    /**
     *zones contain all of the zone in the car park.
     */
    private List<Zone> zones = new ArrayList<Zone>();

    /**
     *Constructor of Parking Class.
     */
    public Parking() {
    }
    
    /**
     *Add sensor into the car park.
     *@param zoneToAdd is the zone where we put the sensor.
     *@return is boolean to have a feedback.
     */
    public final boolean addSensor(final String zoneToAdd) {
        Sensor sensor = new Sensor();
        for (Zone zone : this.zones) {
            if (zone.getId() == zoneToAdd) {
                sensor.addObserver(zone);
                this.sensors.add(sensor);
                return true;
            }
        }
        return false;
    }
    /**
     *Remove sensor into the car park.
     */
    public final void removeSensor(final int id) {
        for (Sensor sensor : this.sensors) {
            if (sensor.getId() == id) {
                this.sensors.remove(sensor);
            }
        }
    }
    /**
     *Add zone into the car park.
     *@param id is identifier a the new zone.
     */
    public final void addZone(final String id) {
        this.zones.add(new Zone(id));
    }
    /**
     *Remove zone from the car park.
     */
    public final void removeZone(final String id) {
        for (Zone zone: this.zones) {
            if (zone.getId() == id) {
                this.zones.remove(zone);
            }
        }
    }

    /**
     *Used to know the state of a specific sensor
     *@param id is the identifier of the sensor
     *@return is the state of the sensor
     */
    public final boolean getSensorState(final int id) {

        return this.sensors.get(id).getState();
    }

    /**
     *used to show the state of the all of the car park.
     */
    public final void getParkingState() {
        for (Zone zone : this.zones) {
            out.println(zone.getId());
            for (Sensor sensor : this.sensors) {
                if (sensor.getObservers().contains(zone)) {
                    out.println(sensor.getId() + " " + sensor.getState());
                }
            }
        }
    }

    /**
     * Accessor of the sensors variable.
     * @return all of the sensors in the car park
     */
    public final List<Sensor> getSensors() {
        return this.sensors;
    }
    /**
     * Accessor of the zones variable.
     * @return the all of the zones in the car park
     */
    public final List<Zone> getZones() {
        return this.zones;
    }
}
