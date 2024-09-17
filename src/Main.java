import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Note/Warning:
        
        System.out.println("________________________________________________________");
        System.out.println("In the following program: DO NOT USE SYMBOLS");
        System.out.println("________________________________________________________");

        System.out.println();

        // Collecting data: 
        
        System.out.print("Enter the total bill: $");
        String totalBillStr = s.nextLine();
        double totalBill = Double.parseDouble(totalBillStr);

        System.out.println();
        System.out.println();

        System.out.print("Enter the tip percentage: %");
        String tipPercentStr = s.nextLine();
        int tipPercentage = Integer.parseInt(tipPercentStr);

        System.out.println();
        System.out.println();

        System.out.print("Enter the number of people: ");
        String totalPplStr = s.nextLine();
        int numPeople = Integer.parseInt(totalPplStr);

        System.out.println();

        System.out.println("________________________________________________________");

        // Using data to create the output:
        
        double totalTip = (double) tipPercentage/100;
        totalTip *= totalBill;
        totalTip = Math.round(totalTip * 100.0) / 100.0;

        double billAndTip = totalTip + totalBill;

        double tipPerPerson = totalTip/numPeople;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        double totalPerPerson = billAndTip / numPeople;
        totalPerPerson = Math.round(totalPerPerson * 100.0)/100.0;

        // Needed to round billAndTip later:

        billAndTip = Math.round(billAndTip * 100.0) / 100.0;

        // Output:

        System.out.println();
        System.out.println("Total tip: $" + totalTip);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println("Total bill + tip: $" + billAndTip);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println("Total per person: $" + totalPerPerson);
        System.out.println();

        System.out.println("________________________________________________________");





    }
}
