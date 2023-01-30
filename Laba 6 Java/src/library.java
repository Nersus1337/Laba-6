import java.util.Scanner;

public class library {
	
	Scanner in = new Scanner(System.in);
	
	library(int a, int b)
	{
		System.out.print("\nCONSTRUCTOR BASE (library)\n");
	}

	protected String title; //Название
	protected String description; //Описание
	protected String author; //Автор
	protected String date; //Дата выхода
	protected String style; //Жанр

	protected void adding()
	{
		System.out.print("Vvedite nazvanie: ");
		title = in.nextLine();
		System.out.print("Vvedite opisanie: ");
		description = in.nextLine();
		System.out.print("Vvedite avtora: ");
		author = in.nextLine();
		System.out.print("Vvedite datu: ");
		date = in.nextLine();
		System.out.print("Vvedite zhanr: ");
		style = in.nextLine();
	}
	
	public void info()//Перегрузка 
	{
		System.out.printf("\nNazvanie: %s\n", title);
		System.out.printf("Opisanie: %s\n", description);
		System.out.printf("Avtor: %s\n", author);
		System.out.printf("Data: %s\n", date);
		System.out.printf("Zhanr: %s\n", style);
	}
	
	public void deleted(int a, int b)//Функция удаления
	{//Перегрузка 
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		System.out.printf("Ob'ekt bil udalen\n");
	}
	
	protected void edit()//Функция редактирования
	{
		System.out.print("\nVvedite nomer parametra dlya redaktirovaniya (1 - nazvanie, 2 - opisanie, 3 - avtor, 4 - data, 5 - zhanr): ");
		int parametr = in.nextInt();
		in.nextLine();
		
		switch (parametr)
		{
		case 1:
			System.out.print("Vvedite novoe nazvanie: ");
			title = in.nextLine();
			break;
		case 2:
			System.out.printf("Vvedite novoe opisanie: ");
			description = in.nextLine();
			break;
		case 3:
			System.out.printf("Vvedite novogo avtora : ");
			author = in.nextLine();
			break;
		case 4:
			System.out.printf("Vvedite novuyu datu : ");
			date = in.nextLine();
			break;
		case 5:
			System.out.printf("Vvedite noviy zhanr : ");
			style = in.nextLine();
			break;
		default:
			break;
		}
	}
}