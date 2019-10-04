package myWorld;

abstract class A
{
	void callme() {
	System.out.println("I am in abstract class");
	}
	
	void callmetoo() {
		System.out.println("I am in abstract class call me method");
	}
}

class B extends A{
	
	void callme() {
		System.out.println("I am in class B");
		}
	
}
public class abstractClasses {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B objB = new B();
		objB.callme();
		objB.callmetoo();

	}

}
