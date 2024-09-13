class MySecondClass{
	private int a;
	private int b;
	public MySecondClass() {
		a = 0;
		b = 0;
	}
	public MySecondClass(int A, int B) {
		a = A;
		b = B;
	}
	public void setA(int A) {
		a = A;
	}
	public void setB(int B) {
		b = B;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int Add() {
		return a+b;
	}
}

class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass obj= new MySecondClass();
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				obj.setA(i);
				obj.setB(j);
				System.out.print(obj.Add());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

