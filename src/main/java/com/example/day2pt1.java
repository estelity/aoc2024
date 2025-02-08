package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class day2pt1 {
    public static void main(String[] args) {

        // PART ONE

        int safe = 0;
    
        // access input
        ArrayList<Integer> al = new ArrayList<>();

         try {
            FileReader filRdr = new FileReader("C:/Users/grace/Downloads/personal/adventofcode/src/main/java/com/example/input.txt");
            Scanner scanner = new Scanner(filRdr);
        
            while (scanner.hasNextLine()) {           
                String line = scanner.nextLine(); // Read the entire line
                String[] parts = line.split("\\s+"); // Split by spaces or whitespace

                for (int i = 0; i < parts.length; i++){
                    al.add(Integer.parseInt(parts[i]));
                }

                if (inc(al) || dec(al)){
                    if(interval(al)){
                        safe++;
                    }
                }

                al.clear();
        }

        } catch(FileNotFoundException e){
            System.out.println("No File Found");
        };

        System.out.println(safe);


    }

    private static boolean inc(ArrayList<Integer> digits){
        int prev = digits.get(0);
        for (int i = 1; i < digits.size(); i++){
            if (prev > digits.get(i)){
                return false;
            }
            prev = digits.get(i);
        }

        return true;
    }

    private static boolean dec(ArrayList<Integer> digits){
        int prev = digits.get(0);
        for (int i = 1; i < digits.size(); i++){
            if (prev < digits.get(i)){
                return false;
            }
            prev = digits.get(i);
        }

        return true;
    }

    private static boolean interval(ArrayList<Integer> digits){
        int prev = digits.get(0);
        for (int i = 1; i < digits.size(); i++){
            if(Math.abs(digits.get(i) - prev) < 1 || Math.abs(digits.get(i) - prev) > 3){
                return false;
            }
            prev = digits.get(i);
        }
        
        return true;
    }

}

