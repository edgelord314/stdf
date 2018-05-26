package de.edgelord.stdf.writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class FileWriter {

    private File file;

    public FileWriter(File file) {
        this.file = file;
    }

    public void writeThrough(String text) throws IOException {

        if(!file.exists())
            file.createNewFile();

        java.io.FileWriter fw = new java.io.FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(text);
        bw.close();
    }

    public File getFile(){
        return file;
    }
}
