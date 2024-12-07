public class Rectangle implements Figures{
    double width;
    double height;
    String colorFill;
    String colorBorder;
    public Rectangle(double width,double height,String colorFill, String colorBorder){
        this.width=width;
        this.height=height;
        this.colorFill=colorFill;
        this.colorBorder=colorBorder;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+height);
    }

    @Override
    public double calculateArea() {
        return width*height;
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
