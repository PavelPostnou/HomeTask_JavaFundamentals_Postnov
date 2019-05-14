package by.htp.line_task.main;

import java.io.IOException;

/*33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий
и последующий символы.*/

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) throws IOException {
		
		char c;
		char c1;
		char c2;
		System.out.print("Введите символ: ");
		c = (char) System.in.read();
		
		int n;
		n = (int) c;
		
		c1 = (char)(n-1);
		c2 = (char)(n+1);
		
		System.out.println("Порядковый номер введённого символа = " + n);
		System.out.println("Предыдущий символ = " + c1);
		System.out.println("Следующий символ = " + c2);
	}

}
