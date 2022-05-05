package Day_35;

public class Square {
    private int side;

    Square(int side) {
        if (side >= 0) this.side = side;
        else System.err.println("Side can't be smaller than 0");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side >= 0) this.side = side;
        else System.err.println("Side can't be smaller than 0");
    }

    int calcArea() {
        return side * side;
    }

    int calcPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "side = " + side + "\n" +
                "area = " + calcArea() + "\n" +
                "perimeter = " + calcPerimeter();
    }
}

class Rectangle {
    private int width, length;

    Rectangle(int width, int length) {
        if (width >= 0) this.width = width;
        else {
            System.err.println("Width can't be smaller than 0");
            System.exit(0);
        }
        if (length >= 0) this.length = length;
        else {
            System.err.println("Length can't be smaller than 0");
            System.exit(0);
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 0) this.width = width;
        else {
            System.err.println("Width can't be smaller than 0");
            System.exit(0);
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 0) this.length = length;
        else {
            System.err.println("Length can't be smaller than 0");
            System.exit(0);
        }
    }

    int calcArea(){
        return length * width;
    }
    int calcPerimeter(){
        return 2*(length + width);
    }
    public String toString(){
        return "width = " + width + "\n" +
                "length = " + length + "\n" +
                "area = " + calcArea() + "\n" +
                "perimeter = " + calcPerimeter();
    }
}

class Run {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        System.out.println("\n");
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle);
    }
}