/**
 * 
 */
package com.mycompany.expgenerics.generics.wildcards.why;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ilker
 *
 */
public class UseAXY {

/*	public static class A {  }
	public static class X extends A { } 
	public static class Y extends A { }
*/
	public static void whyGenericsWildcards() {
		A a = new A();
		X x = new X();
		Y y = new Y();
		
		List<A> listA = new ArrayList<A>();
		List<X> listX = new ArrayList<X>();
		List<Y> listY = new ArrayList<Y>();
		
		listA.add(a);	listA.add(x);	listA.add(y);		
		listX.add(a);	listX.add(x);
		
		
		// can we do below 2 lines ?
	//	List<A> listA2 = listX; 
	//	List<X> listX2  = listA;

	}
}