package ru.vsu.cs.ukhin.tools;

import java.io.BufferedReader;

public class FileReader {
    String path;

    public FileReader(String path) {
        this.path = path;
    }

    public int[] read(){
        try {
            BufferedReader f = new BufferedReader(new java.io.FileReader(path));
            String s[] = f.readLine().split(",");
            int arr[] = new int[s.length];
            int i = 0;
            for(String s1:s){
                arr[i++] = Integer.parseInt(s1.trim());
            }
            return arr;

        }catch (Exception e){
            System.err.println(e.getMessage());
            return new int[0];
        }
    }
}
