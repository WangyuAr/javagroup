package com.dh.wy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class contact {
	 public static void main(String args[]) {
	      String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      ArrayList list = new ArrayList(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));
	   }
}
