/**
 *Design Pattern abstract.
 */
public abstract class Observer {
    /**
     *@param state is the state from the notifyObservers method.
     */
    public abstract void update(boolean state);
}
