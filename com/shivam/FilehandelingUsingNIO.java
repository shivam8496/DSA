package com.shivam;

//Using NIO
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilehandelingUsingNIO {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("C:/Users/Shivam/Documents/DSA/Lectures/lecture-1/java-tutorials/New-Folder");
            Path file=Paths.get("C:/Users/Shivam/Documents/DSA/Lectures/lecture-1/java-tutorials/New-Folder/file.txt");
            List<String> txt = Files.readAllLines(file);
            if (Files.exists(file))
            {
                for (String s: txt) {
                    System.out.println(s);
                }
            }
            else
            {
                Path donePath= Files.createFile(file);
                System.out.println("File succesfully created at "+donePath);
            }

        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
