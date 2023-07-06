package com.lendingcatalog.util;

import com.lendingcatalog.util.exception.FileStorageException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStorageService {

    // Requirement: File I/O
    public static void writeContentsToFile(String contents, String filename, boolean appendFile) {
      try {
          FileWriter fileWriter = new FileWriter(filename, appendFile);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          bufferedWriter.write(contents);
          bufferedWriter.newLine();
          bufferedWriter.close();
      } catch (IOException e) {
          throw new RuntimeException("Error writing to file: " + filename, e);
      }
    }


    public static List<String> readContentsOfFile(String filename) throws FileStorageException {
        List<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + filename, e);
        }
        return lines;
    }

}
