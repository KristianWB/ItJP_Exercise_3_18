import java.util.Scanner;

public class CostOfShipping {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Please enter the weight of the package: "
        );
        double weight = input.nextDouble();

        if (weight > 0 || weight <= 2)
            System.out.print(
                    "The price of shipping is: " + 2.5 + "$"
            );
        else if (2 < weight || weight <= 4)
            System.out.print(
                    "The price of shipping is: " + 4.5 +"$"
            );
        else if (4 < weight || weight <= 10)
            System.out.print(
                    "The price of shipping is: " + 7.5 + "$"
            );
        else if (10 < weight || weight <= 20)
            System.out.print(
                    "The price of shipping is: " + 10.5 + "$"
            );
        else
            System.out.print(
                    "The package cannot be shipped"
            );

    }
}
