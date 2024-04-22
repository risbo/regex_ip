package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    final static String PATTERN_IP = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" +
            "\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" +
            "\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" +
            "\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(PATTERN_IP);
        Matcher matcher = pattern.matcher("121.234.12.12");
        while(matcher.find()){
            System.out.print("Pattern Found -->" + matcher.group());
        }
    }
}

