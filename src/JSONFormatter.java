import com.google.gson.Gson;

public class JSONFormatter {
	private static Gson formatter = new Gson();

	public static String toJson(Object o) {
		return formatter.toJson(o);
	}
}
