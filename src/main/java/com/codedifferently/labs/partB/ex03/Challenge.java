package com.codedifferently.labs.partB.ex03;

public class Challenge {
    public static String challenge(){
        String response = "";
        String[] list = {"Mario", "Fire John", "Tommy", "GRef", "zoo we mama","lastly asd"};

        for (var i = 0; i < list.length; i++){
            response += list[i]+ "\n";
        }

        return response;
    }

    public static void main(String[] args) {

        String outputFromChallenge = challenge();
        System.out.println(outputFromChallenge);
    }
}
