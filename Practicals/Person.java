package operators;
/*
Person class that demonstrates constructor overloading
*/

public class Person {
	//fields or attributes
    private String name;
    private int age;

    // Default constructor - without parameter
    public Person() 
    {
        name = "Raj";
        age = 30;
    }

    // Constructor with name parameter
    public Person(String name) 
    {
        this.name = name;
        age = 30; // Default age
    }

    // Constructor with name and age parameters
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
  //fields or attributes
    private String name;
    private int age;

    // Default constructor - without parameter
    public Person() 
    {
        name = "Raj";
        age = 30;
    }

    // Constructor with name parameter
    public Person(String name) 
    {
        this.name = name;
        age = 30; // Default age
    }

    // Constructor with name and age parameters
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}
