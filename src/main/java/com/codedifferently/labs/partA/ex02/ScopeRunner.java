package com.codedifferently.labs.partA.ex02;

public class ScopeRunner {

    public static String scope(){
        String response = "";

        for (int i = 64; i >0; i=i/2 ){
            response += i +" ";
        }

        response += "\n";

        for(int j = 0; j<=5; j++){
            response +=j +" ";
        }
        response += "\n";

        for(int j = 5; j>=0; j--){
            response += j +" ";
        }

        response += "\n";
        for(int k = 2; k<=64; k=k*2){
            response += k +" ";
        }
        response += "\n";

        return response;

    }
    public static void main(String[] args) {
        String scopeRunner = scope();
        System.out.print(scopeRunner);

    }}
