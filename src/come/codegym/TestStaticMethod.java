package come.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1=new Student(1,"duyet");
        Student student2=new Student(2,"hieu");
        Student student3=new Student(2,"tri");
        student1.display();
        student2.display();
        student3.display();
    }
}
