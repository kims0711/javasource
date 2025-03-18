package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx3 {
    public static void main(String[] args) {
        // 문자기반 -> Stream보다 Reader/Writer가 나음

        try (Reader reader = new FileReader("./ch10_io/src/io/FileEx1.java", Charset.forName("utf-8")); // Charset.forName("utf-8")
                // 인코딩 방식 지정하여 한글 안 깨지게
                BufferedReader br = new BufferedReader(reader);) {
            String str = "";
            int i = 1;
            while ((str = br.readLine()) != null) {
                System.out.printf("%d %s\n", i++, str); // 행 번호도 같이 출력되도록

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
