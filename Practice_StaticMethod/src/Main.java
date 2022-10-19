public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(01,"Vũ");
        Student s2 = new Student(02,"Hải");
        Student s3 = new Student(03,"Dung");
        Student s4 = new Student(04,"Hằng");
        Student s5 = new Student(05,"Long");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}