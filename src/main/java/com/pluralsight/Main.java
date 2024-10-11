package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        storeHomeScreen();

    }

    /**
     * Top level menu, exits to end program.
     */
    static void storeHomeScreen(){

        do{
            try{

                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("Welcome to our store!!");
                System.out.println("Please select from the following:");
                System.out.println("   1 - Display Products");
                System.out.println("   2 - Display Cart");
                System.out.println("   3 - Exit");
                System.out.print("Command: ");
                int option = Console.PromptForInt();

                switch (option){
                    case 1: // Display Products
                        displayProductsScreen();
                        break;
                    case 2: // Display Cart
                        displayCartScreen();
                        break;
                    case 3: // Display Products
                        return;
                    default:
                        System.out.println("Invalid Command, please try again.");

                }

            } catch (Exception e) {
                System.out.println("ERROR, please try again.");
            }

        } while (true);





    }

    /**
     * Second level menu, exits to storeHomeScreen
     * Lists out products and then gives product options.
     */
    static void displayProductsScreen(){
        displayAllProducts();

        do{
            try{

                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("Products Menu");
                System.out.println("Please select from the following:");
                System.out.println("   1 - Search by Department");
                System.out.println("   2 - Add Product to Cart");
                System.out.println("   3 - Return to Main Menu");
                System.out.print("Command: ");
                int option = Console.PromptForInt();

                switch (option){
                    case 1:
                        doSearch();
                        break;
                    case 2:
                        doAddProductToCard();
                        break;
                    case 3: //
                        return;
                    default:
                        System.out.println("Invalid Command, please try again.");

                }

            } catch (Exception e) {
                System.out.println("ERROR, please try again.");
            }

        } while (true);

    }

    /**
     * Second level menu, exits to storeHomeScreen
     * Lists items in cart, and total amount do and then gives product options.
     */
    static void displayCartScreen(){


        do{
            try{

                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("CART Menu");
                System.out.println("Please select from the following:");
                System.out.println("   1 - Checkout!");
                System.out.println("   2 - Remove product from cart");
                System.out.println("   3 - Return to Main Menu");
                System.out.print("Command: ");
                int option = Console.PromptForInt();

                switch (option){
                    case 1:
                        doCheckout();
                        break;
                    case 2:
                        doRemoveProductFromCart();
                        break;
                    case 3: //
                        return;
                    default:
                        System.out.println("Invalid Command, please try again.");

                }

            } catch (Exception e) {
                System.out.println("ERROR, please try again.");
            }

        } while (true);

    }

    /**
     * Third level menu, exit to displayProductsScreen
     * allow a user to search by department, displays only those products.
     */
    static void doSearch(){
        System.out.println("doSearch");
    }

    /**
     * Third level menu, exit to displayProductsScreen
     * allow a user to add product to cart.
     */
    static void doAddProductToCard(){
        System.out.println("doAddProductToCard");
    }

    /**
     * Third level menu, exit to displayProductsScreen
     * displays a receipt, clears all items from cart.
     */
    static void doCheckout(){
        System.out.println("doCheckout");
    }

    /**
     * Third level menu, exit to displayProductsScreen
     * removes and item from the cart
     */
    static void doRemoveProductFromCart(){
        System.out.println("doRemoveProductFromCart");
    }

    static void displayAllProducts(){
        System.out.println("all products being displayed here...");
    }

    static void displayCartItemsAndTotal(){
        System.out.println("displaying each item in your cart and the total price...");
    }


}