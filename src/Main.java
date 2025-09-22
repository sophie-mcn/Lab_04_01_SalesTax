//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double itemPrice = 17.82;
        final double TAX_PERCENT = 0.05;
        double salesTax = itemPrice * TAX_PERCENT;
        double totalCost = itemPrice + salesTax;

        System.out.println("The sales tax on " + itemPrice + " is " + salesTax);
        System.out.println("The total cost is " + totalCost);


    }
}