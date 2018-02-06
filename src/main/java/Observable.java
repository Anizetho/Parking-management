/**
 *Design Pattern abstract.
 */
public abstract class Observable {
    /**
     *Add observer into a Observable object.
     *@param obs is the observer.
     */
    public abstract void addObserver(Observer obs);
    /**
     *Remove observer from a Observable object.
     *@param obs is the observer.
     */
    public abstract void removeObserver(Observer obs);
    /**
     *Notify observer throw update function.
     */
    public abstract void notifyObservers();
}
