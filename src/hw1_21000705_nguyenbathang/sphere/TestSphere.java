package hw1_21000705_nguyenbathang.sphere;

public class TestSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(1,2,3,5);
        Sphere sphere2 = new Sphere(1.5, 2.7, 3.1,6);

        SphereCalculator sphereCalculator = new SphereCalculator();

        // dien tich xung quanh hinh cau
        double surfaceArea = sphereCalculator.calculateSurfaceArea(sphere1);
        System.out.println("surface area with radius " + sphere1.getRadius() + " = " + (double) Math.round(surfaceArea * 100)/100 );

        // the tich hinh cau
        double volume = sphereCalculator.calculateVolume(sphere2);
        System.out.println("volume sphere with radius " + sphere2.getRadius() + " = " + (double) Math.round(volume*100)/100);

        // kiem tra vi tri tuong giao
        sphereCalculator.checkIntersection(sphere1, sphere2);
    }
}
