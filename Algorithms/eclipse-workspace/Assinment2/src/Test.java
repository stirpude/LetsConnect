

import java.io.*; 
import java.lang.*; 



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Declare String without using new operator 
        String stringDictionary = "abpppleee";
        //char ch1 = s.charAt(0);
        
        String stringToSearch = "able";
        String stringToserach1 = "apple";
        String stringToSearch2 = "ale";
        int count=0;
        int maxNumber;
        
        /*String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
        
        for (String list: toppings)
        {
          System.out.println(list);
        }*/
        
        
        //to check longest word
        
       
        int lengthStr1 = stringToSearch.length();
        int lengthStr2 = stringToserach1.length();
        int lengthStr3 = stringToSearch2.length();
        
        
        int[] thisIsAnIntArray = new int[] {lengthStr1,lengthStr2,lengthStr3};
        
        

        System.out.println("First ement in array"+thisIsAnIntArray[0]);
        
        
        for(int k  = 0;k<2;k++) {
        	
        	if(thisIsAnIntArray[k]>thisIsAnIntArray[k+1]) {
        		
        		maxNumber = thisIsAnIntArray[k];
        		//System.out.println("Maximum length of string is "+thisIsAnIntArray[k]);
        		
        		
        		
        	}
        	
        	else {
        		maxNumber = thisIsAnIntArray[k+1];
        		//System.out.println("Maximummmmm length of string is "+thisIsAnIntArray[k+1]);
        		
        	}
        	
        	System.out.println("Maximum length of string is "+maxNumber);
        	
        }
        
        
        
        
        
        
        
  
      
        
        for(int i = 0;i<stringToSearch.length();i++) {
        	
        	
        	System.out.println("I am inside i and value of i is " + i); 
        	
        	
        	for(int j =0;j<stringDictionary.length();j++) {
        		System.out.println("I am inside j and value of j is "+ j); 
        		System.out.println("String character of subset is " +stringToSearch.charAt(i)); 
        		System.out.println("String character of s is " +stringDictionary.charAt(j)); 
        		
        		if(stringToSearch.charAt(i)==stringDictionary.charAt(j)) {
        			count++;
        			System.out.println("Wow"); 
        			System.out.println("String character at matched is = " +stringToSearch.charAt(i));
        			
        			//i++;
        			
        			System.out.println("value of i is = " + i);
        			
        			if(count==stringToSearch.length()) {
        				
        				System.out.println("Congrates.....subset is substring of s");
        				System.out.println("length of subset is " + count);
            			
            			
        				
        			}
        			
        			break;
        			
        			
        			
        		}
        		else {
        			System.out.println("String subset is not a subset of S");
        		}
        		
        			
        		}
        			
        		
        		
        	}
        }

	}


