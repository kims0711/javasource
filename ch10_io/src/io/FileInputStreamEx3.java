package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
    public static void main(String[] args) {

        int data = 0;
        byte b[] = new byte[1024];

        try (FileInputStream fis = new FileInputStream("c:/temp/sample.jpg");
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.jpg");) {

            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                // System.out.println(ch); // 한글은 깨져서 출력됨
                fos.write(b); // output.txt파일에 b값 넣기 (파일 복사 개념)
            }
            // fis.read();
            long end = System.currentTimeMillis();
            System.out.println("걸린 시간 : " + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
