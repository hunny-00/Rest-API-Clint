# Rest-API-Clint
*COMPANY*: CODTECH IT SOLUTIONS
*NAME*: ANAS KHAN
*INTERN ID*: CT0DKK359
*DOMAIN*: JAVA PROGRAMMING
*DURATION*: 8 WEEKS
*MENTOR*: NEELA SANTOSH
*DESCRIPTION*:

## 🧠 Project Overview

This project is a **Java-based REST API Client** that demonstrates how to consume data from a public REST API and display it in a structured format. The API used in this project is the **OpenWeatherMap API**, which provides real-time weather information for cities across the globe. REST APIs (Representational State Transfer) are the backbone of modern web services and are used for communication between client-server applications. This project is designed to help Java developers understand how to make HTTP requests, handle responses, and parse JSON data using standard Java libraries.

## 🚀 Features Implemented

### ✅ 1. HTTP GET Request
- Sends a GET request to the OpenWeatherMap API.
- Constructs URL dynamically based on the city name entered by the user.
- Handles HTTP response status codes.

### ✅ 2. JSON Parsing
- Parses JSON data returned by the API.
- Extracts key information such as:
  - City Name
  - Temperature
  - Humidity
  - Weather Description
- Uses `org.json` or `Gson` for easy parsing.


### ✅ 3. Error Handling
- Invalid city name? Shows user-friendly error.
- Network issue? Displays fallback message.
- API error (like 404 or 401)? Graceful handling.

## 💡 Why This Project is Useful

### 🔸 For Learning
- Teaches HTTP networking in Java.
- Builds confidence in using REST APIs.
- Practical JSON parsing experience (real-world data).

### 🔸 For Projects
- Useful in weather apps, travel apps, dashboards, etc.
- Can be extended to show forecasts, maps, graphs.

### 🔸 For Interviews
- REST APIs + JSON parsing = 🔥 combo topic in coding rounds.
- Showcasing this project demonstrates practical backend/API skills.

## 🌐 API Used

- [OpenWeatherMap API](https://openweathermap.org/api)
- Endpoint: https://api.openweathermap.org/data/2.5/weather?q=%7Bcity%7D&appid=%7BAPI_KEY%7D&units=metric

📝 Note: You need to get a free API key from [https://openweathermap.org/appid](https://openweathermap.org/appid)

## 🛠 How to Run

### 1. Open project in IntelliJ IDEA
### 2. Add `json.jar` or `gson.jar` to project via:
> File > Project Structure > Modules > Dependencies

### 3. Replace `API_KEY` in code with your OpenWeatherMap API key

### 4. Run `WeatherFetcher.java`
### 5. Enter a city name → Get structured weather info in console

## 🔐 Error Handling Logic

| Scenario | Response |
|----------|----------|
| City not found | "City not found. Please check the name." |
| API key invalid | "Invalid API key or request." |
| Internet down | Catches and prints `IOException` |

## ✅ Benefits of This Project

- Learn to **connect Java with live external services**
- Understand **JSON structures** and parsing techniques
- Reusable logic for any kind of API (weather, finance, news, etc.)
- Forms basis for more advanced Java projects like:
- Currency converters
- Flight trackers
- News aggregators

## 🙌 Conclusion

This Java REST API client is a powerful example of integrating external data into your applications. From learning how to send GET requests, to parsing real-world JSON responses and displaying structured data — this project is a complete package. Whether you're a student, developer, or someone preparing for Java interviews, this REST API Client will significantly boost your portfolio and skillset.


