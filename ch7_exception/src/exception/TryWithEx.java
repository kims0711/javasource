package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally { // finally -> 자원을 열고 "닫는" 용도로 많이 씀
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // try-with-resources : 자동 리소스 닫기
        // finally 필요 없어짐
        // 닫아야 할 것을 try의 소괄호 안에 넣으면 자동으로 리소스 닫아짐
        try (FileInputStream fis2 = new FileInputStream("file.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
