public class Main {
	public static void main(String[] args) {

		Human human = new Human(20, "Black");

		WriteToFile.writeToFile(JSONFormatter.toJson(human));

		System.out.println(JSONFormatter.toJson(human));

	}
}
