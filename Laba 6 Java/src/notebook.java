public class notebook implements Cloneable{
	
	public String name; //Название
	public String body; //Описание

	public notebook(String name, String body)
	{
		this.name = name;
		this.body = body;
	}
	
	public Object clone()  // перегрузка метода интерфейса Cloneable из суперкласса
	 {
	     try
	     {
	     return (notebook)super.clone();
	     }
	     catch(CloneNotSupportedException e)
	     {
	         
	     }
	     return this;
	 }
	
	public void info()//Функция вывода информации
	{
		System.out.print("\n...Notebook...\n");
		System.out.printf("\nName: %s\n", name);
		System.out.printf("Body: %s\n", body);
	}
}