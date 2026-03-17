package se.lexicon;
// Create a `Student` class.
public class Student {

    //Add the required fields (e.g., studentId, name, age, major).
    private String studentId;
    private String name;
    private int age;
    private int major;




    // Apply **encapsulation** by making all fields private.
    //- Use:
    //Constructors to initialize student data
    public Student(String studentId, String name, int age, int major){
      this.studentId = studentId;
      this.name = name;
      this.age = age;
      this.major = major;
    }
    // Setters to update field values safely

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    //Getters to access field values

    public String getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getMajor() {
        return major;
    }






    //Create **multiple Student objects** with different data.

    // Show that each object represents a unique student.
    //Create a UML class diagram for the `Student` class.
}
