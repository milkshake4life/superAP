// import pkg.*;
import java.util.*;

class main {
	public static void main(String args[]) {
		System.out.println(isPalindrome());
	}
	
	public static boolean isPalindrome(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int input = sc.nextInt();
		int temp = 0;
		int temp2 = input;
		
		if(input < 0 || (input % 10 == 0 && input != 0)){
			return false;
		}
		
		while(temp2 > 0){
			temp = temp * 10 + (temp2%10);
			temp2 /= 10;
		}
		if(temp == input){
			return true;
		}
		else{
			return false;
		}
	}
}
