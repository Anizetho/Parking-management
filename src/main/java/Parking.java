import java.util.ArrayList;
import java.util.List;

public class Parking{

    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    public List<Zone> zones = new ArrayList<Zone>();

    public Parking(){ }

    /*
     *@pre -
     * @post -
     */
    public boolean addSensor(String zone_to_add){
        Sensor sensor = new Sensor();
        for (Zone zone : zones){
            if (zone.id == zone_to_add) {
                sensor.addObserver(zone);
                sensors.add(sensor);
                sensor.notifyObservers();
                return true;
            }
        }
        return false;
    }


    /*
     *@pre -
     * @post -
     */
    public void removeSensor(int id){
        for (Sensor sensor : sensors){
            if (sensor.getId() == id){
                sensors.remove(sensor);
            }
        }
    }


    /*
     *@pre -
     * @post -
     */
    public void addZone(String id){
        zones.add(new Zone(id));
;    }


    /*
     *@pre -
     * @post -
     */
    public void removeZone(String id){
        for (Zone zone: zones){
            if (zone.getId() == id){
                zones.remove(zone);
            }
        }
    }


    /*
     *@pre -
     * @post -
     */
    public boolean getSensorState(int id){
        return sensors.get(id).getState();
    }

    /*
     *@pre -
     * @post -
     */
    public void getParkingState(){
        for (Zone zone : zones){
            System.out.println(zone.getId());
            for (Sensor sensor : sensors){
                if (sensor.getObservers().contains(zone)){
                    System.out.println(sensor.getId()+" "+sensor.getState());
                }
            }
        }
    }


    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public java.util.List<Zone> getZones() {
        return zones;
    }
}
