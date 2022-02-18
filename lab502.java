public class lab502 {
	public static void main(String[] args) {

		RegularPolygon regularPolygon0 = new RegularPolygon();
		RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
		RegularPolygon regularPolygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("RegularPolygon0");
		System.out.println("Perimeter: " + regularPolygon0.getPerimeter());
        System.out.printf("Area: %.2f\n",regularPolygon0.getArea());
		System.out.println("RegularPolygon1");
		System.out.println("Perimeter: " + regularPolygon1.getPerimeter());
        System.out.printf("Area: %.2f\n",regularPolygon1.getArea());
		System.out.println("RegularPolygon2");
		System.out.println("Perimeter: " + regularPolygon2.getPerimeter());
        System.out.printf("Area: %.2f",regularPolygon2.getArea());

}
}