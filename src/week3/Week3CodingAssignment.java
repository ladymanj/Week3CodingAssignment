package week3;

import java.util.Scanner;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
// a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		System.out.print("1a) ");
		System.out.println(ages[ages.length - 1] - ages[0]);
// b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 19};
		System.out.print("1b) ");
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int age : ages2) {
			sum += age;
		}
		double avg = (double) sum / ages2.length;
		System.out.print("1c) ");
		System.out.println(avg);
		
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		double avgNumOfLetters = (double) sumOfLetters / names.length;
		System.out.print("2a) ");
		System.out.println(avgNumOfLetters);
// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String combinedString = "";
		for (String name : names) {
			combinedString += name + " ";
		}
		System.out.print("2b) ");
		System.out.println(combinedString);
		
// 3. How do you access the last element of any array?
		// Use the index (length - 1)
		System.out.print("3)  Last element of names array: ");
		System.out.println(names[names.length - 1]);
		
// 4. How do you access the first element of any array?
		// Use the index (0)
		System.out.print("4)  First element of names array: ");
		System.out.println(names[0]);
		
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumLength = 0;
		for (int nameLength : nameLengths) {
			sumLength += nameLength;
		}
		System.out.print("6)  ");
		System.out.println(sumLength);
		
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		// See method below
		Scanner in1 = new Scanner(System.in);
		System.out.println("7)  repeatedWord method");
		System.out.print("Please enter a word to be repeated: ");
		String word = in1.nextLine();
		System.out.print("Please enter a number greater than 0: ");
		int n = in1.nextInt();
		while (!(n > 0)) {
			System.out.println("Error: number not greater than 0");
			System.out.print("Please enter a number greater than 0: ");
			n = in1.nextInt();
		}
		System.out.println("Your repeated word is: " + repeatedWord(word, n));
		
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		Scanner in2 = new Scanner(System.in);
		System.out.println("8)  fullName method");
		System.out.print("Please enter your first name: ");
		String firstName = in2.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = in2.nextLine();
		System.out.print("Your full name is: ");
		System.out.println(fullName(firstName, lastName));
		
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		Scanner in3 = new Scanner(System.in);
		System.out.println("9)  isGreaterThan100 method");
		System.out.print("Please enter the number of integers you would like in the array: ");
		int x = in3.nextInt();
		int[] numArray = new int[x];
		System.out.println("Please enter each integer:");
		for (int i = 0; i < x; i++) {
			System.out.print("#" + (i + 1) + ": ");
			numArray[i] = in3.nextInt();
		}
		if (isGreaterThan100(numArray)) {
			System.out.println("The sum of your array is greater than 100!");
		} else {
			System.out.println("The sum of your array is not greater than 100.");
		}
		
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		Scanner in4 = new Scanner(System.in);
		System.out.println("10) average method");
		System.out.print("Please enter the amount of floating-point numbers you would like in your first array: ");
		int y = in4.nextInt();
		double[] doubleArray1 = new double[y];
		System.out.println("Please enter each number:");
		for (int i = 0; i < y; i++) {
			System.out.print("#" + (i + 1) + ": ");
			doubleArray1[i] = in4.nextDouble();
		}
		System.out.println("The average of your numbers is: " + average(doubleArray1));
		
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		Scanner in5 = new Scanner(System.in);
		System.out.println("11) isArr1Greater method");
		System.out.print("Please enter the amount of floating-point numbers you would like in your second array: ");
		int z = in5.nextInt();
		double[] doubleArray2 = new double[z];
		System.out.println("Please enter each number:");
		for (int i = 0; i < z; i++) {
			System.out.print("#" + (i + 1) + ": ");
			doubleArray2[i] = in5.nextDouble();
		}
		System.out.println("The average of your numbers is: " + average(doubleArray2));
		if (isArr1Greater(average(doubleArray1), average(doubleArray2))) {
			System.out.println("The average of your first array is greater than the average of your second array!");
		} else {
			System.out.println("The average of your second array is greater than the average of your first array!");
		}
		
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		Scanner in6 = new Scanner(System.in);
		System.out.println("12) willBuyDrink method");
		boolean isHotOutside;
		double moneyInPocket = 0.0;
		System.out.print("Is it hot outside? Please enter '1' for 'Yes' and '2' for 'No'");
		int choice = in6.nextInt();
		while (!(choice == 1 || choice == 2)) {
			System.out.println("Error: Invalid input");
			System.out.print("Is it hot outside? Please enter '1' for 'Yes' and '2' for 'No': ");
			choice = in6.nextInt();
		}
		if (choice == 1) {
			isHotOutside = true;
		} else {
			isHotOutside = false;
		}
		System.out.print("How much money do you have in your pocket? ");
		moneyInPocket = in6.nextDouble();
		while (!(moneyInPocket > 0)) {
			System.out.println("Error: You can't have negative money, silly!");
			System.out.print("How much money do you have in your pocket? ");
			moneyInPocket = in6.nextDouble();
		}
		if (willBuyDrink(isHotOutside, moneyInPocket)) {
			System.out.println("Let's buy a drink!");
		} else {
			System.out.println("We probably shouldn't buy a drink...");
		}
		
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		// I decided to solve the problem of if a number was even or odd.
		// However, I wanted to try to solve it in two different ways.
		// I ended up created a simpler method, called isEven, 
		// and a slightly less simpler method, called isNotOdd.
		
		Scanner in7 = new Scanner(System.in);
		System.out.println("13) Create my own method!");
		System.out.print("Please enter the number in question, and we will find out if it's even: ");
		int questionableNum1 = in7.nextInt();
		if (isEven(questionableNum1)) {
			System.out.println("Congrats!! Your number happens to be even!");
		} else {
			System.out.println("Drat! Your number is not even!");
		}
		System.out.print("Please enter another number! We will use a different test this time to see if it's even: ");
		int questionableNum2 = in7.nextInt();
		if (isNotOdd(questionableNum2)) {
			System.out.println("Congrats!! Your number happens to be even!");
		} else {
			System.out.println("Drat! Your number is not even!");
		}
	}
	
	
// Question 7
	public static String repeatedWord(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
// Question 8
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
// Question 9
	public static boolean isGreaterThan100(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
// Question 10
	public static double average(double[] arr) {
		int sum = 0;
		for (double num : arr) {
			sum += num;
		}
		double average = (double) sum / arr.length;
		return average;
	}
	
// Question 11
	public static boolean isArr1Greater(double avg1, double avg2) {
		if (avg1 > avg2) {
			return true;
		} else {
			return false;
		}
	}
	
// Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}
	
// Question 13
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
// Also Question 13
	public static boolean isNotOdd(int num) {
		if (num % 10 == 0 || num % 10 == 2 || num % 10 == 4 || 
			num % 10 == 6 || num % 10 == 8) {
			return true;
		} else {
			return false;
		}
	}

}
