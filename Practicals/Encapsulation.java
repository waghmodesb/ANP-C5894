package oops;


	//Example of Encapsulation

	class Encapsulation
	{
		private String name;
		private int age;
		
		//getName method
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
	class Anudip
	{
		public static void main(String[] args)
		{
			//Creating instance of class Encapsulation
			Encapsulation e=new Encapsulation();
			
			//Setting values
			e.setName("Anju");
			e.setAge(28);
			
			//Print values
			System.out.println("Name is:" + e.getName());
			System.out.println("Age is:" + e.getAge());
			
		}
	}

