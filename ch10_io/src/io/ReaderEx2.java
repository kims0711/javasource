package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx2 {
    public static void main(String[] args) {
        // 문자기반 -> Stream보다 Reader/Writer가 나음

        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8")); // Charset.forName("utf-8")
                                                                                            // 인코딩 방식 지정하여 한글 안 깨지게
                BufferedReader br = new BufferedReader(reader);
                Writer writer = new FileWriter("c:/temp/output2.txt");
                BufferedWriter bw = new BufferedWriter(writer);) {

            int data = 0;

            String str = "";

            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
