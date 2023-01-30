import java.util.Scanner;

public class article extends paper implements Cloneable{
	
	Scanner in = new Scanner(System.in);
	public notebook note;

	public article(String title, String description, String author, String date, String style)//Конструктор
	{
		this.title=title;
		this.description=description;
		this.author = author;
		this.date = date;
		this.style=style;
		note = new notebook(title, description);
	}
	
	public Object clone()  // перегрузка метода интерфейса Cloneable из суперкласса
	 {
	     try
	     {
	     return (article)super.clone();
	     }
	     catch(CloneNotSupportedException e)
	     {
	         
	     }
	     return this;
	 }
	
	public void add()//Функция добавления
	{
		System.out.print("\nFunctciya dobavleniya stat'i.\n");
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
		System.out.print("\n...Stat'ya...\n");
		System.out.printf("\nNazvanie: %s\n", title);
		System.out.printf("Opisanie: %s\n", description);
		System.out.printf("Avtor: %s\n", author);
		System.out.printf("Data: %s\n", date);
		System.out.printf("Zhanr: %s\n", style);
		System.out.printf("Name: %s\n", note.name);
		System.out.printf("Body: %s\n", note.body);
	}
	public void deleted()//Функция удаления
	{
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		System.out.printf("Stat'ya bila udalena\n");
	}
}