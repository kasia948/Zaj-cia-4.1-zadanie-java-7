public class TriangleCheck {

    public boolean isRightTriangle(Triangle triangle) {  //
        boolean check =Math.pow(triangle.c, 2.0) == triangle.a * triangle.a + triangle.b * triangle.b;
        if (check) {
            System.out.println("Triangle is right");
            return true;
        }else{
            System.out.println("Triangle is not right");
            return false;
        }
    }
}
