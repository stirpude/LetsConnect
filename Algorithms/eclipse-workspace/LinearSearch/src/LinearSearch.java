
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrayNum[] = { 5, 2, 1, 6, 3, 7, 8 };
		int x = 7;

		System.out.println("!st num is" + arrayNum[5]);

		for (int i = 0; i < 7; i++) {
            
			/*to check number x equal to number in array arrayNum*/
			if (x == arrayNum[i]) {
				System.out.println("Value is found at index" + i);
				break;

			}

		}

	}

}
