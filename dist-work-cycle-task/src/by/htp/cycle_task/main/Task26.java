package by.htp.cycle_task.main;

/*26. Вывести на экран соответствий между символами и их численными обозначениями в
памяти компьютера (Таблицу ASCII).*/


public class Task26 {

	public static void main(String[] args) {
		
		char h;
		for (int x = 0; x <= 255; x++)
		{
			h = (char)x;
			System.out.println(x + " - " + h );
		}
	}

}
