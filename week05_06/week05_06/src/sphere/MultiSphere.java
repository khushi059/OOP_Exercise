package sphere;

public class MultiSphere {
    public static void main(String[] args) {
        // Instantiate and initialize several Sphere objects
        Sphere sphere1 = new Sphere(3.0);
        Sphere sphere2 = new Sphere(5.0);

        // Output initial information about the spheres
        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());

        System.out.println();

        System.out.println("Sphere 2: " + sphere2);
        System.out.println("Volume: " + sphere2.calculateVolume());
        System.out.println("Surface Area: " + sphere2.calculateSurfaceArea());

        // Update the diameter of sphere1
        sphere1.setDiameter(4.0);
        System.out.println("\nUpdated Sphere 1: " + sphere1);
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());
    }
}


