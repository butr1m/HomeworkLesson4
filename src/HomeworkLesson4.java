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
