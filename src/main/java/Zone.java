/**
 *Zone is the Observer.
 *Use to get freeSpace into the area.
 */
public class Zone extends Observer {
    public String id;
    private int freeSpaces;

    public Zone(String id) {
        this.id = id;
    }

    /**
     *Design Pattern Method.
     */
    public void update(boolean sensorState) {
        if (!sensorState) {
            this.freeSpaces -= 1;
        }
        else {
            this.freeSpaces +=1;
        }
    }

    /**
     *Method to access to the data.
     */
    public int getFreeSpace(){
        return this.freeSpaces;
    }


    public String getId(){
        return this.id;
    }
}