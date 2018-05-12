/**
 * 
 */
package com.mycompany.mygenerics;

/**
 * @author berna
 * @param <T>
 *
 */


public class MyGeneric<T> implements MyGenericI<T> {

	/**
	 * 
	 */
	private T t;
	public MyGeneric () {
		// TODO Auto-generated constructor stub
	}

	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		return this.t;
	}

	@Override
	public void setValue(T t) {
	 this.t = t;
		
	}
	
	public static <T extends Number> double addValues(MyGeneric T1, MyGeneric T2)
	{
	  
	 double sum;
	 T1 = new MyGeneric();
	 T2 =  new MyGeneric();
	 T1.setValue(1);
	 T1.setValue(3);
	 sum = (double) T1.getValue() + (double)T2.getValue();
	 return sum;
	}
	
	
	public static <T extends Integer, String> void use_addValues() {
		

	}
	
	public static void main (String [] args) {
		use_addValues();
		
	}

}
