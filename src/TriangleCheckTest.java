public class TriangleCheckTest {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        triangle1.setA(3.0);
        triangle1.setB(4.0);
        triangle1.setC(5.0);
        TriangleCheck check1= new TriangleCheck();
        check1.isRightTriangle(triangle1);
        if (check1.isRightTriangle(triangle1)==true) {
            System.out.println("Trójkąt jest prostokątny");
        }else {
            System.out.println("Trójkąt nie jest prostokątny lub z podanych wymiarów nie można stworzyć trójkąta");
        }
    }
}
