package myWorld;

class overload{
	void mast() {
		System.out.println("I am in this");
		
	}
	
	void mast(int a) {
		
		System.out.println("i am in second");
		System.out.println("value of secondone"+a);
		//return a;
	}
	
	
}

public class over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload obj = new overload();
		int v;
		
		obj.mast();
		obj.mast(2);
		//System.out.println("value of v"+v);
		
	

	}

}
