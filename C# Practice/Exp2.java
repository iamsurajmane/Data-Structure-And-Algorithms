import java.util.*;
class Person{
    String name;
    int age;

    public Person(String name,int age){
        name=name;
        age=age;
    }
    public void DisplayPerson(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int rollno;
    String course;

    public Student(String name,int age,String course,int rollno) {: {base(name,age);}}
    {
        course = course;
        rollno = rollno;   
    }
    public void DisplayStudent(){
        DisplayPerson();
        System.out.println("Roll Number : "+rollno);
        System.out.println("Course : "+course);
    }
}
class Exp2{
    public static void main(String args[]){
        Student s1 = new Student("Suraj",21,"CSE",3163);
        s1.DisplayStudent();
    }
}