import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> properties = loadProperties();
        //new RestController ???
        RestController restController  = RestController.getInstance(properties.get("sqlServerUrl"));
        restController.getCustomer("my-id");
    }

    private static Map<String, String> loadProperties() {
        return Collections.singletonMap("sqlServerUrl", "localhost:765/sql");
    }
}