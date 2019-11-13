import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> records = new ArrayList<String>();
		String filename = "resources/data.txt";
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		      records.add(line);
		    }
		    reader.close();
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'.", filename);
		    e.printStackTrace();
		  }
		  
		int linha = 1;  
		for (String string : records) {
			
			System.out.println(linha + " | " + string);
			linha++;
		}
	}
}
