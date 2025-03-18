package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/file1.txt");
            fos = new FileOutputStream("c:/temp/output1.txt"); // temp에 output.txt 파일 하나 만들기
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                // System.out.println(ch); // 한글은 깨져서 출력됨
                fos.write(ch); // output.txt파일에 ch값 넣기 (파일 복사 개념)
            }
            // fis.read();

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
