import java.util.Scanner;
class no_negative_by_user {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number 1");
		i=sc.nextInt();
		if (i<0){
		System.out.println(i + " is Negative Number");
		}
		else
			System.out.println(i + " is Positive Number");
		
		}
		}