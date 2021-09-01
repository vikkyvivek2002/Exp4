public class Exp4 {

	public static void main(String[] args) {
		
		try {
			System.out.println("outer block ");
			try {
				System.out.println("inner block ");
				int a = 20/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		try {
			System.out.println("inner block2");
			int a[] = new int[5];
			a[5] = 3;
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}

	}
		catch(Exception e2)
		{
			System.out.println(e2);
		}

}
}
