package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Scanner;

public class WriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아들여서 그 내용을 파일에 작성하는 프로그램
        // 사용자가 q를 입력하면 입력 중지, 입력된 내용들 파일에 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("파일에 작성할 내용 입력");
        System.out.println("중지 : q ");

        String data = "";
        String result = "";
        do {
            System.out.print(">> ");
            data = sc.nextLine();
            result += data;

        } while (!data.equalsIgnoreCase("q"));

        try (FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try (Reader reader = new FileReader("c:/temp/file1.txt",
        // Charset.forName("utf-8"));
        // BufferedReader br = new BufferedReader(reader);
        // Writer writer = new FileWriter("c:/temp/output3.txt");
        // BufferedWriter bw = new BufferedWriter(writer);) {

        // if (br.readLine() != null) {
        // bw.write(input);
        // bw.newLine();
        // } else if (input == "q") {
        // sc.close();
        // }

        // } catch (IOException e) {

        // e.printStackTrace();
        // }

    }

}
