package com.rodrigomoreira;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileProcessor {

    private String file;

    public FileProcessor(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public static void main(String[] args)throws IOException{

        FileProcessor fp = new FileProcessor("file.txt");
        process(fp.getFile());
    }

    public static void process(String f)throws IOException{

        File file = new File(f);
        Map<String,String> map = new HashMap<>();
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            String line = "";

            while (sc.hasNextLine()){
                
                line = sc.nextLine();

                InvalidFormatException.checkFormat(line);

                String[] vect = line.split("->");
                for (int i=0; i < vect.length - 1; i+=2){
                    map.put(vect[i], vect[i+1]);
                }
                
            }

            EmptyFileException.checkFormat(line);

        }
        catch (IOException e) {
            throw new IOException("Error opening file: " + e.getMessage());
        } 
        catch (InvalidFormatException e){
            System.out.println(e.getMessage());
        }
        catch (EmptyFileException e){
            System.out.println(e.getMessage());
        }     
        finally {
            if (sc != null){
                sc.close();
            }
        }

        System.out.println(map);
    }

}
