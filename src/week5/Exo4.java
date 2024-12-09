package week5;

import java.io.*;

public class Exo4 {

    public static void readFile() {
        try{
            File file = new File("C:\\Users\\Best Hp\\eclipse-workspace\\week5\\src\\week5\\file.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);

        }catch (IOException e){
            System.out.println(" File not found :"+e.getMessage());
        }
        
    }

    public static void main(String[] args) throws Exception {

        readFile();


    }
}