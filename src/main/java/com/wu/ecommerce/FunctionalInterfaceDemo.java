package com.wu.ecommerce;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public int add(int a, int b);
	default void test() {
		System.out.println("hello1");
	}
	default void test2() {
		System.out.println("hello2");
	}
	default void test3() {
		System.out.println("hello3");
	}
}

class Test {
	public static void getResult(FunctionalInterfaceDemo functionalInterface) {
		int result = functionalInterface.add(10, 2);
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getResult((a, b) -> a + b);

	}
}
