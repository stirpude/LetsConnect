
public class RecursiveSearch {

	static int arrayOfNumbers[] = { 1, 2, 3, 5, 8, 10 };
	static int lowerNum = 0;
	static int lengthOfArray = arrayOfNumbers.length;
	static int upperNum = lengthOfArray - 1;
	
	//number to serach in the array
	static int x = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int midNumber;

		// midNumber calculated for the first time initially
		midNumber = (lowerNum + upperNum) / 2;

		System.out.println("Yipiee midNumber is" +   arrayOfNumbers[midNumber]);

		// findNumber method is called and midNumber parameter is passed to the method
		findNumber(midNumber);

	}

	public static int findNumber(int midnumber) {

		System.out.println("I am in findNumber method" );


		if (arrayOfNumbers[midnumber] == x) {

			System.out.println("Hi...I found the number");

			return 1;

		}

		if (x < arrayOfNumbers[midnumber]) {
			int lowerBound = 0;
			int midPoint = 0;

			midPoint = (lowerBound + midnumber) / 2;

			findNumber(midPoint);

			

		}

		if (x > arrayOfNumbers[midnumber]) {
			System.out.println("The number to be searched is greater than the midpoint");

			int midPoint = 0;
			System.out.println("UpperNumber index is " + upperNum);
			midPoint = (midnumber + upperNum) / 2;
			findNumber(midPoint);
			

		}
		return 0;

	}

}
