package detailsOfStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Student {
	
	int rollNo;
	String name;

	public static void main(String[] args) {
		// To store,sort and reverse the elements.
				@SuppressWarnings("resource")
				Scanner sr = new Scanner(System.in);
				Student obj = new Student();
				ArrayList<Integer> Id = new ArrayList<Integer>(); // Create an ArrayList object
				HashMap<Integer, String> Details = new HashMap<Integer, String>();// Create an HashMap object
				TreeSet<String> al = new TreeSet<String>(); // Create an TreeSet object
				try {
					while (true) {
						System.out.println("\nEnter one of the following choices:");
						System.out.println("Your choices :\n 1-Insert data \n 2-Exit");
						int choice = sr.nextInt();
						// User input roll number and name
						if (choice == 1) {
							System.out.print("Enter a Rollno:");
							obj.rollNo = sr.nextInt();
							System.out.print("Enter a Student Name:");
							obj.name = sr.next();
							Details.put(obj.rollNo, obj.name);// User input store in HashMap
							Id.add(obj.rollNo);// Roll numberstore in arraylist
						} else if (choice == 2) {
							System.out.println("Thank you!!");
							break;
						} else {
							System.out.println("Sorry please enter a valid number \n");
						}
					}
					Collections.sort(Id);// Sort the ArratList and print
					for (int i = 0; i < Id.size(); i++) {
						System.out.println("Roll Number: " + Id.get(i) + " Name: " + Details.get(Id.get(i)));
						al.add(Details.get(Id.get(i)));// Store the elements in TreeSet
					}
					// Reverse the TreeSet and print
					Iterator<String> i = al.descendingIterator();
					System.out.println("Names in the reverse order.");
					while (i.hasNext()) {
						System.out.println(i.next());
					}
				} catch (Exception e) {
					System.out.println("Something wrong!! Try again.");
				}
		

	}

}
