package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class day3 {
    
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();

         try {
            FileReader filRdr = new FileReader("C:/Users/grace/Downloads/personal/adventofcode/src/main/java/com/example/input.txt");
            Scanner scanner = new Scanner(filRdr);
        
            while (scanner.hasNextLine()) {           
                
        }

        } catch(FileNotFoundException e){
            System.out.println("No File Found");
        };
    }
}
