package entity;

import java.util.Scanner;

public class Member {
    private String name;
    private int id;
    private String dob;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Exersise2.Member{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
    public void nhapThongTin(){
        System.out.println("Nhập tên:");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập ID:");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhập ngày sinh:");
        this.dob = new Scanner(System.in).nextLine();
        System.out.println("Nhập nghề nghiệp:");
        this.job = new Scanner(System.in).nextLine();
    }
}
