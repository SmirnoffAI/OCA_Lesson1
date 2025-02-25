package Lesson27;

import java.io.*;
import java.lang.Exception;

public class JavaIO {
    public static void main(String[] args) throws Exception {
        File f = new File("test.txt");

        // Поток для записи.
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(111);
        fos.close();

        //Поток для чтения.
        FileInputStream fis = new FileInputStream(f);
        System.out.println(fis.read());
        fis.close();
    }


}
