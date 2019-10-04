package linear;

import java.util.ArrayList;
import java.util.Arrays;

public class REverseString {
	
	 public String reverseWords(String s) {
		   
	        
	        String sentence = "the sky is blue";
	        String [] words = sentence.split(" ");
	        String res = "";
	        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(words));
	        System.out.println(""+wordList);
	        int lengthOfArrayList = wordList.size();
	        System.out.println("lenght"+lengthOfArrayList);
	        
	        for(int i=lengthOfArrayList-1;i>=0;i--){
	            
	             //System.out.print("Hi");
	           
	            System.out.print(wordList.get(i)+ "  ");
	            //res=res+words[i]+" ";
	         } 
	        
	        //res=res+words[0];
	        return res;

	        
	        
	        
	            
	        }
	    

}
