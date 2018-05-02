package com.rotatearrayleft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1, 2, 3, 4, 5};
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++) {
		    result[(i + (data.length - 1)) % data.length] = data[i];
		}

		List<Integer> listInts = new ArrayList<Integer>(result.length);
		for (int j = 0; j < result.length; j++) {
			listInts.add(result[j]);
		}
		
		listInts.forEach(nb -> System.out.print(nb + " "));
		
		System.out.println("------------------------");

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, Arrays.stream(result).boxed().toArray(Integer[]::new));
		
		list.forEach(nb -> System.out.print(nb + " "));
		
		System.out.println("------------------------");
	}

}
