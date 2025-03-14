package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    public static void main(String[] args) {
        // 한 어린이의 키를 2015~2024년 사이에 1년 단위로 입력받기
        // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
        // 입력 예시 : 120 122 125 130 139 142 156 159 162 164

        // <내가 한 거>
        // 1) 입력받아서 리스트에 담기
        // String input = "";
        // for (int i = 2015; i < 2025; i++) {
        // System.out.printf("%d 년도의 키 입력 : ", i);
        // input += scanner.nextLine();
        // input += " ";
        // }
        // String[] arr = input.split(" ");
        // List<String> list = Arrays.asList(arr);

        ArrayList<Integer> heights = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("10년 동안의 키를 입력해주세요");
        System.out.println("입력 예시 : 120 122 125 130 139 142 156 159 162 164");
        System.out.print(">> ");
        String input = scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(input); // 분리자 없으면 공백으로
        while (tokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }
        // 비교하기
        int diff = 0; // 출력 후보 값 저장 공간
        int pos = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int sub = list.get(i + 1) - list.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }
        }
        System.out.printf("가장 키가 많이 자란 년도는 %d년, 키는 %d cm ", (pos + 2015), diff);
        scanner.close();

    }
}
