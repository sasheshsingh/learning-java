class Student{
    int rollNo;
    String name;
    int age;
}

public class Classes {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Sashesh";
        s1.age = 24;
        s1.rollNo = 1;
        Student s2 = new Student();
        s2.name = "Tim";
        s2.rollNo = 2;
        s2.age = 20;
        s2.rollNo = 2;
        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Dom";
        s3.rollNo = 20;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println(s1.name + " " + s1.rollNo + " " + s1.age);
        System.out.println(s2.name + " " + s2.rollNo + " " + s2.age);
        System.out.println(s3.name + " " + s3.rollNo + " " + s3.age);
    }
}
