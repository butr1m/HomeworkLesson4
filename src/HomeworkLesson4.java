public class HomeworkLesson4 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 12;
        rectangle1.y = 10;
        rectangle1.calculateArea();
        rectangle1.printArea();
        rectangle1.printRectangleKind();
        System.out.println();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.x = 12;
        rectangle2.y = 10;
        rectangle2.calculateArea();
        rectangle2.printArea();
        rectangle2.printRectangleKind();
        System.out.println();

        Rectangle rectangle3 = new Rectangle();
        rectangle3.x = 10;
        rectangle3.kwadrat();
        rectangle3.calculateArea();
        rectangle3.printArea();
        rectangle3.printRectangleKind();
        System.out.println();


        System.out.println(rectangle1.isTheSameRectangle(rectangle2));


        System.out.println();
        Rectangle.printRectanglesCount();

        System.out.println();
        Rectangle.printClassName(true);

    }
}

class Rectangle {
    double x;
    double y;

    static private int createdRectangles;
    static private final String RUSSIAN_CLASS_NAME = "Прямоугольник!";
    static private final String ENGLISH_CLASS_NAME = "Rectangle!";

    double calculateArea() {
        double calculatArea = x * y;
        return calculatArea;
    }

    void kwadrat() {

        y = x;
    }

    void printArea() {
        if (x == y) {
            System.out.println("Площадь квадрата равна: " + calculateArea());
        } else {
            System.out.println("Площадь прямоугольника равна: " + calculateArea());
        }
    }

    void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат!");
        } else {
            System.out.println("Это прямоугольник!");
            createdRectangles++;
        }
    }

    boolean isTheSameRectangle(Rectangle rectangle) {
        System.out.println("Прямоугольники равны?");
        return this.x == (rectangle.x) &&
                this.y == (rectangle.y);
   }

    public static void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольника!");
    }

    public static void printClassName(boolean printlnRussian) {
        if (printlnRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }
}