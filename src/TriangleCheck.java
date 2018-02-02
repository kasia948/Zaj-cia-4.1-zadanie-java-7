public class TriangleCheck {

    public boolean isRightTriangle (Triangle triangle){
        if (triangle.getA()<triangle.getB()+triangle.getC()&&
                triangle.getB()<triangle.getA()+triangle.getC()&&triangle.getC()<triangle.getA()+triangle.getB()){

            if (triangle.getC()>triangle.getA()&&triangle.getC()>triangle.getB()) {

                if (Math.pow(triangle.getC(), 2.0) == triangle.getA() * triangle.getA() + triangle.getB() * triangle.getB()) {
                    return true;
                } else {
                    return false;
                }
            }else if(triangle.getB()>triangle.getC()&&triangle.getB()>triangle.getA()){
                if (Math.pow(triangle.getB(), 2.0) == triangle.getA() * triangle.getA() + triangle.getC() * triangle.getC()) {
                    return true;
                } else {
                    return false;
                }
            }else if(triangle.getA()>triangle.getC()&&triangle.getA()>triangle.getB()){
                if (Math.pow(triangle.getA(), 2.0) == triangle.getB() * triangle.getB() + triangle.getC() * triangle.getC()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
