
public class Circle {
	
	//declare instance variables
	public double circumference;
	public double area;
	public double radius;
	public int objectCount;

	//create constructor
	public Circle (double rad) {
		radius = rad;	
	}
	//get methods for area
	public double getArea(){
		double area = radius * radius * Math.PI;
		return area;
	}
	//format area return to 2 decimal points
	private String formatNumber (double x){
		String formattedNumber=String.format("%, .2f", x);
		return formattedNumber;
	}
	//pass the getArea method into the formatting
	public String getFormattedArea(){
		String myArea= formatNumber(getArea());
		return myArea;
		
	}
	//get method for circumference
	public double getCircumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	public String getFormattedCircumference(){
		String myCircumference = formatNumber(getCircumference());
		return myCircumference;
	}
//	public static int getObjectCount(){
//		return objectCount;
//	}
//	
	
	//create getters & setters
	
	
	//public Circle (double radius);
	//public double getCircumference();
	//public String getFormattedCircumference();
	//public double getArea()
	//public String getFormattedArea()
	//private String formatNumber (double x)
	//public static int getObjectCount()
	
	
}
