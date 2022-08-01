package com.practice;

import java.util.ArrayList;
import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {

		Random r = new Random();

		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {

			int a = r.nextInt(10);
			ar.add(a);

		}

	}

}
