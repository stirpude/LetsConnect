
public class InsrertionSort {

	static int arrayOfNumbers[] = { 6, 10, 5, 44, 8, 4,42,14};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,temp;

		for(i=1;i<8;i++) {

			j=i;

			while(j>0 && arrayOfNumbers[j]<arrayOfNumbers[j-1]) {

				temp=arrayOfNumbers[j];
				arrayOfNumbers[j]=arrayOfNumbers[j-1];
				arrayOfNumbers[j-1]=temp;
				j--;

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
