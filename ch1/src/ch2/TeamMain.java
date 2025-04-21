package ch2;

public class TeamMain {
    public static void main(String[] args) {
        Team team1 = new Team(1L, "manU");

        TeamMember member1 = new TeamMember(1L, "브루노");
        TeamMember member2 = new TeamMember(2L, "오나나");

        member1.setTeam(team1);
        member2.setTeam(team1);
        System.out.println(member1);
        // TeamMember [id=1, userName=브루노, team=Team [id=1, teamName=manU]]
        System.out.println(member1.getTeam().getTeamName());
        // 객체 그래프 탐색 (member 입장에서 팀 정보 가져오기)

        System.out.println();
        System.out.println("팀=>멤버 조회");

        // 팀 => 멤버 정보 조회
        team1.getList().add(member1);
        team1.getList().add(member2);

        System.out.println(team1.getList());
    }
}
