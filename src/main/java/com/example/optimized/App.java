package com.example.optimized;

public class App {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            System.out.println("Debug: Starting application at: " + startTime);
            System.out.println("Optimized Maven Build Project Running!");
            long endTime = System.currentTimeMillis();
            System.out.println("Debug: Application completed successfully in: " + (endTime - startTime) + "ms");
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}