package by.htp.branch_task.main;

import java.io.IOException;

/*21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».*/
 
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		
		char l;
		
		System.out.println("Кто ты: мальчик или девочка? ");
		l = (char)System.in.read();
		
		System.out.println(l);
		
		if ( l == 'g')
		{
			System.out.println("Мне нравятся девочки");
		}
		
		if (l == 'b')
		{
			System.out.println("Мне нравятся мальчики");
		}
	}

}
