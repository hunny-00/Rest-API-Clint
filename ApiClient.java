import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiClient {
    public void fetchWeatherData(String city) {
        try {
            String urlString = "https://wttr.in/" + city + "?format=j1"; // JSON format
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder jsonResponse = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                jsonResponse.append(line);
            }
            in.close();

            parseWeatherData(jsonResponse.toString(), city);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void parseWeatherData(String json, String city) {
        JSONObject obj = new JSONObject(json);

        JSONObject current = obj.getJSONArray("current_condition").getJSONObject(0);
        String tempC = current.getString("temp_C");
        String humidity = current.getString("humidity");
        String desc = current.getJSONArray("weatherDesc").getJSONObject(0).getString("value");

        System.out.println("\nWeather in " + city + ":");
        System.out.println("Temperature: " + tempC + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Condition: " + desc);
    }
}
