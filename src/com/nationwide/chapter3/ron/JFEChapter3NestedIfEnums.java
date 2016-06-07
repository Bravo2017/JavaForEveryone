package com.nationwide.chapter3.ron;

public class JFEChapter3NestedIfEnums {

	/**
	 * @param args
	 */
	public enum finalGrade {
		A, B, C, D, F
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 25;
		int y = 30;

		if (x > 20) {
			if (y > 40) {
				System.out.println("result 1");
			} else {
				System.out.println("result 2");
			}
		} else {
			if (y > 40) {
				System.out.println("result 3");
			} else {
				System.out.println("result 4");
			}
		}

		finalGrade grade = finalGrade.A;
		if (grade == finalGrade.A) {
			System.out.println("Great job Ron!!");
		}
	}

}
