import java.util.ArrayList;
import java.util.List;

/**
 *Sensor is Observable by a Zone.
 *Use to know if there is a car.
 */
public class Sensor extends Observable {

    /**
     *globalId is auto incremented.
     *which allows to have a unique id for each sensor.
     */
    private static int globalId = 0;
    /**
     *id is identifier of this sensor.
     */
    private int id;
    /**
     *observers contain all of the observers of the sensor.
     */
    private List<Observer> observers = new ArrayList<Observer>();
    /**
     *state is the current state of the sensor.
     *on true when the place is free
     */
    private boolean state = true;

    /**
     *Constructor of Sensor Class.
     */
    public Sensor() {
        this.id = ++globalId;

    }

    /**
     *Add observer into a Observable object.
     *@param o is the observer.
     */
    final public void addObserver(final Observer o) {
        this.observers.add(o);
        this.notifyObservers();
    }

    /**
     *remove observer into a Observable object.
     *@param o is the observer.
     */
    final public void removeObserver(final Observer o) {
        this.observers.remove(o);
        o.update(false);
    }

    /**
     *Notify observer throw update function.
     */
    final public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            this.observers.get(i).update(this.state);
        }
    }

    /**
     * Accessor of the state variable.
     * @return the current state of the sensor.
     */
    final public boolean getState() {
        return this.state;
    }

    /**
     * Accessor of the id variable.
     * @return the identifier of the sensor.
     */
    final public int getId() {
        return this.id;
    }

    /**
     * Accessor of the observers variable.
     * @return all of the observers of the sensor.
     */
    final public List<Observer> getObservers() {
        return this.observers;
    }
    /**
     * method that changes the state of the sensor.
     * and also warns the observer.
     */
    final public void switchState() {
        this.state = !this.state;
        this.notifyObservers();
    }
}
