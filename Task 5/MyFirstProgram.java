import myfirstpackage.*;

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
