package mahe.icas.cs;
	
	abstract class Animal
	{
		public Animal()
		{
			System.out.println("Create an animal");
		}
	}
	
	class Dog extends Animal
	{
		public Dog()
		{
			super();
			System.out.println("Create a dog");
		}
	}

public class ObjectTest {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Testing creation of an dog type object");
	Dog d = new Dog();
  }
}
