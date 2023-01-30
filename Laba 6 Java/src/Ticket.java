import java.util.Scanner;

public class Ticket {
	
	Scanner in = new Scanner(System.in);
	
	public static class Client//Вложенный класс с данными клиента
	{
		String name;//ФИО клиента
		String passport_data;//Паспортные данные
		int number_taken_document;//Номер взятого документа
	}
	
	int id;
	
	public Ticket(int id, String name, String passport_data, int number_taken_document)
	{
		Ticket.Client [] client = new Ticket.Client[10];
		for (int i = 0; i < 10; i++)
		{
			client[i]= new Ticket.Client();
		}
		
		this.id=id;
		client[id].name = name;
		client[id].passport_data = passport_data;
		client[id].number_taken_document = number_taken_document;
	}
	
	void add_ticket(int id)
	{
		Ticket.Client [] client = new Ticket.Client[10];
		for (int i = 0; i < 10; i++)
		{
			client[i]= new Ticket.Client();
		}

		System.out.printf("\nChitatelskiy bilet id " + id);
		System.out.print("\nVvedite FIO klienta: ");
		client[id].name = in.nextLine();
		System.out.print("\nVvedite pasportnie dannie klienta: ");
		client[id].passport_data = in.nextLine();
		this.id = id;
		System.out.print("\nChitatelskiy bilet id " + id + " dobavlen");
	}

	void give_book(int id)
	{
		Ticket.Client [] client = new Ticket.Client[10];
		for (int i = 0; i < 10; i++)
		{
			client[i]= new Ticket.Client();
		}
		
		System.out.print("\nChitatelskiy bilet id " + id);
		System.out.print("\nVvedite nomer knigi, kotoruyu hotite vidat': ");
		client[id].number_taken_document = in.nextInt();
		System.out.print("\nKniga vidana");
	}

	void give_journal(int id)
	{
		Ticket.Client [] client = new Ticket.Client[10];
		for (int i = 0; i < 10; i++)
		{
			client[i]= new Ticket.Client();
		}
		
		System.out.print("\nChitatelskiy bilet id " + id);
		System.out.print("\nVvedite nomer zhurnala, kotoriy hotite vidat': ");
		client[id].number_taken_document = in.nextInt();
		System.out.print("\nZhurnal vidan");
	}

	void info_client(int id)
	{
		Ticket.Client [] client = new Ticket.Client[10];
		for (int i = 0; i < 10; i++)
		{
			client[i]= new Ticket.Client();
		}
		
		System.out.print("\nChitatelskiy bilet id " + id);
		System.out.print("\nFIO klienta: " + client[id].name);
		System.out.print("\nPasportnie dannie klienta: " + client[id].passport_data);
		System.out.print("\nVidanniy dokument: № " + client[id].number_taken_document);
		//book[client[id].number_taken_document].info_book();
		
		//book zxc = new book();
		//zxc.info_book();
	}
}