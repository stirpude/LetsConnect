
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arrayOfNumbers[] = {1,2,3,4,7,8,12,13,15,18,20,22};
		int x=18;
		int midNumber;
		int lowerNum=0;
		int lengthOfArray = arrayOfNumbers.length ;
		int upperNum =0;
		
		
		
		
			
			if(lengthOfArray%2==0) {
				
				System.out.println("HiI am an even");
				lowerNum=0;
				upperNum=lengthOfArray-1;
				System.out.println("Ist Num"+lowerNum);
				System.out.println("2ndst Num"+upperNum);
				
				
				midNumber=(lowerNum+upperNum)/2;
				
				System.out.println("Hi"+arrayOfNumbers[midNumber]);
				
				if(arrayOfNumbers[midNumber]<x) {
					lowerNum=midNumber+1;
					System.out.println("lower num now Num"+lowerNum);
					midNumber=(lowerNum+upperNum)/2;
					System.out.println("now mid is "+midNumber);
					
					if(arrayOfNumbers[midNumber]<x) {
						System.out.println("whats up");
						
						lowerNum=midNumber+1;
						if(arrayOfNumbers[lowerNum]==x) {
							System.out.println("Hi...the number is found at"+lowerNum);
						
						
						
					}
					
					
						
						
					}
					
							
					
				}
				
				
				
			}
				
			
			
	

	}

}
