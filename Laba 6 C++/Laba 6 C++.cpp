#define _CRT_SECURE_NO_WARNINGS
#include <string>
//#include "stdafx.h"
#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <Windows.h>
#define MAX 100
using namespace std;

class library//Основной класс, от которого наследуются 5 классов
{
public:
	library(string title, string description, string author, string date, string style)//Наследуемый конструктор (инициализация)
	{
		this->title = title;
		this->description = description;
		this->author = author;
		this->date = date;
		this->style = style;
		cout << "\nКОНСТРУКТОР БАЗОВЫЙ\n";
	}
	string GetTitle(){
		return title;}
	string GetDescription() {
		return description;}
	string GetAuthor() {
		return author;}
	string GetDate() {
		return date;}
	string GetStyle() {
		return style;}
protected://Поля характеристик
	string title;//Название
	string description;//Описание
	string author;//Автор
	string date;//Дата выхода
	string style;//Жанр

	

public: void deleted();//Функция удаления
	  	void info();//Функция получения информации
		void adding()//Функция добавления
		{
			cout << "Введите название: ";
			cin >> title;
			cout << "Введите описание: ";
			cin >> description;
			cout << "Введите автора: ";
			cin >> author;
			cout << "Введите дату выхода: ";
			cin >> date;
			cout << "Введите жанр: ";
			cin >> style;
		};
		void add()
		{
			cout << "\nБазовая!!!\n";
			cout << "\nФункция добавления:\n";
			adding();
		}
protected:

	void edit()//Функция редактирования
	{
		int parametr;
		cout << "\nВведите номер параметра для редактирования (1 - название, 2 - описание, 3 - автор, 4 - дата выхода, 5 - жанр): ";
		cin >> parametr;
		switch (parametr)
		{
		case 1:
			cout << "Введите новое название: ";
			cin >> title;
			break;
		case 2:
			cout << "Введите новое описание: ";
			cin >> description;
			break;
		case 3:
			cout << "Введите нового автора: ";
			cin >> author;
			break;
		case 4:
			cout << "Введите новую дату выхода: ";
			cin >> date;
			break;
		case 5:
			cout << "Введите новый жанр: ";
			cin >> style;
			break;
		default:
			break;
		}
	}
};
void library::deleted()//Функция удаления
{
	title = "";
	description = "";
	author = "";
	date = "";
	style = "";
	cout << "\nЭлемент был удален\n";
}
void library::info()//Функция получения информации
{
	cout << "Информация: "<< endl;
	cout << "Название: " << title << endl;
	cout << "Описание: " << description << endl;
	cout << "Автор: " << author << endl;
	cout << "Дата выхода: " << date << endl;
	cout << "Жанр: " << style << endl;
}
class book : public library//Наследованный класс книг
{
public:
	void operator=(library b);

	book(string title, string description, string author, string date, string style) :library(title, description, author, date, style)
	{
		this->title = title;
		this->description = description;
		this->author = author;
		this->date = date;
		this->style = style;
		cout << "\nКОНСТРУКТОР ПРОИЗВОДНЫЙ\n";
	}

	void adding()//Функция добавления
	{
		cout << "\nПроизводная!!!\n";
		cout << "Введите название: ";
		cin >> title;
		cout << "Введите описание: ";
		cin >> description;
		cout << "Введите автора: ";
		cin >> author;
		cout << "Введите дату выхода: ";
		cin >> date;
		cout << "Введите жанр: ";
		cin >> style;
	};
	
	void info_book()
	{
		printf("\n...Книга...\n");
		info();
	}/*
	void deleted_book()
	{
		deleted();
		cout << "\nКнига была удалена\n";
	}*/

	void deleted();
	void info();
	void edit_book()
	{
		printf("\n\nФункция редактирования книги.");
		info_book();
		edit();
	}
};
void book::deleted()//Функция удаления
{
	title = "";
	description = "";
	author = "";
	date = "";
	style = "";
	cout << "\nКнига была удалена\n";
}
void book::info()//Функция получения информации
{
	cout << "Книга: " << endl;
	library::info();
}
void book::operator=(library b)
{
	this->title = b.GetTitle();
	this->description = b.GetDescription();
	this->author = b.GetAuthor();
	this->date = b.GetDate();
	this->style = b.GetStyle();
}
class journal : public library//Наследованный класс журналов
{
public:
	using library::library;

	friend void operator <<(ostream &o,journal r);
	void adding_journal()
	{
		printf("\nФункция добавления журнала.\n");
		adding();
	}
	void info_journal()
	{
		printf("\n...Журнал...\n");
		info();
	}
	void deleted_journal()
	{
		deleted();
		cout << "\nЖурнал был удален\n";
	}
	void edit_journal()
	{
		printf("\n\nФункция редактирования журнала.");
		info_journal();
		edit();
	}
};
void operator <<(ostream& o, journal r)
{
	cout << r.title << " " << r.description << " " << r.author << " " << r.date << " " << r.style << endl;
}

class paper//Абстрактный класс
{
public:
	string title;//Название
	string description;//Описание
	string author;//Автор
	string date;//Дата выхода
	string style;//Жанр

	virtual void add()=0;//Чисто виртуальные функции

	virtual void info()=0;

	virtual void deleted()=0;
};

class newspaper : public paper//Наследованный класс газет
{
public:
	void paper::add()
	{
		printf("\nФункция добавления газеты.\n");
		cout << "Введите название: ";
		cin >> title;
		cout << "Введите описание: ";
		cin >> description;
		cout << "Введите автора: ";
		cin >> author;
		cout << "Введите дату выхода: ";
		cin >> date;
		cout << "Введите жанр: ";
		cin >> style;
	}
	void paper::info()
	{
		printf("\n...Газета...\n");
		cout << "Информация: " << endl;
		cout << "Название: " << title << endl;
		cout << "Описание: " << description << endl;
		cout << "Автор: " << author << endl;
		cout << "Дата выхода: " << date << endl;
		cout << "Жанр: " << style << endl;
	}
	void paper::deleted()
	{
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		cout << "\nГазета была удалена\n";
	}
};
class article : public paper//Наследованный класс статей
{
public:
	void paper::add()
	{
		printf("\nФункция добавления статьи.\n");
		cout << "Введите название: ";
		cin >> title;
		cout << "Введите описание: ";
		cin >> description;
		cout << "Введите автора: ";
		cin >> author;
		cout << "Введите дату выхода: ";
		cin >> date;
		cout << "Введите жанр: ";
		cin >> style;
	}
	void paper::info()
	{
		printf("\n...Статья...\n");
		cout << "Информация: " << endl;
		cout << "Название: " << title << endl;
		cout << "Описание: " << description << endl;
		cout << "Автор: " << author << endl;
		cout << "Дата выхода: " << date << endl;
		cout << "Жанр: " << style << endl;
	}
	void paper::deleted()
	{
		title = "";
		description = "";
		author = "";
		date = "";
		style = "";
		cout << "\nСтатья была удалена\n";
	}
};
class comic //: public library//Наследованный класс комиксов
{
public:
	//using library::library;
	comic()
	{

	}
	void adding_comic()
	{
		printf("\nФункция добавления комикса.\n");
		//adding();
	}
	void info_comic()
	{
		printf("\n...Комикс...\n");
		//info();
	}
	void deleted_comic()
	{
		//deleted();
		cout << "\nКомикс был удален\n";
	}
	void edit_comic()
	{
		printf("\n\nФункция редактирования комикса.");
		info_comic();
		//edit();
	}
};

template<typename T>
class shablon
{
public:
	shablon(T value)
	{
		this->value = value;
	}
	void DataTypeSize()
	{
		cout << sizeof(value)<<endl;
	}
private:
	T value;
};

class Ticket//Класс с читательскими билетами, содержащий класс с данными клиента
{
public:
	Ticket(int id, string name, string passport_data, int number_taken_document)//Конструктор инициализации
	{
		this->id = id;
		client[id].name = name;
		client[id].passport_data = passport_data;
		client[id].number_taken_document = number_taken_document;
	}

	class Client//Вложенный класс с данными клиента
	{
	public:
		string name;//ФИО клиента
		string passport_data;//Паспортные данные
		int number_taken_document;//Номер взятого документа
	}client[MAX];

	int id;

	void add_ticket(int id)
	{
		cout << "Читательский билет id " << id << endl;
		cout << "Введите ФИО клиета: ";
		cin >> client[id].name;
		cout << "Введите паспортные данные клиента: ";
		cin >> client[id].passport_data;
		this->id = id;
		cout << "Читательский билет id " << id << " добавлен" << endl << endl;
	}

	void give_book(int id)
	{
		cout << "Читательский билет id " << id << endl;
		cout << "Введите номер книги, которую хотите выдать: ";
		cin >> client[id].number_taken_document;
		cout << "Книга выдана" << endl << endl;
	}

	void give_journal(int id)
	{
		cout << "Читательский билет id " << id << endl;
		cout << "Введите номер журнала, который хотите выдать: ";
		cin >> client[id].number_taken_document;
		cout << "Журнал выдан" << endl << endl;
	}

	void info_client(int id)
	{
		cout << "\nЧитательский билет id " << id << endl;
		cout << "ФИО клиета: " << client[id].name << endl;
		cout << "Паспортные данные клиета: " << client[id].passport_data << endl;
		cout << "Выданный документ: № " << client[id].number_taken_document << endl;
		//book[client[id].number_taken_document].info_book();
	}
};

int main()
{
	setlocale(LC_ALL, "RUSSIAN");
	system("color F0");
	book book1("title b", "desk b", "author b", "date b", "style b");
	//book.deleted();
	//book.info();
	//library lib("title lib", "desk lib", "author lib", "date lib", "style library");
	//lib.info();
	//book.add();
	//lib.add();
	//paper ew;
	comic com;
	int a = 2;

	shablon<comic> c(com);
	c.DataTypeSize();



	/*
	newspaper news;
	news.add();
	news.info();
	article art;
	art.add();*/
	//journal journal("title b", "desk b", "author b", "date b", "style b");
	//cout << journal;

	//lib = book;
	//book = lib;
	//book.info();
	//lib.deleted();
	//book book[100];
	//journal journal[100];
	//newspaper newspaper[100];
	//article article[100];
	//comic comic[100];
	//Ticket ticket(1, "q", "q", 1);
	//ticket.info_client(1);
	//book1.info_book();
	//ticket[0].add_ticket(0);
	//ticket[0].give_book(0);
	//book[0].adding_book();
	//ticket[0].info_client(0);
	//library qwe("title c", "desk c", "author c", "date c", "style constructor");
	
	//book1[0].adding_book();
	//book1[0].info_book();
	/*
	book1[0].deleted_book();
	book1[0].info_book();
	book1[0].adding_book();
	book1[0].edit_book();
	book1[0].info_book();*/
	//journal[0].info_journal();

	/*journal[0].adding_journal();
	journal[0].info_journal();
	journal[0].deleted_journal();
	journal[0].info_journal();
	journal[0].adding_journal();
	journal[0].edit_journal();
	journal[0].info_journal();*/

	//while (getchar() != '\n');
}