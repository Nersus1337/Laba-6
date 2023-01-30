import java.util.Scanner;

public class comic implements text{

	public String title; //Название
	public String description; //Описание
	public String author; //Автор
	public String date; //Дата выхода
	public String style; //Жанр
	
	Scanner in = new Scanner(System.in);
	
	public void add()
	{
		System.out.print("\nFunctciya dobavleniya komiksa.\n");
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
	public void info() {
		System.out.print("\n...Komiks...\n");
		System.out.printf("\nNazvanie: %s\n", title);
		System.out.printf("Opisanie: %s\n", description);
		System.out.printf("Avtor: %s\n", author);
		System.out.printf("Data: %s\n", date);
		System.out.printf("Zhanr: %s\n", style);
	}
	public void deleted() {
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		System.out.printf("Komiks bil udalen\n");
	}
}