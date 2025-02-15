package univali.bit.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileIO {
    /**
     * Read all lines from text file
     * @param path name of file to read in local path files
     * @return string data in lines of file
     */
    public static ArrayList<String> readLines(String path) {
        BufferedReader reader;
        ArrayList<String> lines = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(path));

            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();

            return lines;
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found '" + path + "'\n");
            System.out.println("StackTrace: " + Arrays.toString(fileNotFoundException.getStackTrace()));
        }
        catch (IOException ioEx){
            System.out.println("Fail to read file");
        }

        return null;
    }
}
