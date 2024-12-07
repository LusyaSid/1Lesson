public interface Figures {
    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }
    String getColorFill();
    String getColorBorder();
}
