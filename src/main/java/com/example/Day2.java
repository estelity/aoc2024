package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        // PART ONE
    
        // access input
        List<Integer> al = new ArrayList<>();

         try {
            FileReader filRdr = new FileReader("/Users/grace.shen/Personal/adventofcode/src/main/java/com/example/testinput.txt");
            Scanner scanner = new Scanner(filRdr);
        
            while (scanner.hasNextLine()) {           
                String line = scanner.nextLine(); // Read the entire line
                String[] parts = line.split("\\s+"); // Split by spaces or whitespace

                // Combine the integers into a single number as a String
                StringBuilder combined = new StringBuilder();
                for (String part : parts) {
                    combined.append(part); // Append each part
                }
                String result = combined.toString();
 
                al.add(Integer.parseInt(result));
        }

        } catch(FileNotFoundException e){
            System.out.println("No File Found");
        };

        System.out.println(al.toString());
    }
}

