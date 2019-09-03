
public class AreaCalculator {

	public static void main(String[] args) {
		System.out.println("Area of circle "+areaCalculate(20));
		System.out.println("Area of circle "+areaCalculate(8.5));
		System.out.println("Area of crectangle "+areaCalculate(10, 10));
	}
	public static double areaCalculate(double radius) {
		if(radius<0){
		    return -1;
		}
		double areaCircle=Math.PI*(radius*radius);
		return areaCircle;
		
	}
	public static double areaCalculate(double x, double y) {
		if((x<0) || (y<0)) {
			return -1;
		}
		double areaRectangle=(x*y);
		return areaRectangle;
	}

}
