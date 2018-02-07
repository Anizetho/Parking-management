/**
 *Zone is the Observer.
 *Use to get freeSpace into the area.
 */
public class Zone extends Observer {
    /**
     *id is identifier of this zone.
     */
    private String id;
    /**
     *freeSpace reference the number of free space in this zone.
     */
    private int freeSpaces;

    /**
     *Constructor of Zone Class.
     * @param givenId is the identifier.
     */
    public Zone(String givenId) {
        this.id = givenId;
    }

    /**
     *Design Pattern Method.
     * @param sensorState is the state from the notifyObservers method.
     */
    public void update(boolean sensorState) {
        if (!sensorState) {
            this.freeSpaces -= 1;
        } else {
            this.freeSpaces += 1;
        }
    }
    /**
     *Accessor to the number of free space in this zone.
     */
    public int getFreeSpace() {
        return this.freeSpaces;
    }

    /**
     *Accessor to the identifier of this zone.
     */
    public String getId() {
        return this.id;
    }
}
