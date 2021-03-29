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

