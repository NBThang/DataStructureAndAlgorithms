package hw1_21000705_nguyenbathang.sphere;

public class SphereCalculator {
    public SphereCalculator() {

    }
    public double calculateSurfaceArea(Sphere sphere) {
        return 4*Math.PI*sphere.getRadius()*sphere.getRadius();
    }
    public double calculateVolume(Sphere sphere) {
        return (double) 4/3 * Math.PI * Math.pow(sphere.getRadius(),3);
    }
    public void checkIntersection(Sphere sphere1, Sphere sphere2) {
        if (distanceCenter(sphere1, sphere2) > (sphere1.getRadius() + sphere2.getRadius())) {
            System.out.println("hai hinh cau roi nhau");
        } else if (distanceCenter(sphere1, sphere2) == (sphere1.getRadius() + sphere2.getRadius())) {
            System.out.println("hai hinh cau tiep xuc ngoai");
        }  else if (distanceCenter(sphere1, sphere2) == Math.abs(sphere1.getRadius() - sphere2.getRadius())) {
            System.out.println("hai hinh cau tiep xuc trong");
        } else if (distanceCenter(sphere1, sphere2) < Math.abs(sphere1.getRadius() - sphere2.getRadius())) {
            System.out.println("co 1 hinh cau nam trong hinh cau con lai");
        } else if (distanceCenter(sphere1, sphere2) < (sphere1.getRadius() + sphere2.getRadius())) {
            System.out.println("hai hinh cau giao nhau");
        }
    }
    public static double distanceCenter(Sphere sphere1, Sphere sphere2) {
        return Math.sqrt(Math.pow(sphere1.getX() - sphere2.getX(), 2) +
                Math.pow(sphere1.getY() - sphere2.getY(), 2) +
                Math.pow(sphere1.getZ() - sphere2.getZ(), 2));
    }
}
