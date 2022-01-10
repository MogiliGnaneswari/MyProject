import java.util.Scanner;
public class SplitPrgm {

	public static void main(String[] args) {
		System.out.println("Please enter the value:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
			{
				System.out.println();
				continue;
			}
			System.out.println(str.charAt(i));
		}
		sc.close();

	}


	}


