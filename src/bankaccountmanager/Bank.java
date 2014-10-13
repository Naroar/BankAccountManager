/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountmanager;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Mattias
 */
public class Bank {

    /**
     * @param args the command line argumentsfds
     * @throws IOException When not entering a numerical value or not in valid
     * range
     */
    public static void main(String[] args) throws IOException {
        Bank bankMenu = new Bank();
        bankMenu.menu();
    }

    /**
     * Menu for the program.
     */
    public void menu() {
        Scanner input = new Scanner(System.in);
        int menuChoice = 0;
        boolean validChoice = false;
        boolean loopMenu = true;

        Account acc1 = new Account();
        Account acc2 = new Account();

        // Temporary - Testing Output
        Client client1 = new Client("Pär");
        Client client2 = new Client("Arne");
        Client client3 = new Client("Karl");
        acc1.clientList.add(client1);
        acc1.clientList.add(client2);
        acc2.clientList.add(client3);
        // End Temporary

        // Repeat menu selection until valid choice selected. Needs more work.
        while (validChoice != true || loopMenu != false) {
            validChoice = false;

            System.out.println("Welcome to the Bank Account Manager.");
            System.out.println("How will you be logging in?");
            System.out.println("1. As a client.");
            System.out.println("2. As a staff member.");
            System.out.println("3. Quit the program.");

            try {
                menuChoice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException wrongType) {
                System.err.println("Wrong input format.");
            }

            if (menuChoice == 1) {

                // Get the id number and check it against the list of clients. TODO
                String idNumber = input.nextLine();

                // Temporary - Testing output
                System.out.println(Client.amountClients); // How many clients there are
                System.out.println(Account.amountAccounts); // How many accounts there are
                System.out.println(acc1.clientList.get(0).getName()); // get name
                System.out.println(acc2.clientList.get(0).getName());
                // End Temporary

                /**
                 * TODO
                 *
                 * if logged in as a client, the client should be able to
                 * deposit or withdraw money. When choosing to login as a
                 * client, a valid ID number need to be supplied. To check for a
                 * valid ID number, Luhn's Algorithm should be used.
                 *
                 * List accounts - Basic functionality already added. Need
                 * modification for our purpose. Deposit, Withdraw - Methods in
                 * Account? Supply ID number - Here ID# check - method in this
                 * class.
                 */
                validChoice = true;
            } else if (menuChoice == 2) {
                // Code for staff

                /**
                 * TODO
                 *
                 * If logged in as staff member, we should be able to add
                 * customers and accounts, list clients and their accounts, and
                 * remove clients and/or their accounts. Accounts should not be
                 * able to get the same account number. Check needed.
                 *
                 * Add/list/delete customers/accounts - basic functionality
                 * added, need more work. Ex. Account account1 = new Account();
                 * creates a new account. Ex. Client client1 = new
                 * Client("Anna"); prepares a new client. Ex.
                 * account1.clientList.add(Client); Adds a client to a new
                 * account. Other way around?
                 */
                validChoice = true;
            } else if (menuChoice == 3) {
                // Code for quitting the program
                loopMenu = false;
                validChoice = true;
            } else {
                System.out.println("You need to choose to login as either a client(1) or a staff member(2) or quit the program(3) by typing in 1, 2 or 3.");
            }
        }

    }

    public boolean clientLogin(String idNumber) {
        
        return true; // temp value
    }

    public void staffLogin() {

    }

}
