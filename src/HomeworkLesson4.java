public class HomeworkLesson4 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 10;
        rectangle1.y = 12;
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

        if (((rectangle1.x == rectangle2.x) && (rectangle1.y == rectangle2.y)) || ((rectangle1.x == rectangle2.y) && (rectangle1.y == rectangle2.x))) {
            System.out.println("Прямоугольники равны?" + true);
        } else {
            System.out.println("Прямоугольники равны?" + false);
        }

    }
}

class Rectangle {
    double x;
    double y;

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
        }
    }

    void isTheSameRectangle() {
        boolean rectangle = false;
        if (x == y) {
            System.out.println("Прямоугольники равны!" + rectangle);
        } else {
            System.out.println("Прямоугольник не равны!" + rectangle);
        }
    }

}