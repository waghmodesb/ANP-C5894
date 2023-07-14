package oops;

class Person 
{

	private String name;
	private int age;
	
	//get Name method
	public String getName() {
		return name;
		
	}
	
	//setName method
	public void setName(String name) {
		this.name = name;
	}
	
	//getAge method 
	public int getAge() {
		return age;
	}
	
	
    //setAge method
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Info
{
		public static void main(String[] args) 
		{
			//creating instance of class Person
			Person r=new Person();
			
			//setting values
			r.setName("Teju");
			r.setAge(25);
			
			//Print values
			System.out.println("Name is"+ r.getName());
			System.out.println("Age is"+ r.getAge());
	}
}

