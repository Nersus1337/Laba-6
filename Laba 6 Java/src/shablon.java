public class shablon<T> {
	
	public T a, b;

	shablon(T a, T b)
	{
		this.a=a;
		this.b=b;
	}
	
	void print()
	{
		System.out.print("Object a: " + a);
		System.out.print("\nObject b: " + b);
	}
}
