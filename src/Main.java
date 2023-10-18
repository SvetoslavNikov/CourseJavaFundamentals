import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            // Replace 'YOUR_API_KEY' with your actual API key
            String apiKey = "YOUR_API_KEY";
            String city = "New York";

            // Create a URL for the weather API
            String apiUrl = "https://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + city;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Get the API response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();

            // Print the weather data
            System.out.println("Weather Data for " + city + ":");
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
