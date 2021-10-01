import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONFormatter {
	private static Gson formatter = new GsonBuilder().setPrettyPrinting().create(); // pretty print

	public static String toJson(Object o) {
		return formatter.toJson(o);
	}
}
