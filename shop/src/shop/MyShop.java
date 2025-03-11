package shop;

import java.util.Arrays;
import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // 고객 5명 저장 가능한 배열 생성하기
    private User[] users = new User[5];
    // 상품 목록 저장 가능한 배열
    Product[] products = new Product[10]; // 부모 타입으로 선언해야 종류가 다른 자식들을 같이 담을 수 있다
    // 장바구니 목록 저장 가능한 배열
    Product[] cart = new Product[10]; // cart 배열 (장바구니)

    Scanner sc = new Scanner(System.in);
    int num = 0; // cart배열에 차례대로 담기 위해 아예 num을 새로 선언하고

    // start()에서 선택된 user 보관 변수
    private String sellUser;

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public void genUser() {
        // 2명의 User 생성 후 배열객체에 담기
        users[0] = new User("minseong", PayType.CARD); // PayType.~~ ch1의 week 참조
        users[1] = new User("seri", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // 5개 제품 생성 후 배열객체에 담기 (tv2개, cellphone 3개)
        products[0] = new Tv("삼성 티비", 5000000, "4k");
        products[1] = new Tv("LG 티비", 4800000, "4k");
        products[2] = new CellPhone("아이폰14", 1200000, "skt");
        products[3] = new CellPhone("아이폰15", 1300000, "kt");
        products[4] = new CellPhone("아이폰 16", 1500000, "skt");
    }

    @Override
    public void start() {

        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("================================");
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                break; // null이면 멈추고 아니면 아래 실행
            System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
        }
        System.out.println("[x] 종료");
        System.out.println("================================");
        System.out.print("선택 : ");

        String input = sc.nextLine();

        int num = Integer.parseInt(input);
        switch (input) {
            case "0":
            case "1":
                // 사용자가 선택한 user 정보 담기(checkout()메서드 필요)
                sellUser = input;
                productList();
                break;
            case "x":
            case "X":
                System.out.println("종료");
                System.exit(0);
            default:
                System.out.println("입력을 확인해주세요");
                start(); // 다시 초기화면
                break;
        }
    }

    public void productList() {
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d] ", i++);
                product.pirntDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("================================");
        System.out.print("선택 : ");

        String input = sc.nextLine(); // 일단 String으로 받기
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                cart[num++] = products[Integer.parseInt(input)]; // num 초기값이 0이고 물건 cart에 담을때마다 ++
                // 다른 방식은 강사님 코드 참조 (for문 돌리는 방식)
                // String으로 입력되니까 int로 바꿔서 index 넘버로 쓰기
                System.out.println("현재 구매 수량: " + num + "개");
                productList();

                break;
            case "h":
                start();
            case "c":
                checkout();
                break;
            default:
                break;
        }
    }

    public void checkout() {
        System.out.println(title + users[Integer.parseInt(sellUser)].getName() + " - 체크아웃");
        System.out.println("================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제방법 : " + users[Integer.parseInt(sellUser)].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 : "); // p =>productList(), q=> 종료

        String input = sc.nextLine();
        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.exit(0);
            default:
                break;
        }

    }

}
