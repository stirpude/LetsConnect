
public class QickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2,7,8,6,1,5,4};


		QickSort ob = new QickSort();

		ob.quickSort(a,0,a.length-1);



		System.out.println("The num at 1st"+a[0]);
		System.out.println("The num at 1st"+a[1]);
		System.out.println("The num at 1st"+a[2]);
		System.out.println("The num at 1st"+a[3]);
		System.out.println("The num at 1st"+a[4]);
		System.out.println("The num at 1st"+a[5]);


	}

	public static void quickSort( int a[], int left, int right) {


		if(left>=right) {

			return;
		}
		//the partition method returns the index of the pivot

		
		int p =partition(a,left,right);

	    //quicksort recursive function is called to sort left region of the array less than pivot
		quickSort(  a, left, p-1);

		
		//quicksort method is called to sort the right side of array greater than the pivot
		quickSort(  a, p+1,right );


	}

	public static int partition(int a[],int left,int right) {
		
		

		int i = left-1;
		int j= left;
		
		//pivot is assigned as the last value in the array
		int pivot = a[right];
		

        //for loop for checking elements less than pivot ;starting from first element till end and i
		// i is the counter for maintaining left region,whenever element is less than pivot,i is incremented and vlaues are swapped

		for(j=left;j<right;j++) {
			if(a[j]<=pivot) {
				i++;

				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;


			}



		}
		
        //the pivot value is placed at the right position in sorted regions

		int temporary=a[i+1];
		a[i+1]=a[right];
		a[right]=temporary;
        
		//return the pivot position
		return i+1;


	}


}
