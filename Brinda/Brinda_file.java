// Create an object to store your reg no. , name, and marks of 3 subjects. Write this object in to a file named with "yourregno.ser". Again read the same object from the file and then invoke the method findAverage() whereas the object is also added with a member function findAverage() that will calculate the average marks of your subjects and display the details of yours.

import java.io.Serializable;

class Student implements Serializable {

  int regno;
  String name;
  float marks1, marks2, marks3;
  float avg;

  public Student(int regno, String name, float marks1, float marks2, float marks3) {
    this.regno = regno;
    this.name = name;
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
    avg = (marks1 + marks2 + marks3) / 3;
  }

  void findAverage() {
    System.out.println("Average marks = " + avg);
  }
}

class AverageMarks {

  public static void main(String args[]) {
    Student s = new Student(1001, "Sonoo Jaiswal", 90, 80, 70);
    try {
        File fos = new File("student.ser");
        Object oos = new Object(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
        
        System.out.println("Serialization Done");
        
        File fis = new File("student.ser");
        Object ois = new Object(fis);
        s = (Student) ois.readObject();
        s.findAverage();
        
        ois.close();
        fis.close();
    } 
    catch (Exception ex) {
        ex.printStackTrace();
    }
  }
}
