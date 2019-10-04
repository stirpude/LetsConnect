
public class SelectionSort {
	
	static int arrayOfNumbers[] = { 6, 10, 5, 44, 8, 4,42,14};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int z;
		
		
		//System.out.println("my number is hiiii" +z);
		//System.out.println("my number is index" +index);
		
		/*for(int k=0;k<7;k++) {
		
		//System.out.println("Value of z is "+z);
		if(z<arrayOfNumbers[k]) {
			
			
			int temporaryNum = arrayOfNumbers[k];
			System.out.println("my number is temporaryNum" +temporaryNum);
			arrayOfNumbers[k]=z;
			System.out.println("my number is array" + arrayOfNumbers[k]);
			z=temporaryNum;
			System.out.println("my number is temporaryNum" +temporaryNum);
			
			System.out.println("my number is hiiii" +arrayOfNumbers[k]);
			
			
		}
		} 
		
		for(int k=0;k<8;k++) {
			z=minNumber();
			System.out.println("Lowest Number is iz"+z);  
			int index=z;
			
			int tempNum = arrayOfNumbers[k];
			System.out.println("Lowest Number is is"+index);  
			
			arrayOfNumbers[k]=arrayOfNumbers[index];
			arrayOfNumbers[index]=tempNum;
			
		}
		
		System.out.println("The num at 1st"+arrayOfNumbers[0]);
		System.out.println("The num at 1st"+arrayOfNumbers[1]);
		System.out.println("The num at 7st"+arrayOfNumbers[2]);
		System.out.println("The num at 7st"+arrayOfNumbers[3]);*/
		
		
		//System.out.println("The num at 7st"+z);
		/*int k=0;
		for(k=0;k<8;k++) {
			z=minNumber();
			System.out.println("The value of z"+z);
			int tempNum=arrayOfNumbers[k];
			arrayOfNumbers[k]=arrayOfNumbers[z];
			arrayOfNumbers[z]=tempNum;
			
			
		}
		
		System.out.println("The num at 1st"+arrayOfNumbers[0]);
		System.out.println("The num at 2st"+arrayOfNumbers[1]);
		System.out.println("The num at 3rdst"+arrayOfNumbers[2]);
		System.out.println("The num at 4st"+arrayOfNumbers[3]);*/
		
		minNumber();
		//System.out.println("Lowest Number is iz"+z);  
		
			
		
		
		
}

	private static void minNumber() {
		// TODO Auto-generated method stub
		
		/*int temp=0;
		int i=0;
		int j=0;
		
			
			if(arrayOfNumbers[i]>arrayOfNumbers[i+1]) {
				 temp =arrayOfNumbers[i+1];
				//System.out.println("Lowest Number is "+temp);
				  for( j=3;j<8;j++) {
		          if(temp>arrayOfNumbers[j]) {
		        	  temp=arrayOfNumbers[j];
		        	  //return j;
		        	  
		        	  //System.out.println("Lowest Number is is"+temp);  
		        	  
		          }
		          
				  }
				  
				 
			}
			
			else {
				temp=arrayOfNumbers[i];
				
				
				//System.out.println("Lowest Number is "+temp);
			}
		
			
		     System.out.println("smallest number is" +temp);
		     return j;
		int index=0;
		if(arrayOfNumbers[i]>arrayOfNumbers[i+1]) {
		temp =arrayOfNumbers[i+1];
		
		for( i=2;i<7;i++) {
			
			if(arrayOfNumbers[i]>temp) {
				 temp =arrayOfNumbers[i];
				 index=i;
				 
				
			}
	
			
			
		
		     
		}
		
		}
		
		else {
			temp =arrayOfNumbers[i];
			
			for( i=2;i<7;i++) {
				
				if(temp>arrayOfNumbers[i]) {
					 temp =arrayOfNumbers[i];
					 index=i;
					 
					
				}
		
				
				
			
			     
			}
			
		}
		System.out.println("smallest number is" +temp);
		System.out.println("the value of index is   " +index);
	    return index;
		
		     
		

	}*/
		/*int index=0;
		int temp=0;
		int i=0;
		int j=0;
		
		for(int k=0;k<8;k++) {
			System.out.println("The value of k" +k);
			
			System.out.println("The value of i" +i);
			for(i=0;i<8;i++) {
			if(arrayOfNumbers[i]>arrayOfNumbers[i+1]) {
				temp =arrayOfNumbers[i+1];
				
				System.out.println("The value of i inside" +i);
				for( j=2;j<8;j++) {
					
					if(arrayOfNumbers[j]>temp) {
						 temp =arrayOfNumbers[j];
						 index=j;
						 
						
					}
			
					
					
				
				     
				}
				
				}
				
				else {
					temp =arrayOfNumbers[i];
					
					for(int l=2;l<8;l++) {
						
						if(temp>arrayOfNumbers[l]) {
							 temp =arrayOfNumbers[l];
							 index=l;
							 
							
						}
				
						
						
					
					     
					}
					System.out.println("smallest number is inside l" +temp);
					
					
				}
			}
			
				System.out.println("smallest number is" +temp);
				System.out.println("the value of index is   " +index);
				
				int tempNum=arrayOfNumbers[k];
				arrayOfNumbers[k]=temp;
				arrayOfNumbers[index]=tempNum;
				
				
				
				
				
				
			   
			
			
			
		}
		System.out.println("The num at 1st"+arrayOfNumbers[0]);
		System.out.println("The num at 1st"+arrayOfNumbers[1]);
		System.out.println("The num at 1st"+arrayOfNumbers[2]);
		System.out.println("The num at 1st"+arrayOfNumbers[3]);
		System.out.println("The num at 1st"+arrayOfNumbers[4]);
		System.out.println("The num at 1st"+arrayOfNumbers[5]);
		System.out.println("The num at 1st"+arrayOfNumbers[6]);
		System.out.println("The num at 1st"+arrayOfNumbers[7]);*/
		
		
		for(int i =0;i<7;i++) {
			int iMin=i;
			
			for(int j=i+1;j<8;j++) {
				if(arrayOfNumbers[j]<arrayOfNumbers[iMin]) {
					
					iMin=j;
				}
				int temp=arrayOfNumbers[i];
				arrayOfNumbers[i]=arrayOfNumbers[iMin];
				arrayOfNumbers[iMin]=temp;
				
			}
			
		}
		
		System.out.println("The num at 1st"+arrayOfNumbers[0]);
		System.out.println("The num at 1st"+arrayOfNumbers[1]);
		System.out.println("The num at 1st"+arrayOfNumbers[2]);
		System.out.println("The num at 1st"+arrayOfNumbers[3]);
		System.out.println("The num at 1st"+arrayOfNumbers[4]);
		System.out.println("The num at 1st"+arrayOfNumbers[5]);
		System.out.println("The num at 1st"+arrayOfNumbers[6]);
		System.out.println("The num at 1st"+arrayOfNumbers[7]);
		
		
	}
		
	}

	

