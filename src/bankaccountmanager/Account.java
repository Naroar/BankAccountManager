/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountmanager;

import java.util.ArrayList;

/**
 *
 * @author Mattias
 */
public class Account {

    public ArrayList<Client> clientList;

    static int amountAccounts = 0;

    // Constructor
    public Account() {
        clientList = new ArrayList();
        amountAccounts++;
    }
}
