package polymorphicarray;

public class PolymorphismMethodOverloading {

    // Method to add two integers
    public int add(int var1, int var2) {
        return var1 + var2;
    }

    // Overloaded method to add three integers
    public int add(int var1, int var2, int var3) {
        return var1 + var2 + var3;
    }

    // Overloaded method to add two double values
    public double add(double var1, double var2) {
        return var1 + var2;
    }

    public static void main(String[] args) {
        PolymorphismMethodOverloading obj = new PolymorphismMethodOverloading();

        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));
    }
}