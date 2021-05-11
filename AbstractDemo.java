package virtusa;

public class AbstractDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricle C=new Cricle();
		Square S=new Square();
		System.out.println(C.calculateArea());
		C.setColor("blue");
		System.out.println();
		System.out.println(S.calculateArea());
		S.setColor("orange");

	}

}
