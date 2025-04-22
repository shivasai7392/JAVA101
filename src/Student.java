public class Student implements Prototype {
    private String name;
    private int age;
    public Student(String name, int age){}
    public Student(){}

    @Override
    public Prototype clone() {
        return new Student(name, age);
    }
}
