package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<City> cities = new HashSet<>();
        cities.add(new City(21, "Bishkek"));
        cities.add(new City(35, "Osh"));
        cities.add(new City(24, "Jalal-Abad"));
        cities.add(new City(17, "Batken"));
        cities.add(new City(28, "Talas"));
        cities.add(new City(56, "Naryn"));
        cities.add(new City(13, "Yssykkul"));
        cities.add(new City(27, "Karakol"));

        Set<City> oddNumbersCities = new TreeSet<>(cities);
        for (City cities1 : oddNumbersCities) {
            if (cities1.getCode() % 2 != 0) {
                System.out.println(cities1);
            }
        }
    }
}
