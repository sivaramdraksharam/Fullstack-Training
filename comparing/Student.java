package comparing;
import java.util.Comparator;
/*Comparing Student elements in a collection by using student name comparator and age comparator
without creating seperator classes*/

public class Student implements Comparable<Student> {
//instance variables
    String name;
    int age;
    //static inner class
    public static class Comparators {

    	//create a static reference to the interface and instantiate it by overriding compare(o1,o2) method
        public static Comparator<Student> NAME = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };
      //create a static reference to the interface and instantiate it by overriding compare(o1,o2) method
  
        public static Comparator<Student> AGE = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        };
      //create a static reference to the interface and instantiate it by overriding compare(o1,o2) method
        public static Comparator<Student> NAMEANDAGE = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.name.compareTo(o2.name);
                if (i == 0) {
                    i = o1.age - o2.age;
                }
                return i;
            }
        };
    }

//constructor overloading
    public Student(String name, int age) {
       this.name = name;
       this.age = age;
    }
//java.lang.Object
    @Override
    public String toString() {
        return name + ":" + age;
    }
//java.lang.Comparable
    @Override
    public int compareTo(Student o) {
        return Comparators.NAME.compare(this, o);
    }


   }


