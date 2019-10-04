package myWorld;

class objectexample{
	
	int a,b;
	
	objectexample(int i,int j){
		a=i;
		b=j;
		
		
		
	}
	
	boolean equals(objectexample o) {
		
		if(o.a==a&& o.b==b)
		return true;
		else return false;
		
	}
	
	
	
}

public class objectpassing {

	public static void main(String[] args) {
		
		objectexample obj1 = new objectexample(11,12);
		objectexample obj2 = new objectexample(11,12);
		objectexample obj3 = new objectexample(-1,-1);
		
		
		System.out.println("Hi this is eqaul"+obj1.equals(obj2));
		System.out.println("oops"+obj1.equals(obj3));
		
		
		
		// TODO Auto-generated method stub

	}

}
