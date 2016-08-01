package com.nationwide.chapter15.ramshetty;

class link {
	int data;
	public link nextlink;

	link(int d1) {
		data = d1;
	}
}

class List {
	link head;
	link revhead;

	List() {
		head = null;
	}

	boolean isEmpty(link head) {
		return head == null;
	}

	void insert(int d1) {
		link templink = new link(d1);
		templink.nextlink = head;
		head = templink;
	}

	void printlist() {
		link head1 = head;
		while (!isEmpty(head1)) {
			System.out.print(head1.data + " ");
			head1 = head1.nextlink;
		}
		System.out.println();
	}

	void reverse() {
		link previous = null, temp = null;
		while (!isEmpty(head)) {
			temp = head.nextlink;
			head.nextlink = previous;
			previous = head;
			if (temp == null) {
				break;
			}
			head = temp;
		}
	}
}

public class LinkedList {

	public static void main(String[] args) {
		List list1 = new List();
		list1.insert(10);
		list1.insert(20);
		list1.insert(30);
		list1.insert(40);
		list1.insert(50);
		list1.printlist();
		list1.reverse();
		list1.printlist();
	}

}