package oop;
// modifier (제어자)

// 접근제어자 : public, protected, default, private (범위 순서임)
// 기타 : static, final, abstract, synchronized, native ...

// static : 공통적인(공유) - Card클래스 참조

// final : 마지막의, 변경될 수 없는(클래스, 메소드, 멤버변수, 지역변수)
// final이 "클래스" 에 붙으면 : 상속금지!
// final이 "멤버/지역 변수" 에 붙으면 : 값 변경 불가능 (상수취급)
// final이 "메소드" 에 붙으면 : 오버라이딩 금지
// 따라서 final은 처음에 무조건 초기화 해줘야 함.

// <접근제어자> (캡슐화)
// public : 접근제한 없음
// private : 같은 클래스 내에서만 접근 가능
// default : 접근제어자 사용하지 않는 경우 ex) public class ModifierEx 가 아니라 class ModifierEx 같은 경우에
//         : 같은 패키지 내에서만 접근 가능
// protected : 같은 패키지 내에서, 다른 패키지라면 상속을 받은 경우 자손 클래스에서 접근 가능 

public class ModifierEx {

}
