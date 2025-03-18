package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx {
    public static void main(String[] args) {
        // 문자기반 -> Stream보다 Reader/Writer가 나음

        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                Writer writer = new FileWriter("c:/temp/output2.txt", true)) { // Charset 지정해주면 한글 안 깨짐 +
                                                                               // append 개념도 가능(파일 새로 생성하지 않고 내용추가)
            int data = 0;
            char cbuf[] = new char[1024];
            while ((data = reader.read(cbuf)) != -1) {
                // System.out.print(cbuf); // 당연히 한글은 깨짐
                writer.write(cbuf);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
