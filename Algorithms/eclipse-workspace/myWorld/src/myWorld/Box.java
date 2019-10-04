package myWorld;

class BoxInfo{
	int height;
	int length;
}

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vol;
		
		BoxInfo myobj = new BoxInfo();
		BoxInfo myobj1 = new BoxInfo();
		
		myobj.height = 10;
		myobj.length = 30;
		
		myobj1.height = 3;
		myobj1.length = 4;
		
		
		vol = myobj.height * myobj.length;
		System.out.println("value of area is:"+vol);
		
		vol = myobj1.height * myobj1.length;
		System.out.println("value of area is:"+vol);
		

	}

}
