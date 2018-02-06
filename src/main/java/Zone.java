public class Zone extends Observer{
    public String id;
    private int freeSpaces;

    public Zone(String id){
        this.id = id;
    }


    /***** Pattern Observer method *****/
    public void update(boolean sensorState){
        if (!sensorState){
            this.freeSpaces -= 1;
        }
        else {
            this.freeSpaces +=1;
        }
    }


    /***** Methods *****/
    public int getFreeSpace(){
        return this.freeSpaces;
    }


    public String getId(){
        return this.id;
    }
}