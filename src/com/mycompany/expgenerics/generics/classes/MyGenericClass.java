/**
 * 
 */
package com.mycompany.expgenerics.generics.classes;

/**
 * @author ilker
 *
 */
public class MyGenericClass<T> {
	private T contained;
	
	public MyGenericClass(T _contained) {
		contained = _contained;
	}

	public T getContained() {
		return contained;
	}

	public static class MyClass { }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF MyGenericClass::main");
		MyGenericClass<String> myGenericClassOfString = new MyGenericClass<String>("ilker");
		MyGenericClass<Integer> myGenericClassOfInteger = new MyGenericClass<Integer>(123);
		MyGenericClass<MyClass> myGenericClassOfMyClass = new MyGenericClass<MyClass>(new MyClass());
		System.out.println("EOF MyGenericClass::main");
	}

}
