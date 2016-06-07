package com.nationwide.chapter2.vipond;

/*Create a class that includes all four basic arithmetic
 *operations. Also in this program show usage of 
 *increment and decrement as well as modulus.*/

public class Math1 {
	public static void main(String[] args) {
		int add = 21 + 2;
		int sub = 25 - 5;
		int mult = 13 * 2;
		int div = 490 / 7;
		System.out.println("21 + 2 = " + add);
		System.out.println("25 - 5 = " + sub);
		System.out.println("13 * 2 = " + mult);
		System.out.println("490 / 7 = " + div);
		int num = 29;
		System.out.println("num = " + num);
		num++;
		System.out.println("num++ = " + num);
		num--;
		System.out.println("num-- = " + num);
		++num;
		System.out.println("++num = " + num);
		--num;
		System.out.println("--num = " + num);
		int mod = 109 % 7;
		System.out.println("109 % 7 = " + mod);

	}
}
