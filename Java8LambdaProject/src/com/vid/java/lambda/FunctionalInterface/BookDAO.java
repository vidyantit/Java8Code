package com.vid.java.lambda.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
List<Book> getBooks(){
	List<Book> books=new ArrayList<>();
	books.add(new Book(101,"coreJava",300));
	books.add(new Book(102,"Hibernate",304));
	books.add(new Book(103,"Springboot",430));
	books.add(new Book(104,"WebServices",200));
	return books;
}
}
