package com.tokenization;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenization {
    public static void main(String[] args) {
        String result = ""; 
        StringBuilder sBuilder = new StringBuilder(result);
        System.out.println("sBuilder: " + result);

        String line = "My name is, vaishnavi. I live in Mumbai.";
        
        StringTokenizer tokens = new StringTokenizer(line, " ,;().:");

        String[] tokenArray = new String[tokens.countTokens()];
        int i = 0;
        while (tokens.hasMoreTokens()) {
            tokenArray[i] = tokens.nextToken();
            i++;
        }
        
        for (String token : tokenArray) {
            System.out.println(token);
        }
        
        System.out.println("Total number of tokens: " + tokenArray.length);
        
        System.out.println("Token Array: " + Arrays.toString(tokenArray));
    }
}