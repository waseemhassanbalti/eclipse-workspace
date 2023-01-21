package week6Tasks;

public class Task3 {
	
	public int multiply(int num1, int num2) {

		if(num2 == 0) {
			return 0;
		}
		return num1 + multiply(num1,num2 - 1);
	}
	

	public static void main(String[] args) {
		
		Task3 obj = new Task3();
		
		System.out.println(obj.multiply(2,3));
	}
}
