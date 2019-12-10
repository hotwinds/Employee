package com.matricon.employee;

import java.io.File;
import java.io.IOException;

public class FileExport {

    private final static String absolutePath = "D:\\Personal\\STEP STUD\\Java\\IntelijID\\Employee\\Employee.txt";
    public static File createTextFileAbsolute() throws IOException {
        System.out.println("---- Creating file with absolute location ----");

        File newTextFile = new File(absolutePath);
        boolean fileCreated = newTextFile.createNewFile();
        if (fileCreated) {
            System.out.println("File " + absolutePath + " created");
        } else {
            System.err.println("File " + absolutePath + " already exists");
        }
        return newTextFile;
    }
}
