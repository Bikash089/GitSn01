

public class PrimeNum {

	public static void main(String[] args) {
		

		int num = 562439;

		boolean flag = false;
		
		for (int i=2; i<=num/2; i++)
		{
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("The number is PRIME Num");
		}
		else {
			System.out.println("The number is not PRIME");
		}
	}

}
