....

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(Sting args[]){
        try{
            FileReader fr=new FileReader("PGprogramme.csv");
            
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\John\\Desktop\\PGprogramme.csv"));
            String line = reader.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                if (tokens[0].equals("5")) {
                    System.out.println(line);
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class CSVReader {
 
    public static void main(String[] args) {
 
        CSVReader reader = new CSVReader();
        reader.run();
    }
 
    public void run() {
 
        String csvFile = "PGprogramme.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
 
        try {
 
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
 
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
 
                System.out.println("Programme duration: " + country[0] 
                                 + " , Programme name: " + country[1] 
                                 + " , Programme Specialization: " + country[2]);
 
            }
        }
    }

// Write this much, we are completing it and sending more



catch(Exception e){
    System.out.println(e.toString());
}
































































public class moovitolBrinda{

}