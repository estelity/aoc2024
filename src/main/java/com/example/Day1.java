package com.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        
        // PART ONE
    
        // access input
        List<Integer> al = new ArrayList<>();

         try {
            FileReader filRdr = new FileReader("/Users/grace.shen/Personal/adventofcode/src/main/java/com/example/input.txt");
            Scanner Gage = new Scanner(filRdr);
        
            while (Gage.hasNext()) {               
                al.add(Gage.nextInt());
            }

        } catch(FileNotFoundException e){
            System.out.println("No File Found");
        };

        // split digits

        int total = 0;

        List<Integer> first = new ArrayList<>();
        List<Integer> second= new ArrayList<>();

        for (int j = 0; j < al.size(); j +=2){
            first.add(al.get(j));
        }

        for (int k = 1; k < al.size(); k +=2 ){
            second.add(al.get(k));
        }

        Collections.sort(first);
        Collections.sort(second);

        for (int i = 0; i < first.size(); i++){
            total += Math.abs(first.get(i) - second.get(i));
        }
        System.out.println("total: " + total);

        // PART TWO

        int appeared = 0;
        int total2 = 0;

        for (int i = 0; i < first.size(); i++){
            
            for (int elem : second){
                if (first.get(i) == elem){
                    appeared++;
                }
            }
            total2 += first.get(i) * appeared;
            appeared = 0; 
        }
        
        System.out.println("total2: " + total2);
    }
}