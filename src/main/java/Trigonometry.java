import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the angle:");
        double angle = scanner.nextDouble();
        double sine = Math.sin(angle);
        double cosine = Math.cos(angle);
        System.out.println("Sinus of your angle is " + sine);
        System.out.println("Cosinus of your angle is " + cosine);
        System.out.println("Sinus(angle)^2 + Cosinis(angle)^2 muste be equal 1. So lets check it:");
        System.out.println("Sine squared =  " + Math.pow(sine,2) + "Cosine squared = " + Math.pow(cosine,2) + "and their sum is " + (Math.pow(sine,2) + Math.pow(cosine,2)));


    }
}
