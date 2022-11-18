package run;

import entity.Member;

import java.util.ArrayList;

public class MainRun {
    public static void main(String[] args) {
        ArrayList<Member> student = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Member member = new Member();
            member.nhapThongTin();
            student.add(member);
        }
        for (Member i : student){
            System.out.println(i);
        }
    }
}
