package oops;

class Bird {

	private String name;
	private int eat;
	
	//setName method
	public String getName() {
		return name;
	}
	
	//setNAme method
	public void setName(String name) {
		this.name = name;
	}
	
	//getEat method
	public int getEat() {
		return eat;
	}
	
	//setEat method
	public void setEat(int eat) {
		this.eat = eat;
	}
}	
class Peacock extends Bird{
	
	private String Breed;

	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}
}
	class BirdMain
	{
		 public static void main(String[] args) 
		 {
			 //creating instance of Peacock class
			 Peacock p=new Peacock();
			 
			p.setName("Sparrow");
			 p.setEat(2);
			 p.setBreed("House Sparrow");
			 
			 //print values
			 System.out.println("Name is"+ p.getName());
			 System.out.println("Eat is" + p.getEat());
			 System.out.println("Breed is" + p.getBreed());
	}
	
}
	
	
      
	
