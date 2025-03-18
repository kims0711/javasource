package io;
// 입력장치에서 읽어오기

import java.io.IOException;
import java.io.InputStream;
// 추상클래스 : 클래스 + 추상메서드, 직접 객체 생성불가, 부모역할
// int read(), int read(byte[] b, int off, int len), int read(byte b[])
// write(ind b), write(byte b[], int off, int len), write(byte b[])
import java.io.OutputStream;

public class InputStreamEx1 {
    // ~~Stream : 입력값 byte 형태로 처리 (문자, 이미지, 동영상)

    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // read : 한 바이트만 읽어서 int로 돌려줌 (영어, 숫자만 가능하고 한글은 불가능)
            // ㄴ> 그래서 전부 출력하려고 아래 while문 사용
            // int input = in.read() // abc 입력
            // out.write(input); // a 출력 (근데 아래처럼 짜면 다 나옴)

            // int input = in.read();

            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }
            // out.write(input);

            byte[] b = new byte[1024]; // 바이트 단위로
            while (in.read(b) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
