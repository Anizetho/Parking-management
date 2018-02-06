import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.io.FileInputStream;
import java.io.InputStream;



public class Program {
	enum Cmd {
		show, change
	}

	public static Parking my_parking = new Parking();

	public static void simulator() {
		System.out.print("ParkingCMD > ");
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		String[] parts = command.split(" ");
		try {
			Cmd cmd = Cmd.valueOf(parts[0]);
			switch (cmd){
				case show:
					for (Zone zone : my_parking.getZones()){
						System.out.println(zone.getId()+" "+zone.getFreeSpace());
					}

					break;
				case change:
					my_parking.getSensors().get(Integer.parseInt(parts[1])).switchState();
					break;
			}
		}
		catch(Exception e){
			System.out.println("no option");
		}
	}

	public static HashMap<String,List<Integer>> json_to_hash_map(String filename){
		try {
			InputStream input = new FileInputStream(filename);
			try {
				return  new ObjectMapper().readValue(input, HashMap.class);
			}
			catch(IOException b){
				System.out.println("Json to hash map conversion Failed");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Json File Not Found");
		}
		return new HashMap<String,List<Integer>>();
	}

	public static Parking init(){
		HashMap<String,List<Integer>> db = json_to_hash_map("src/Database.json");
		Parking park = new Parking();
		for(HashMap.Entry<String, List<Integer>> entry : db.entrySet()) {
			park.addZone(entry.getKey());
			for(int sensor: entry.getValue()) {
			  park.addSensor(entry.getKey());
			}
		}
	    return park;
	}

	public static void main(String [] args) {
		my_parking = init();
		while(true) {
		    simulator();
		}
	}
}