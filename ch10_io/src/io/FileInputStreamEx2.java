package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        byte b[] = new byte[1024];

        try {
            fis = new FileInputStream("c:/temp/sample.jpg");
            fos = new FileOutputStream("c:/temp/output1.jpg"); // temp에 output.txt 파일 하나 만들기
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
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
