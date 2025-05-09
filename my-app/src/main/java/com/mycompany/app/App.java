package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        String ipAddress = Task2.getIpAddress();
        System.out.println("\nTask2: Your IP address is: " + ipAddress);

        System.out.println("\nTask3");
        Task3.getWeatherForecast();
    }
}
