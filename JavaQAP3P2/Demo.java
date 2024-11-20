public class Demo {
    public static void main(String[] args) {
        
        System.out.println("Testing Point class:");
        Point p1 = new Point(3.0f, 4.0f);
        System.out.println("Point p1: " + p1);

        
        System.out.println("p1 x-coordinate: " + p1.getX());
        System.out.println("p1 y-coordinate: " + p1.getY());

        
        p1.setX(5.0f);
        p1.setY(6.0f);
        System.out.println("Point p1 after moving: " + p1);

        
        float[] coordinates = p1.getXY();
        System.out.println("Point coordinates: (" + coordinates[0] + "," + coordinates[1] + ")");

        
        System.out.println("\nTesting MovablePoint class:");
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint mp1: " + mp1);

        
        mp1.move();
        System.out.println("After moving: " + mp1);

       
        mp1.move().move();  
        System.out.println("After moving twice more: " + mp1);

        
        mp1.setXSpeed(1.0f);
        mp1.setYSpeed(1.0f);
        System.out.println("After changing speed: " + mp1);
        mp1.move();
        System.out.println("After moving with new speed: " + mp1);
    }
}