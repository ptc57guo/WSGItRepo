package com.shortestreach;

import java.util.ArrayList;
import java.util.List;

class Node {
	int index;
	List<Integer> adjacents = new ArrayList<Integer>();
	int distance = -1;

	Node(int index) {
		this.index = index;
	}
}
