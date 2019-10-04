
import java.util.*;

public class MergeSort {
	
	int temp[]= {0,0,0,0,0,0};
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 2,6,4,9,3,8};
		
		int t=a.length-1;
		System.out.println("The lenghth"+t);
		
		//Call mergeSort function
		
		MergeSort ob = new MergeSort();
		
		ob.mergeSort(a,0,a.length-1);
		
		
		//mergeSort(a,startpoint,endpoint);
		

		System.out.println("The num at 1st"+a[0]);
		System.out.println("The num at 1st"+a[1]);
		System.out.println("The num at 1st"+a[2]);
		System.out.println("The num at 1st"+a[3]);
		System.out.println("The num at 1st"+a[4]);
		System.out.println("The num at 1st"+a[5]);
		
		
		
		 }
	
	void  mergeSort(int a[], int startPoint, int endPoint) {
		
		if(startPoint>=endPoint) {
			System.out.println("hi");
			return;
			
		}
		
		//Follow three steps
		System.out.println("startPoint"+startPoint);
		System.out.println("endPoint"+endPoint);
		
		//1.Divide 
		int midPoint=(startPoint+endPoint)/2;
		
		System.out.println("midPoint"+midPoint);
		
		//Recusrsively sort the arrays
		mergeSort(a, startPoint,midPoint);
		
		
		mergeSort(a, midPoint+1,endPoint);
		
		
		//Merge the two arrays
		
		System.out.println("kai");
		
		merge(a,startPoint,endPoint);
		
		
		
		
	}
	
	 void merge(int a[], int startPoint, int endPoint) {
		
		int mid=(startPoint+endPoint)/2;
		System.out.println("midp"+mid);
		int i=startPoint;
		int j= mid+1;
		int k=startPoint;
		//int temp[0,0,0,0,0,0];
		 
		
		
		while(i<=mid&&j<=endPoint) {
			if(a[i]<a[j]) {
				
				temp[k++]=a[i++];
				System.out.println("in 1st while");
				
			}
			else {
				temp[k++]=a[j++];
			}
			
		}
		
		
		
		
		while(i<=mid) {
			temp[k++]=a[i++];
			System.out.println("in 2st while");
			
		}
		
		while(j<=endPoint) {
			
			temp[k++]=a[j++];
			
		}
		
		//Copy all elements to original array
		
		for(i=startPoint;i<=endPoint;i++) {
			a[i]=temp[i];
			System.out.println("The num "+a[i]);
			
			
		}
		
		
	}

	
	
}
	
	
	


