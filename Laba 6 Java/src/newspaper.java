import java.util.Scanner;

public class newspaper extends paper{
	
	Scanner in = new Scanner(System.in);

	public void add()//Функция добавления
	{
		System.out.print("\nFunctciya dobavleniya gazeti.\n");
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
	public void info()//Функция вывода информации
	{
		System.out.print("\n...Gazeta...\n");
		System.out.printf("\nNazvanie: %s\n", title);
		System.out.printf("Opisanie: %s\n", description);
		System.out.printf("Avtor: %s\n", author);
		System.out.printf("Data: %s\n", date);
		System.out.printf("Zhanr: %s\n", style);
	}
	public void deleted()//Функция удаления
	{
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		System.out.printf("Gazeta bila udalena\n");
	}
}