import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.io.FileInputStream;
import java.io.InputStream;



public class Program {
    /**
     *Cmd is a enum which contain all of the available command.
     */
    enum Cmd {
        show, change, sensor, free, exit
    }
    /**
     *myParking is the car park managed by the program.
     */
    private static Parking myParking = new Parking();


    /**
     *method used to simulate parking activity.
     */
    private static boolean simulator() {
        System.out.print("ParkingCMD > ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] parts = command.split(" ");
        try {
            Cmd cmd = Cmd.valueOf(parts[0]);
            int arg = 0;
            if (parts.length > 1) {
                arg = Integer.parseInt(parts[1]) - 1;
            }
            switch (cmd) {
                case show:
                    getMyParking().getParkingState();
                    break;
                case change:
                    getMyParking().getSensors().get(arg).switchState();
                    break;
                case sensor:
                    System.out.println(getMyParking().getSensorState(arg));
                    break;
                case free:
                    for (Zone zone : getMyParking().getZones()) {
                        System.out.println(zone.getId() + " " + zone.getFreeSpace());
                    }
                    break;
                case exit:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("bad option");
        }
        return true;
    }

    /**
     *method used to parse the database.
     * the database is store into a json file
     * and converted into a Hash map.
     */
    private static HashMap<String, List<Integer>> jsonToHashMap(final String filename) {
        try {
            InputStream input = new FileInputStream(filename);
            try {
                return new ObjectMapper().readValue(input, HashMap.class);
            } catch (IOException b) {
                System.out.println("Json to hash map conversion Failed");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Json File Not Found");
        }
        return new HashMap<String, List<Integer>>();
    }

    /**
     *method used to create the different objects present into the car park.
     */
    private static Parking init() {
        HashMap<String, List<Integer>> db = jsonToHashMap("src/Database.json");
        Parking park = new Parking();
        for (HashMap.Entry<String, List<Integer>> entry : db.entrySet()) {
            park.addZone(entry.getKey());
            for (int sensor : entry.getValue()) {
                park.addSensor(entry.getKey());
            }
        }
        return park;
    }

    /**
     * Accessor of the myParking variable.
     * @return the car park object.
     */
    private static Parking getMyParking() {
        return myParking;
    }

    /**
     *Main program.
     *(Super Loop model)
     */
    public static void main(final String[] args) {
        myParking = init();
        boolean loop = true;
        while (loop) {
            loop = simulator();
        }
    }
}
