
public class Week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 49};
		int firstFromLast = ages[ages.length - 1] - ages[0];
		System.out.println(firstFromLast);
		
		int agesLength = ages.length;
		int agesSum = 0;
		for (int i = 0; i < agesLength; i++) {
			agesSum += ages[i];
		}
		double agesAverage = agesSum / agesLength;
		System.out.println("Average age = " + agesAverage);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int charSum = 0;
		for (String name : names) {
			charSum += name.length();
		}
		int nameCharAvg = charSum / names.length;
		System.out.println("Average number of letters per name: " + nameCharAvg);
		
		String allNames = "";
		char space = ' ';
		for (String name : names) {
			allNames += name + space;
		}
		System.out.println(allNames);
		//5 and 6
		int[] nameLengths = new int[names.length];
		for (int l = 0; l < names.length; l++) {
			nameLengths[l] = names.length;
		}
		
		
		String word = "Saturday";
		int n = 3;
		System.out.println(helloMethod(word, n));
		
		String firstName = "Brady";
		String lastName = "Schwertfeger";
		System.out.println(createFullName(firstName, lastName));
		
		int[] arr = {49, 50, 51};
		System.out.println(overOneHundred(arr));
		
		double[] doubleArr = {49.9, 4.9, 3.5, .03, 787.02, .04};
		System.out.println(doubleArrayAvg(doubleArr));
		
		double[] dubOne = {49.1, 35.1, 3.1, 4.1, 2.1};
		double[] dubTwo = {88.1, 89.1, 90.1, 91.1, 92.1};
		System.out.println(dubOneDubTwo(dubOne, dubTwo));
		
		boolean isHotOutside = true;
		double moneyInPocket = 10.59;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		int upTo = 1;
		System.out.println(whatAreYouUpTo(upTo));
	}
	
	public static String helloMethod(String word, int n) {
		String newWord = "";
		for (int i = 0; i < n; i++) {
			newWord += word;
		}
		return newWord;
	}
	
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static boolean overOneHundred(int[] arr) {
		int sumArray = 0;
		for (int i = 0; i < arr.length; i++) {
				sumArray += arr[i];
		}
		if (sumArray > 100) {
			return true;
		} else {
			return false;
		}
	}
	public static double doubleArrayAvg(double[] doubleArr) {
		int intArrSum = 0;
		double doubleArrSum = intArrSum;
		for (int d = 0; d < doubleArr.length; d++) {
			doubleArrSum += doubleArr[d];
			
		}
		return doubleArrSum / doubleArr.length;
	}
	public static boolean dubOneDubTwo(double[] dubOne, double[] dubTwo) {
		double dubOneSum = 0;
		double dubTwoSum = 0;
		double dubOneAvg = dubOneSum / dubOne.length;
		double dubTwoAvg = dubTwoSum / dubTwo.length;
		for (int q = 0; q < dubOne.length; q++) {
			dubOneSum += dubOne[q];
		}
		for (int r = 0; r < dubTwo.length; r++) {
			dubTwoSum += dubTwo[r];
		}
		if (dubOneAvg > dubTwoAvg) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	public static String whatAreYouUpTo(int upTo) {
		if (upTo > 0) {
			return "No Good.";
		} else {
			return "Nothing.";
		}
	}
}
