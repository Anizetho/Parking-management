import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;


public class Program {
	enum Cmd {
		show, add
	}

	static private void check(String command)
	{
		String[] parts = command.split(" ");
		try {
			Cmd cmd = Cmd.valueOf(parts[0]);
			switch (cmd){
				case show:
					System.out.print("show with ");
					System.out.println(parts[1]);
					break;
				case add:
					System.out.print("add with ");
					System.out.println(parts[1]);
					break;
			}
		}
		catch(Exception e){
			System.out.println("no option");
		}
	}

	public static HashMap<String,Object> Jsontohasmap(String filename){
		try{
			InputStream input = new FileInputStream(filename);
			try{
				return  new ObjectMapper().readValue(input, HashMap.class);}
			catch(IOException b){
				System.out.println("Json to hash map conversion Failed");
			}}
		catch(FileNotFoundException e)
		{
			System.out.println("Json File Not Found");
		}
		return new HashMap<String,Object>();
	}

	public static void main(String [] args) {
		HashMap<String,Object> db = Jsontohasmap("src/Database.json");
		System.out.println(db);
	while(true) {
		System.out.print("ParkingCMD > ");
		Scanner scanner = new Scanner(System.in);
		String cmd = scanner.nextLine();
		check(cmd);
	}
	}
}