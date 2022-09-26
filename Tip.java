public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("\nWaiter: Your total is: " + bill + ".");
        System.out.println("I hope you enjoyed your meal, Thank you!");

        tipTheWaiter(bill);
    
    }

    public static void tipTheWaiter(double bill) {
        double tip = bill * 0.15;
        System.out.println("\nYou: Your service was wonderful! Please, accept this tip: " + tip + "\n");
    }




    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */

}