package com.nationwide.chapter5.ron;

public class JFEChapter5Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputs0();

		inputs1("Ron");

		inputs2("Ron", 49);

	}

	static public void inputs0() {
		System.out.println("This has no inputs");
	}

	static public void inputs1(String name) {
		System.out.println("This has one input and it is the name " + name);
	}

	static public void inputs2(String name, int age) {
		System.out.println("This has two inputs. The name " + name
				+ " and age of " + age);
	}

}
