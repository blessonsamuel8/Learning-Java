package learning;

import java.io.*;
import java.util.*;

public class newClass {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1. Add new Contact"+ "\n" + "2. Remove Contact" + "\n" + "3. view contact");
			String options = br.readLine();
			boolean toBreak = false;
			switch (options) {
			case "1":
				System.out.println("Name:");
				String key = br.readLine();
				System.out.println("Phone Number:");
				String val = br.readLine();
				map.put(key, val);
				break;
			case "2":
				System.out.println("Name:");
				key = br.readLine();
				map.remove(key);
				break;
			case "3":
				System.out.println(map);
				break;

			default:
				toBreak = true;
				break;
			}
			
			if(toBreak) {
				System.out.println("Thank You");
				break;
			}
		}
		
		
	}

}
