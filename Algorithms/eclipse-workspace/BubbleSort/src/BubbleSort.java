
public class BubbleSort {
	
	
	static int ArrayOfNumbers[] = { 8,2,3,4};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++) {
		for(int i=0;i<3;i++) {
			System.out.println("Hi"+i);
			
			if(ArrayOfNumbers[i]>ArrayOfNumbers[i+1]) {
				
				
				
				System.out.println("Hi"+ArrayOfNumbers[i]);
				
				int temp =ArrayOfNumbers[i];
				ArrayOfNumbers[i]=ArrayOfNumbers[i+1];
				ArrayOfNumbers[i+1]=temp;
				
				
				
				
			}
			
			
		}
		}
		
		System.out.println("1st"  + ArrayOfNumbers[0]);
		System.out.println("2st"  + ArrayOfNumbers[1]);
		
		System.out.println("3st"  + ArrayOfNumbers[2]);
		System.out.println("4st"  + ArrayOfNumbers[3]);
		
		
		
		
		
		

	

	}
	
}
