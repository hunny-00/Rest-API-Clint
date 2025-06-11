public class Main {
    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        String city = "Dehradun";
        client.fetchWeatherData(city);
    }
}
