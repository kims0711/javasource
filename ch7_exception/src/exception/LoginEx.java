package exception;

public class LoginEx {
    public static void main(String[] args) {
        try {
            login("blue", "1234");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void login(String id, String pwd) throws NotExistIdException, WrongPasswordException { // login 메서드에서
                                                                                                  // Exception을
                                                                                                  // 감당해야함(login메서드에 던짐)
        if (!id.equals("blue")) {
            throw new NotExistIdException("아이디가 존재하지 않습니다");
        }

        if (!pwd.equals("12345")) {
            throw new WrongPasswordException("비밀번호가 일치하지 않습니다");
        }
    }

}
