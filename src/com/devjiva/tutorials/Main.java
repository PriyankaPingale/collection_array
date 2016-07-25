package com.devjiva.tutorials;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> cities = new ArrayList<String>();

        //adding elements
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Kolkata");

        System.out.println(cities);

        for (String city:cities){
            System.out.println(city);
        }

    }
}
