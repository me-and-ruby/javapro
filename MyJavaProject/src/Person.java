// class Person with two parameters
public class Person {
	String name;
	int id;
	//constructor of person class
	Person(String name, int id){
		this.name=name;
		this.id=id;
	}
	
   // we need this main method to run this program
	public static void main(String[] args) {
		
		// am creating an instance of the class person 
		Person p1= new Person("josh", 101);
		
		//am using dot to access the values in the object created fron this person class
		System.out.println("My name is "+p1.name);
		
		System.out.println("My id number is "+p1.id);
		

	}

}
