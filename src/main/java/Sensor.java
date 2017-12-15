import java.util.List;


/**
 *
 */
public class Sensor {

    private static int globalId;
    private int sensorId;
    private String location;
    private List<Observer> observers;
    private boolean state;

    public Sensor(){
        this.sensorId = ++globalId;
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

    }


    /***** Methods *****/

	/*
	 *@pre -
	 *@post -
	 */
    public boolean getState() {
        // A MODIFIER
        return false;
    }


    /*
     *@pre -
     *@post -
     */
    public int getID(){
        // A MODIFIER
        return 0;
    }


    /*
     *@pre -
     *@post -
     */
    public void setState(boolean state){

    }

    public List<Observer> getObservers() {
        return observers;
    }
}
