//Pablo Mendoza
//11-8-24
//CPSC-39-12112

import java.util.Scanner;

public class recursionMethods{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Which method do you wish to use? Type number 1-5");
		System.out.println("Method 1 - Count8");
		System.out.println("Method 2 - CountHi");
		System.out.println("Method 3 - CountHi2");
		System.out.println("Method 4 - strCount");
		System.out.println("Method 5 - stringClean");

		int input = scanner.nextInt();
		scanner.nextLine(); 
		String str; 
		int integer;
		switch (input) {
			case 1:
			 	System.out.println("Please enter an non negative Integer for this method");
				integer = scanner.nextInt(); 
				if(integer < 0){
					System.out.println("Error: Negative number entered");
				}else{
					System.out.println("The result is " + count8(integer));
				}
				break;
			case 2:
				System.out.println("Please enter a string for this method");
				str = scanner.nextLine(); 
				System.out.println("The result is " + countHi(str));
				break;
			case 3:
				System.out.println("Please enter a string for this method");
				str = scanner.nextLine(); 
				System.out.println("The result is " + countHi2(str));
				break;
			case 4:
				System.out.println("Please enter a string and a sub for this method");
				str = scanner.nextLine(); 
				String sub = scanner.nextLine(); 
				if(sub.length() > 0){
					System.out.println("The sub string appears " + strCount(str, sub) + " times in the string");
				}else{
					System.out.println("Error: Sub string can not be empty");
				}
				break;
			case 5:
				System.out.println("Please enter a string for this method");
				str = scanner.nextLine();  
				System.out.println("The new string is " + stringClean(str));
				break;
			default: 
				System.out.println("Incorrect input deteced, Type number 1-5");
		}
		scanner.close();
	}

	public static int count8(int n){
		if(n == 0){
			return 0;
		}

		if(n % 10 == 8){
			if((n / 10) % 10 == 8){
				return 2 + count8(n/10);
			}else{
				return 1 + count8(n/10);
			}
		}
		return count8(n/10);
	}

	public static int countHi(String str){
		int strL = str.length();

		if(strL < 2){
			return 0;
		}
		String subStr = str.substring(strL - 2);
		if(String.valueOf(subStr).equals("hi")){
			return 1 + countHi(str.substring(0, strL - 1));
		}

		return countHi(str.substring(0, strL - 1));
	}

	public static int countHi2(String str){
		int strL = str.length();

		if(strL < 2){
			return 0;
		}
		String subStr = str.substring(strL - 2);
		if(String.valueOf(subStr).equals("hi")){
			if(strL == 2){
				return 1 + countHi2(str.substring(0, strL - 1));
			}else{
				if(str.charAt(strL - 3) != 'x'){
					return 1 + countHi2(str.substring(0, strL - 1));
				}
			}
		}

		return countHi2(str.substring(0, strL - 1));
	}

	public static int strCount(String str, String sub){
		int strL = str.length();

		if(strL < sub.length()){
			return 0;
		}

		String subStr = str.substring(strL - sub.length());
		if(subStr.equals(sub)){
			return 1 + strCount(str.substring(0, strL - 1), sub);
		}

		return strCount(str.substring(0, strL - 1), sub);
	}

	public static String stringClean(String str){
		int strL = str.length();

		System.out.println(str);
		if(strL <= 1){
			return str.substring(0, 1);
		}

		if(str.charAt(0) != str.charAt(1)){
			return str.substring(0, 1) + stringClean(str.substring(1));
		}

		return stringClean(str.substring(1));
	}
}