package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  LinkList thelist = new LinkList();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of List you wan't to create");
		int N = sc.nextInt();
		System.out.println("Enter the Value and the index");

		for(int i = 0; i < N; i++){
			int value = sc.nextInt();
			float index = sc.nextFloat();
			thelist.inserFirst(value,index);
		}

	  thelist.displayList();
	  while (!thelist.isEmpty())
      {
          Link aLink = thelist.deleteFirst();
		  System.out.println("Deleted");
		  aLink.displayLink();
		  System.out.println("");
      }
	  thelist.displayList();
    }
}
