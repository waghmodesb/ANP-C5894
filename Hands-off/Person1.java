package oops;

	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	}

	class Employee extends Person {
	    private double salary;

	    public Employee(String name, int age, double salary) 
	    {
	        super(name, age);
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}

	class Manager extends Employee {
	    private String department;

	    public Manager(String name, int age, double salary, String department) {
	        super(name, age, salary);
	        this.department = department;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	}

 class Main
 {
	    public static void main(String[] args) 
	    {
	        Manager manager = new Manager("Aishu Newaskar", 22, 5000.0, "Sales");

	        System.out.println("Manager Name: " + manager.getName());
	        System.out.println("Manager Age: " + manager.getAge());
	        System.out.println("Manager Salary: " + manager.getSalary());
	        System.out.println("Manager Department: " + manager.getDepartment());

	        manager.setSalary(6000.0);
	        manager.setDepartment("Marketing");

	        System.out.println("Updated Manager Salary: " + manager.getSalary());
	        System.out.println("Updated Manager Department: " + manager.getDepartment());
	    }
	}



