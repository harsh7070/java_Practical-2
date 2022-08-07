package Pra2;
public class P2_1main {
    public static void main(String[] args) {
        double radius;
        Circle obj = new Circle();
        Circle obj2 = new Circle(1);
        System.out.println("Area of the circle is : "+obj.getArea(obj.radius));
        System.out.println("Perimeter of the circle is : "+obj.getPerimeter(obj.radius));
        System.out.println("This program is created by 21CE039 Harsh");
    }
}
