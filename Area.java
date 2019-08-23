
public class Area {

	double computeArea(double a, double b, double c) {

		if (b + c > a) {
			double semiperimeter = (a + b + c) / 2; // parameter
			double area = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
			return area;
		} else {
			return a;
		}

	}

	public static void main(String arg[]) {
		Area obj = new Area();
		double a = 10;
		double b = 2;
		double c = 7;
		double area = obj.computeArea(a, b, c);
		System.out.println("the area of the triangle is: " + area);
	}

}
