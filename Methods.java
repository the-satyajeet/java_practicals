class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }
    
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int area() {
        return length * breadth;
    }

}

public class Methods {
    public static void main(String[] a) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10);
        // System.out.println(r1.getLength());
        r1.setBreadth(20);
        // System.out.println(r1.getBreadth());
        System.out.println("Area of Rectangle with length : " + r1.getLength() + " and breadth : " + r1.getBreadth() + " is " + r1.area());


        Rectangle r2 = new Rectangle();
        r2.setLength(5);
        // System.out.println(r1.getLength());
        r2.setBreadth(15);
        // System.out.println(r1.getBreadth());
        System.out.println("Area of Rectangle with length : " + r2.getLength() + " and breadth : " + r2.getBreadth() + " is " + r2.area());

        r1.setLength(30);
        System.out.println("Area of Rectangle with length : " + r1.getLength() + " and breadth : " + r1.getBreadth() + " is " + r1.area());
    }
}
