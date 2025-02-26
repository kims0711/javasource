package condition;

public class ifTest1 {
    public static void main(String[] args) {
        //특정 조건을 만족하면 문장 실행
        // if(조건문) {}
        
        //특정 조건을 만족하면 구문1을 실행하고 만족하지 않을 때는 구문2 실행
        //if(조건문){구문1} else{구문2}

        int x = 0;
        if(x==0){
            System.out.println("x==0"); // T니까 실행
        }

        if(x!=0){
            System.out.println("x!=0"); //F니까 실행 X
        }

        if(!(x==0)){
            System.out.println("!(x==0)"); // !T 이기 때문에 F가 되어서 실행 X  
        }

        if(!(x!=0)){
            System.out.println("!(x!=0)"); // !F 니까 T가 되어서 실행
        }

    }
}
