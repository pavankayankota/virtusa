package virtusa;

public abstract class Shape {
	String color;
	abstract double calculateArea();
	 void setColor(String color)
	{
		this.color=color;
		System.out.println(color);
	}

}
