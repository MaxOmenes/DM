package ru.vsu.cs.ukhin.tools;

public class FileWriter {
    String path;
    private java.io.FileWriter f;


    public FileWriter(String path) {
        this.path = path;
        try {
            f = new java.io.FileWriter(path);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void print(String s){
        try {
            f.write(s);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void println(String s){
        print(s+"\n");
    }
    public void close() {
        try {
            f.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
