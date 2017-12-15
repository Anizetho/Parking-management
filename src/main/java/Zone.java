public class Zone extends Observer{

    private int id;
    public int freeSpaces;

    public Zone(int id){
        this.id = id;
    }


    /***** Pattern Observer method *****/

    /*
     *@pre -
     *@post -
     */
    public void update(boolean sensorState){
        if (sensorState){
            this.freeSpaces -= 1;
        }
        else {
            this.freeSpaces +=1;
        }
    }


    /***** Methods *****/
    /*
     *@pre -
     * @post -
     */
    public int getFreeSpace(){
        return this.freeSpaces;
    }


    /*
     *@pre -
     * @post -
     */
    public int getId(){
        return this.id;
    }
}