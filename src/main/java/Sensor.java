import java.util.ArrayList;
import java.util.List;


public class Sensor extends Observable{

    private static int globalId = 0;
    private int id;
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean state = true;

    public Sensor(){
        this.id = ++globalId;

    }

    /***** Pattern Observer methods *****/
    public void addObserver(Observer obs){
        this.observers.add(obs);
        this.notifyObservers();
    }


    public void removeObserver(Observer obs){
        this.observers.remove(obs);
        obs.update(false);
    }


    public void notifyObservers(){
        for(int i = 0; i<observers.size(); i++){
            this.observers.get(i).update(this.state);
        }
    }

    /***** Methods *****/
    public boolean getState() {
        return this.state;
    }


    public int getId(){
        return this.id;
    }


    public void switchState(){
        this.state = !this.state;
        this.notifyObservers();
    }

    public List<Observer> getObservers() {
        return this.observers;
    }
}
