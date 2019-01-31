package NParray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    private int bottom;
    private Student[] secG;
    public Arrays1(int len){
        secG=new Student[len];
        bottom=-1;
    }
    public void insert(Student s1){
        if(bottom!=secG.length-1) {
            bottom++;
            secG[bottom] = s1;
        }
    }
    public void display(){
        for (Student stu:secG) {
            System.out.println(stu);
        }

    }

    public static void main(String[] args) {
        Arrays1 list=new Arrays1(37);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length");
        int len=s.nextInt();
        for (int i = 0; i < len; i++) {
            Student s1=new Student();
            System.out.println("enter rno and name of "+(i+1)+" student");
            s1.setRno(s.nextInt());
            s1.setName(s.nextLine());
            list.insert(s1);
        }
        list.display();
    }
}
class Student{
    private int rno;
    private String name;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("("+getName()+" "+getRno()+")");
    }
}