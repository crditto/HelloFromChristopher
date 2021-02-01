package ditto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String yourName = "Christopher";
        List<String> teamMatesNames = new ArrayList<>();
        teamMatesNames.add("Brayton");
        teamMatesNames.add("Darren");
        teamMatesNames.add("Mark");

        System.out.printf("Hello, my name is %s!%n", yourName);

        for (String name : teamMatesNames             ) {
            System.out.printf("Hello, " + yourName + " my name is %s!%n", name);
        }

    }
}