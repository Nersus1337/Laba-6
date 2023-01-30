public class journal extends library{
	
	journal(int a)
	{
		super(1,1);
		System.out.print("\nCONSTRUCTOR journal\n");
		
		this.title = "title";
		this.description = "description";
		this.author = "author";
		this.date = "date";
		this.style = "style";
	}
	
	public String toString()
	{
		return title+" "+description+" "+author+" "+date+" "+style;
	}
	
	//journal zxc = new journal();
	//zxc.title = "123";
	//zxc.adding_journal();

	public void adding_journal()
	{
		System.out.print("\nFunctciya dobavleniya zhurnala.\n");
		adding();
	}
	void info_journal()
	{
		System.out.print("\n...Zhurnal...\n");
		info();
	}
	void deleted_journal()
	{
		deleted(1,1);
		System.out.print("\nZhurnal bil udalen\n");
	}
	void edit_journal()
	{
		System.out.print("\nFunctciya redaktirovaniya zhurnala.");
		info_journal();
		edit();
	}	
}