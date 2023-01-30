public class book extends library{

	//book zxc = new book();
	//Ticket.Client client1 = new Client();
	//Ticket zxcv = new Ticket();
	//zxc.title = "123";
	//zxc.adding_book();
	
	book(int a)
	{
		super(1,1);
		System.out.print("\nCONSTRUCTOR book\n");
	}
	
	public void adding_book()
	{
		System.out.print("\nFunctciya dobavleniya knigi.\n");
		adding();
	}
	void info_book()
	{
		System.out.print("\n...Kniga...\n");
		info();
	}
	public void deleted(int a)//Перегрузка 
	{
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		System.out.print("\nKniga bila udalena\n");
	}
	public void info()//Перегрузка 
	{
		System.out.print("\n...Kniga...\n");
		super.info();
	}
	void edit_book()
	{
		System.out.print("\nFunctciya redaktirovaniya knigi.");
		info_book();
		edit();
	}	
}