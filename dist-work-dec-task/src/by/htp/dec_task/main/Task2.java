package by.htp.dec_task.main;

import java.util.Scanner;

/*�������� �����(������) ��� ���������� ����������� ������ �������� � �����������
������ �������� ���� ����������� �����:*/

public class Task2 {
	
	static int nod;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int x;
		int y;
		
		System.out.print("������� ������ �����: ");
		x = sc.nextInt();
		System.out.print("������� ������ �����: ");
		y = sc.nextInt();
		
		Nod (x,y);
		Nok (x,y,nod);
		
	}
	
	public static int Nod (int x, int y)
	{
	
	while (x != 0 && y != 0)
	{
		
	if (x > y)
	{
		x = x % y;
	}
	
	else 
	{
		y = y % x; 
	}
	}
	
	nod = x + y;
	
	System.out.println ("���������� ����� �������� ����� �����: " + nod);
	
	return nod;
	}
	
	public static void Nok (int x, int y, int nod)
	{
		int nok;
		
		nok = (x * y) / nod;
		
		System.out.println ("���������� ����� ������� ����� �����: " + nok);
		
	}
}
