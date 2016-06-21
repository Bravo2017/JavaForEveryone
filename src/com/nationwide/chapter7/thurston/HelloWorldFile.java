package com.nationwide.chapter7.thurston;

import java.io.*;
import java.util.*;

public class HelloWorldFile {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File helloWorld = new File("c:/Hello World/hello.txt");

		Scanner in = new Scanner(helloWorld);

		PrintWriter out = new PrintWriter(helloWorld);

		out.println("Hello World");

		System.out.println(in.toString());

		in.close();
		out.close();

	}

}
