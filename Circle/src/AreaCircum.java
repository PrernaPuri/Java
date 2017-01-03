
public class AreaCircum {
 
	static double  pi= 3.14;
	double radius;
	double area,Circum;

	
	AreaCircum(int x){
		
		radius=x;
	}
		
		
	void Circum()
	{

		area=pi*radius*radius;
		System.out.println("Area of the circle is " +area);
		
	}
	
	void Circum(int x)
	{
		radius=x;
		
		Circum=2*pi*radius;
		System.out.println("Circumference of a circle is"+Circum);
	

	
}
}
