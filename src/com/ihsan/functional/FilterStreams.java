package com.ihsan.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterStreams {
    public static void main(String[] args) {
        List<String>  names = Arrays.asList("Ihsan", "PM", "Mohamed", "PMI");

        names.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String name) {
                        return !name.equals("PM");
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String name) {
                        System.out.println(name);
                    }
                });

        names.stream()
                .filter(name -> !name.equals("PM"))
                .forEach(System.out::println);

    }
}
