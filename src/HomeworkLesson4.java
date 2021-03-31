public class HomeworkLesson4 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10,15);
        rectangle1.calculateArea();
        rectangle1.printArea();
        rectangle1.printRectangleKind();
        System.out.println();

        Rectangle rectangle2 = new Rectangle(10,15);
        rectangle2.calculateArea();
        rectangle2.printArea();
        rectangle2.printRectangleKind();
        System.out.println();

        Rectangle rectangle3 = new Rectangle(10);
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
