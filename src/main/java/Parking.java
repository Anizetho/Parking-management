import java.util.List;

public class Parking{

    private List<Sensor> sensors;
    private List<Zone> zones;

    public Parking(){ }


    /*
     *@pre -
     * @post -
     */
    public boolean addSensor(List<Integer> idZone){
        Sensor sensor = new Sensor();
        for(int i = 0; i < idZone.size(); i++ ){
            boolean found = false;
            for(int j = 0; j < zones.size(); j++){
                if (idZone.get(i) == zones.get(j).getId()){
                    sensor.addObserver(zones.get(j));
                    found = true;
                }
            }
            if(!found){
                return false;
            }
        }
        sensors.add(sensor);
        sensor.notifyObservers();
        return true;
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
    public void addZone(int id){
        this.zones.add(new Zone(id));
    }


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



    public java.util.List<Sensor> getSensors() {
        return sensors;
    }
}
