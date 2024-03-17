package basics;

public class MyClass {

	private static int add(int a,int b) {
		return a+b;
	}
	
	private static int sub(int a,int b) {
		return a-b;
	}
	
	private static int multiply(int a,int b) {
		return a*b;
	}
	
	private static int divide(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		System.out.println("Addition of 2 values ,"+add(6,5));
		System.out.println("Subtraction of 2 values ,"+sub(6,5));
		System.out.println("Multiplication of 2 values ,"+multiply(6,5));
		System.out.println("Division of 2 values ,"+divide(6,5));
		
	}

}
