package com.codedifferently.labs.partA.ex01;

public class Countdown {
    public static String countDownLoop() {
        String response = "";
        for (int i = 5; i >= 0; i--) {
            response += i + " ";
        }
        return response;
    }

    public static String countUpLoop() {
        String response = "";
        for (int i = 0; i <= 5; i++) {
            response += i + " ";
        }
        return response;
    }

    public static String evenNumbers(){
        String response = "";
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0){response += i + " ";}
        }
        return response;
    }
    public static void main(String[] args) {

        System.out.println("Countdown to Launch: ");

        String outputFromDown = countDownLoop();
        System.out.println(outputFromDown);

        System.out.println("Blast Off!");

        System.out.println("CountUp to Launch One: ");

        String outputCountUp = countUpLoop();
        System.out.println(outputCountUp);

        System.out.println("Blast Off!");

        System.out.println(evenNumbers());
    }
}
