import java.util.List;


public class Sensor {

    private static int GLOBAL_ID;
    private int id;
    private String location;
    private List<Observer> observers;
    private boolean state;

    public Sensor(){
        this.id = id;
        this.location = location;
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

}
