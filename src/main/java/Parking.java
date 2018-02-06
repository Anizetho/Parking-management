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
    /*public void removeSensor(int id){

    }*/


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
    /*public void removeZone(){

    }*/


    /*
     *@pre -
     * @post -
     */
    /*public boolean getSensorState(int id){
        // A MODIFIER
        return false;
    }*/



    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public java.util.List<Zone> getZones() {
        return zones;
    }
}
