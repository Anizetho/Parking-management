/**
 *Design Pattern abstract.
 */
public abstract class Observable {
    /**
     *Add observer into a Observable object.
     *@param o is the observer.
     */
    public abstract void addObserver(Observer o);
    /**
     *Remove observer from a Observable object.
     *@param o is the observer.
     */
    public abstract void removeObserver(Observer o);
    /**
     *Notify observer throw update function.
     */
    public abstract void notifyObservers();
}
