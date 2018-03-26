/**
 * 
 */
package com.mycompany.expgenerics.generics.erasure;

import java.util.List;

/**
 * @author ilker
 *
 */
public class OverloadingWithGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void myMethod(String  string) { }
	public static void myMethod(Integer integer) { }
	// NOTE above 2 lines are simple overloading
	// NOTE due to "type erasure" of generics, can not do below 2 lines. 
	public static void myMethodWithGenericInput(List<String> strings) { }
//	public static void myMethodWithGenericInput(List<Integer> strings) { }
}
