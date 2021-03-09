package com.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class UserInterface {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Fill the UI code

		// HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		Bazaar ob = new Bazaar();

		System.out.println("Enter the no of Policy names you want to store");

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Policy ID");

			int pol = Integer.parseInt(sc.nextLine());

			System.out.println("Enter the Policy Name");

			String poln = sc.nextLine();

			// hmap.put(pol, poln);

			ob.addPolicyDetails(pol, poln);

		}

		Map<Integer, String> map = new TreeMap<Integer, String>(ob.getPolicyMap());
		for (String string : args) {
			
		}

		// System.out.println("After Sorting:");

		Set set2 = map.entrySet();

		Iterator iterator2 = set2.iterator();

		while (iterator2.hasNext()) {

			Map.Entry me2 = (Map.Entry) iterator2.next();

			System.out.println(me2.getKey() + " " + me2.getValue());

		}

		System.out.println("Enter the policy type to be searched");

		String sear = sc.nextLine();

		List<Integer> arr = ob.searchBasedOnPolicyType(sear);

		for (int i = 0; i < arr.size(); i++) {

			System.out.println(arr.get(i));

		}

	}
}
