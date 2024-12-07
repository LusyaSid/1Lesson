public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        Cat cat1 = new Cat("Васька");
        dog1.run(300);
        dog1.swim(5);
        cat1.run(150);
        cat1.swim(5);

        Cat[] cats = {new Cat("Пушок"), new Cat("Муська"), new Cat("Рыжик")};

        FoodBowl bowl = new FoodBowl(25);

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.name + " " + "сытость" + " " + cat.isFull());
            bowl.addFood(10);
        }

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.name + " " + "уже сыт" + " " + cat.isFull());
        }
        System.out.println();
        System.out.println("ФИГУРЫ");


        Figures circle = new Circle(6, "жёлтый", "оранжевый");
        Figures rectangle = new Rectangle(5, 3, "зелёный", "красный");
        Figures triangle = new Triangle(5, 6, 9, "голубой", "синий");

        printFiguresInfo(circle);
        printFiguresInfo(rectangle);
        printFiguresInfo(triangle);
    }

    private static void printFiguresInfo (Figures figures) {
        System.out.println("фигура:" +" "+figures.getClass().getSimpleName());
        System.out.printf("периметр: %.2f%n", figures.calculatePerimeter());
        System.out.printf("площадь:%.2f%n",  figures.calculateArea());
        System.out.println("цвет фона" +" "+figures.getColorFill());
        System.out.println("цвет контура" +" "+figures.getColorBorder());

    }
}



















