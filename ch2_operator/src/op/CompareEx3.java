package op;

public class CompareEx3{
    public static void main(String[] args) {
      //문자열 : "" 사용함   ex: "a", "abc"
      
      //변수선언 : 기본타입(ch1-VarByteEx1 참조하기)
      //자바에서 문자열은 기본타입으로 선언하지 않는다.객체타입으로 선언 (대문자로 시작하면 객체타입)

      String str1 = "abc"; 
      String str2 = "abc"; //이 방식으로 문자열을 저장하는 공간과
      String str3 = new String("abc"); //이 방식으로 문자열을 저장하는 공간이 다르다 
      //두번째 출력문에서 false가 출력되는 이유임

      //스트링pool에 같은 값의 문자열을 다른 n개의 변수에 대응될 때 새로 값을 만들어 저장하는 것이 아닌 하나의 값에 주소만 지정함 따라서 str1과 str2가 같다고 나오는 것
      //str3는 heap에 새롭게 값이 생성되어 주소가 지정되기 때문에 다르다고 출력되는 것
       

      System.out.printf("str1 == str2 = %b\n",(str1 == str2)); //true
      //같은 공간에서 저장된 문자열을 == 비교하면 true 출력됨 ->값만을 비교하는 것이기 때문
      
      System.out.printf("str1 == str3 = %b\n",(str1 == str3)); // false 출력됨 why? :  
      //다른 공간에서 저장된 문자열을 == 비교하면 주소비교가 되기 때문에 false가 출력되는 것
      System.out.printf("str1 == str3 = %b\n",(str1.equals(str3)));  
      System.out.printf("str1 == str3 = %b\n",(str1.equals("ABC")));  
      System.out.printf("str1 == str3 = %b\n",(str1.equalsIgnoreCase(str3)));  //equalsIgnoreCase()는 대소문자 무시
      System.out.printf("str1 == str3 = %b\n",(str1.equalsIgnoreCase("ABC")));  

      //따라서 결론 : 문자열 비교는 == 대신에 equals(), equalsIgnoreCase() 를 사용하자
      System.out.println("\n");
      System.out.println("<혼자 해본거>");
      String str4 = new String("asd");
      String str5 = new String("asd");
      System.out.printf("str4랑 str5 비교해보기 = %b\n",(str4 == str5));
      System.out.printf("str4랑 str5 equals로 비교해보기 = %b\n",str4.equals(str5));

    
    }
}