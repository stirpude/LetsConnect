package myWorld;


class Boxer {
	int height;
	int lenght;
	
	Boxer(int h,int l){
		
		System.out.println("I am in constructor");
		height = h;
		lenght = l;
		
		
	}
	
	int area () {
		return height*lenght;
	}
	
}

public class paramconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Boxer obj2 = new Boxer(2,8);
		
		a = obj2.area();
		
		System.out.println("the value of a"+a);
		
		
		
		

	}

}
