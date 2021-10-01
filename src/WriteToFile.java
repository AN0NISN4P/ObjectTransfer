import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
	public static void writeToFile(String txt) {
		try {
			FileWriter fw = new FileWriter("document.json");
			fw.write(txt);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}