package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
//        languages.put("Java", "a compiled HL, OO, PI language");
        languages.put("Python", "an interpreted, OO, HL programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lips", "Therein lines madness"));

//        System.out.println(languages.get("Java"));
//        System.out.println(languages.put("Java", "this course is about Java"));
//        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
            System.out.println("Java added successfully");
        }

        System.out.println("===========================================");

//        languages.remove("Lips");
//        if(languages.remove("Algol", "an algorithmic language")){
        if(languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lips", "Therein lines madness", "a functional programming language")){
            System.out.println("Lips replaced");
        } else {
            System.out.println("Lips was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

        for (String  key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
