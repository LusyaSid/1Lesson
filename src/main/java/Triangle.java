public class Triangle implements Figures {
    int sideA;
    int sideB;
    int sideC;
    String colorFill;
    String colorBorder;
    public Triangle( int sideA, int sideB, int sideC,String colorFill,String colorBorder){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.colorFill=colorFill;
        this.colorBorder=colorBorder;
    }

    @Override
    public double calculatePerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double calculateArea() {
        double s= calculatePerimeter()/2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    @Override
    public String getColorFill() {
        return colorFill;
    }

    @Override
    public String getColorBorder() {
        return colorBorder;
    }
}
