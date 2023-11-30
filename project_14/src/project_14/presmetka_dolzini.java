
package project_14;
import java.util.Scanner;
public class presmetka_dolzini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        System.out.print("Внесете должина: ");
	        int n = input.nextInt();
	        int sum = 0;
	        for (int i = 0; i <= n; i += 2) {
	            sum += i;
	        }

	        System.out.println("Сумата на парните броеви до " + n + " е: " + sum);
	    }
	
	}


