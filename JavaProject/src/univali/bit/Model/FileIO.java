package univali.bit.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        try {
            File file = new File(path);
            ArrayList<String> lines = new ArrayList<>();
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine())
                lines.add(myReader.nextLine());

            return lines;
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found '" + path + "'\n");
            System.out.println("StackTrace: " + Arrays.toString(fileNotFoundException.getStackTrace()));
            return null;
        }
    }
}
