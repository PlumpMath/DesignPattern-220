import java.util.Scanner;

public class ObserverTest {

	public static void main(String[] args) {
		Subject s1 = new Subject();
		BinaryObserver b1 = new BinaryObserver(s1);
		HexObserver h1 = new HexObserver(s1);
		OctalObserver o1 = new OctalObserver(s1);
		
		System.out.println("Enter Number : ");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("The entered number is "+i);
		s1.setStatus(i);

	}

}
