import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<Sensor> sensors = new ArrayList<Sensor>();
    private List<Zone> zones = new ArrayList<Zone>();

    public Parking() {
    }

    public boolean addSensor(String zoneToAdd) {
        Sensor sensor = new Sensor();
        for (Zone zone : this.zones) {
            if (zone.id == zoneToAdd) {
                sensor.addObserver(zone);
                this.sensors.add(sensor);
                return true;
            }
        }
        return false;
    }

    public void removeSensor(int id) {
        for (Sensor sensor : this.sensors) {
            if (sensor.getId() == id) {
                this.sensors.remove(sensor);
            }
        }
    }

    public void addZone(String id) {
        this.zones.add(new Zone(id));
    }


    public void removeZone(String id) {
        for (Zone zone: this.zones) {
            if (zone.getId() == id) {
                this.zones.remove(zone);
            }
        }
    }


    public boolean getSensorState(int id) {

        return this.sensors.get(id).getState();
    }


    public void getParkingState() {
        for (Zone zone : this.zones) {
            System.out.println(zone.getId());
            for (Sensor sensor : this.sensors) {
                if (sensor.getObservers().contains(zone)) {
                    System.out.println(sensor.getId() + " " + sensor.getState());
                }
            }
        }
    }


    public List<Sensor> getSensors() {

        return this.sensors;
    }

    public List<Zone> getZones() {

        return this.zones;
    }
}
