package io;
// 입력장치에서 읽어오기

import java.io.IOException;
import java.io.InputStream;
// 추상클래스 : 클래스 + 추상메서드, 직접 객체 생성불가, 부모역할
// int read(), int read(byte[] b, int off, int len), int read(byte b[])
// write(ind b), write(byte b[], int off, int len), write(byte b[])
import java.io.OutputStream;

public class InputStreamEx2 {
    // ~~Stream : 입력값 byte 형태로 처리 (문자, 이미지, 동영상)

    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            System.out.print("이름 : ");
            byte[] b = new byte[1024];
            int input = in.read(b);

            // String 객체 생성
            // enter : 캐리지리턴(13) + 라인피드(10) (바이트 배열에 2개 들어감)
            String name = new String(b, 0, input - 2); // ∴ -2는 엔터 때매
            System.out.println(name);

            // out.write(input);

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
