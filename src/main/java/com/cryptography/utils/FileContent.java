package com.cryptography.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileContent {
    public String getContent(String path) {
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = reader.readLine()) != null){
                result.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error with reading path of input file!!!" + e);
        }
        return result.toString();
    }
}
