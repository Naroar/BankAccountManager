/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountmanager;

//import java.util.ArrayList;
/**
 *
 * @author Mattias
 */
public class Client {

    private String name;
    public long pNr;

    static int amountClients = 0;

    // Constructor
    public Client() {
        amountClients++;
    }

    public Client(String newClient) {
        name = newClient;
        amountClients++;
    }

    public String getName() {
        return name;
    }

    public void setName(String newClient) {
        name = newClient;
    }
}
