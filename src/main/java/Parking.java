import java.util.List;

public class Parking{

    private List<Sensor> sensors;
    private List<Zone> zones;

    public Parking(){

    }


    /*
     *@pre -
     * @post -
     */
    public void addSensor(Sensor sensor){
        Sensor sensorAdded = new Sensor();
    }


    /*
     *@pre -
     * @post -
     */
    public void removeSensor(int id){

    }


    /*
     *@pre -
     * @post -
     */
    public void addZone(Zone zone){

    }


    /*
     *@pre -
     * @post -
     */
    public void removeZone(Zone zone){

    }


    /*
     *@pre -
     * @post -
     */
    public boolean getSensorState(int id){
        // A MODIFIER
        return false;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Zone> getZones() {
        return zones;
    }
}
