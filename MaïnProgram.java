// Parent Class (Base Class)
class Person {

// Encapsulated variables (private)
 private String name;
 private int age;

// Setters (Write data)

  public void setName(String name) { 
  this.name = name;
}

   public void setAge(int age) {
   if (age > 0) {
       this.age = age;
   } else {
  this.age = 0; // validation

    }
}

// Getters (Read data)
   public String getName() {
   return name;
}

  
   public int getAge() {
   	return age;

   }
}

// Child Class (Derived Class)
// Inheritance: Student inherits Person
class Student extends Person {

private String course;

// Setter and Getter for new variable
    public void setCourse (String course) {
    this.course = course;
 
      }

   public String getCourse(){
   return course;

      }

// Responsive method (easy to modify)
public void displayInfo() {
 System.out.println("-------Student Information--------");
   System.out.println("Name   :"+ getName()); 
   System.out.println("Age :     :"+ getAge());
   System.out.println("Course    :"+ getCourse());
   System.out.println("-----------------------‐------------------");
   
   }
}

// Main Class

    public class MaïnProgram {
    public static void main(String[] args) {


// Create object of child class (Student) 
 Student s = new Student();

// Using setters from Person (inherited)
 s.setName("Sabusap"); 
 s.setAge(16);

// Using setter from Student 
s.setCourse("ICT");

// Display all data 
s.displayInfo();
 
    }
 }
