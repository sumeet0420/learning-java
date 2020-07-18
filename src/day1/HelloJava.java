package day1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class HelloJava {

    public static void main(String[] args) {
		/*int num=32178;
		//String numString = String.valueOf(num);
		String numString = "popol"; //String.valueOf(num);
		for(int i = numString.length() -1 ; i>=0 ; i -- ){
			System.out.print(numString.charAt(i));
		}*/
		System.out.println("************************************");
		int num2 = 32178;
		int length = (int) (Math.log10(num2));
		for(int i = 0;i<=length;i++){
			System.out.print(num2%10);
			num2 = num2/10;
		}
		/*int quot = num/10;
		int rem = num%10;
		while (quot>10) {
			quot=num/10;
			rem=num%10;
			num = quot;
			System.out.print(rem);
		}
		System.out.println(quot);*/
//		3 2 1 7 8
		}
//		0 1 2 3 4
}
