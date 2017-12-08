import java.util.List;


public class Sensor {

    public static int ID = 0;
    private List<Observer> observers;
    private boolean state;

    public Sensor(){

    }

    /***** Pattern Observer methods *****/

	/*
	 *@pre -
	 *@post -
	 */
    public void addObserver(Observer obs){

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
