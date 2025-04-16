import java.util.Objects;

public class Person {
   private int id;
   private String name;
   private int age;

   public Person(int id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, age);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Person person = (Person) obj;
      return this.id == person.id && this.name.equals(person.name) && this.age == person.age;
   }

   public String toString() {
      return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
   }

}
