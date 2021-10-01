import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONFormatter
{
    public static void main(String[] args)
    {
        Human human = new Human(20, "Black");
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // pretty print
        String prettyJson = gson.toJson(human);
        System.out.println(prettyJson);

    }
}
