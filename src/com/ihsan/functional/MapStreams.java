package com.ihsan.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("PM", "Mohamed", "Ihsan", "PMI");

        names.stream()
                .filter(name -> name.length() != 3)
                .map(new Function<String, Character>() {
                    @Override
                    public Character apply(String name) {
                        return name.charAt(0);
                    }
                })
                .forEach(System.out::println);

        names.stream()
                .filter(name -> name.length() != 3)
                .map(String::toCharArray)
                .forEach(MapStreams::printArray);

        List<Character> nameList = names.stream()
                .filter(name -> name.length() != 3)
                .map(name -> name.charAt(0))
                .collect(Collectors.toList());

        System.out.println(nameList);
    }

    public static void printArray(char[] a){
        System.out.println(Arrays.toString(a));
    }
}
