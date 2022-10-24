public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String mistakeInOrdr = ", you ordered a latte but was charged for a coffee";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 6.3;
        double latte = 5.4;
        double cappuccino = 4.5;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        if(isReadyOrder1) {
            System.out.println(customer1 +  readyMessage);
        }
        else {
            System.out.println(customer1 +  pendingMessage);
        }



        if(isReadyOrder4) {
            System.out.println(customer4 +  readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        }
        else {
            System.out.println(customer4 +  pendingMessage);
        }




        System.out.println(customer2 + displayTotalMessage + 2*latte );


        isReadyOrder2 = true;  
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 +  pendingMessage);
        }


        System.out.println(customer3 + mistakeInOrdr);



        System.out.println(displayTotalMessage + (dripCoffee - latte));





}


    	// ** Your customer interaction print statements will go here ** //
    }
