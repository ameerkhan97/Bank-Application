package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	//This method will read data from a CSV file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String datarow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((datarow = br.readLine()) != null) {
				String[] datarecords = datarow.split(",");
				data.add(datarecords);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		return data;
	}

}
