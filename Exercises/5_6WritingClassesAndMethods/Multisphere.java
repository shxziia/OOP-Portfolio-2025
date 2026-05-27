public class Multisphere {
    public static void main(String[] args) {

        Sphere sphere1 = new Sphere(5);
        Sphere sphere2 = new Sphere(10);
        Sphere sphere3 = new Sphere(2);
        Sphere sphere4 = new Sphere(8);

        System.out.println(sphere1.toString());
        System.out.println(String.format("Volume: %.2f", sphere1.calculateVolume()));
        System.out.println(String.format("Surface Area: %.2f", sphere1.calculateSurfacearea()));
        System.out.println();

        System.out.println(sphere2.toString());
        System.out.println(String.format("Volume: %.2f", sphere2.calculateVolume()));
        System.out.println(String.format("Surface Area: %.2f", sphere2.calculateSurfacearea()));
        System.out.println();

        System.out.println(sphere3.toString());
        System.out.println(String.format("Volume: %.2f", sphere3.calculateVolume()));
        System.out.println(String.format("Surface Area: %.2f", sphere3.calculateSurfacearea()));
        System.out.println();

        System.out.println(sphere4.toString());
        System.out.println(String.format("Volume: %.2f", sphere4.calculateVolume()));
        System.out.println(String.format("Surface Area: %.2f", sphere4.calculateSurfacearea()));
        System.out.println();

        sphere3.setRadius(5);
        System.out.println("\nUpdated " + sphere3.toString());
        System.out.println(String.format("Updated Volume: %.2f", sphere3.calculateVolume()));
        System.out.println(String.format("Updated Surface Area: %.2f", sphere3.calculateSurfacearea()));
        System.out.println();

    }
}
