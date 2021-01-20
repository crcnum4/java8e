package Bank;

import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;
import BankTools.DebitCard;
import BankTools.UI;

import java.util.HashMap;

public class Bank {
    private String name;
    private int safeAmt;
    private HashMap<String, Client> clients;
    private HashMap<Integer, Account> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;

    private final String NUMBERS = "0123456789";

    public Bank(String name) {
        this.name = name;
        clients= new HashMap<>();
        accounts = new HashMap<>();
    }

    public void addClient(String firstName, String lastName) {
        clientCount += 1;
        clients.put(clientCount.toString(), new Client(firstName, lastName, clientCount.toString()));
    }

    public void addAccount(String clientId, String accountType, int startingBal, UI ui) {
        Client client = clients.get(clientId);
        Account newAccount = createAccount(accountType, client, ++accountCount, startingBal, ui);
        System.out.println(newAccount.getDetails());
        client.addAccount(newAccount);
        accounts.put(accountCount, newAccount);
    }

    public Account createAccount(String accountType, Client client, int accountId, int startingBal, UI ui) {
        switch (accountType) {
            case "checking":
                return new CheckingAccount(accountId, startingBal, client);
            case "savings":
                int interest = ui.requestInt("Please enter interest rate:");
                return new SavingsAccount(accountId, startingBal, client, interest);
            default:
                return null;
        }
    }

    public void addDebitCard(UI ui, String clientId, int accountNum) {
        Client client = clients.get(clientId);
        client.addDebitCard(createDebitCard(ui, client, accountNum));
    }

    public DebitCard createDebitCard(UI ui, Client client, int accountNum) {
        Account account = accounts.get(accountNum);
        DebitCard newCard = new DebitCard(
                ui.randomString(NUMBERS, 16),
                ui.randomString(NUMBERS, 4),
                ui.randomString(NUMBERS, 3),
                client.getName(),
                (CheckingAccount) account
        );
        return newCard;
    }

    public void displayClients() {
        for (var client : clients.keySet()){
            System.out.println(clients.get(client));
        }
    }

     

//    public SavingsAccount createSavingsAccount() {};
//    public CheckingAccount createCheckingAccount() {};
}
