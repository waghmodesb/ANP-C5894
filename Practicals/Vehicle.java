package oops;


//Example of Multilevel inheritance
//super class or base class or parent class
class Vehicle
{
	//fields & methods
		String Brand;
		public void Year()
		{
			System.out.println("Tata ,2023");
		}
//inherit from Vehicle
		class Car extends Vehicle{
			//fields & methods of vehicle class
			//fields & methods of Car class
			public void Model() 
			{
				System.out.println("Altas");
			}		
 }
		class SportsCar extends Car{
			//fields & methods of Vehicle class
			//fields & methods of Car class
			//fields & methods of SportsCar class
			public void topSpeed() 
			{
				System.out.println("70kmph");
			}
		}
		class VehicleMain
		{
			public static void main(String[] args)
			{
				//creating object of sub class
				Vehicle v=new Vehicle();
				
				//access fields and methods
				v.Brand="Tata";
				v.Year();
				
		
				


	}
}
}
