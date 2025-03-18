package io;
// Bufferd I/O Stream

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
// import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {
    public static void main(String[] args) {

        int data = 0;
        byte b[] = new byte[1024];

        try (FileInputStream fis = new FileInputStream("c:/temp/sample.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos);) {

            while ((data = fis.read(b)) != -1) {

                fos.write(b);
            }
            bos.flush(); // 버퍼 지워내는 작업 (colse랑 같은 개념?)

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
