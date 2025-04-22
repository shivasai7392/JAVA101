public class PrototypeDesign{
    public static void main(String[] args) {
        Student student = new Student("1",1);
        System.out.println(student);
        Student student2 = (Student) student.clone();
        System.out.println(student2);
    }
}

