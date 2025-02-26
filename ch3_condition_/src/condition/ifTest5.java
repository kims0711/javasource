package condition;

public class ifTest5 {
    public static void main(String[] args) {
        //주사위 1~6

        System.out.println(Math.random()); // Math.random 실행할때마다 랜덤한 값을 출력함  범위: [0.0 , 1.0)

        int num = (int)(Math.random() * 6) + 1; // 1~6
        //(Math.random() *6) 은 0~5니까
        
        

        // num이 n이면 n 나왔습니다. 나오게 출력하기 (n=1~6)

        if(num==1){
            System.out.println("1이 나왔습니다");
        }else if(num==2){
            System.out.println("2가 나왔습니다");
        }else if(num==3){
            System.out.println("3이 나왔습니다");
        }else if(num==4){
            System.out.println("4가 나왔습니다");
        }else if(num==5){
            System.out.println("5가 나왔습니다");
        }else{
            System.out.println("6이 나왔습니다");
        } 

    }
}
