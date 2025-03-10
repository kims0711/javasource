package poly;

public class EmployeeEx {
    public static void main(String[] args) {
        Employee employee1 = new Employee(); // 본인 인스턴스
        employee1.setName("김민수");
        employee1.setPosition("사원");
        // employee1.work();
        doWork(employee1);

        employee1 = new Ceo();
        employee1.setName("홍길동");
        employee1.setPosition("대표");
        // employee1.work();
        doWork(employee1);

        employee1 = new PartTime();
        employee1.setName("김민성");
        employee1.setPosition("시간제");
        // employee1.work();
        doWork(employee1);

        employee1 = new Admin();
        employee1.setName("김세리");
        employee1.setPosition("관리자");
        // employee1.work();
        doWork(employee1);

    }

    static void doWork(Employee e) { // 실제로 생성되는 위의 new - Ceo,Parttime~~등등을 다 부모로 받아낼 수 있음
        e.work();
    }
}
