import java.util.ArrayList;
import java.util.List;


/**
 *
 */
public class Sensor {

    private static int globalId = 0;
    private int id;
    private String location;
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean state;

    public Sensor(){
        this.id = ++globalId;

    }

    /***** Pattern Observer methods *****/

	/*
	 *@pre -
	 *@post -
	 */
    public void addObserver(Observer obs){
        this.observers.add(obs);
    }

    /*
     *@pre -
     *@post -
     */
    public void removeObserver(Observer obs){

    }

    /*
     *@pre -
     *@post -
     */
    public void notifyObservers(){
        for(int i = 0; i<observers.size(); i++){
            observers.get(i).update(this.state);
        }
    }

    /***** Methods *****/

	/*
	 *@pre -
	 *@post -
	 */
    public boolean getState() {
        return this.state;
    }

    /*
     *@pre -
     *@post -
     */
    public int getId(){
        return this.id;
    }

    /*
     *@pre -
     *@post -
     */
    public void switchState(){
        this.state = !this.state;
        this.notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
