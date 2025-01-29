package com.codedifferently.labs.partB.ex01;

public class CountByTens {
    public static String countingByTens() {
        String response = "";

        for(int i = 1; i < 101; i++){
            if (i % 10 == 0) {
                response += i;
                response += "\n";
            }
        }

        return response;
    }

    public static void main(String[] args) {
        String counting = countingByTens();
        System.out.print(counting);
    }
}
