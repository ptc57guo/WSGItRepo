package com.mybookextendsbook;

public class Solution {

	public static void main(String[] args) {
		String title = "Casablanca";
		String author = "Humphrey Bogart";
		int price = 10;
		Book book = new MyBook(title, author, price);
		book.display();

	}

}
