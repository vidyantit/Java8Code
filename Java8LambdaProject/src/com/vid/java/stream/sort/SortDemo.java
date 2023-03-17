package com.vid.java.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
public static void main(String args[]) {
	List<Integer> list=new ArrayList<>();
	list.add(8);
	list.add(34);
	list.add(43);
	list.add(12);
	
	Collections.sort(list);
	Collections.reverse(list);
	System.out.println(list); //assending order
	//by using lambd expression
	list.stream().sorted().forEach(s->System.out.println(s));//ascending order
	list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s)); //descending order
}
}
