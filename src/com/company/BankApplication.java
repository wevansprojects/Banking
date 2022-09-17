package com.company;

public class BankApplication
{
    public static void main(String[] args)
    {
        //Text Menu Program to Utilize Bank BankAccount and EasyScanner Classes

        char choice;

        Bank myBank = new Bank();

        //offer menu

        do
        {
          System.out.println();
          System.out.println("1. Create New Account: ");
          System.out.println("2. Remove an Account: ");
          System.out.println("3. Deposit Money: ");
          System.out.println("4. Withdraw Money: ");
          System.out.println("5. Check Account Details: ");
          System.out.println("6. Quit: ");
          System.out.println();

          //get choice
          choice = EasyScanner.nextChar();
          System.out.println();

         //Process menu options
           switch(choice)
           {
               case '1': option1 (myBank);
               break;
               case '2': option2 (myBank);
               break;
               case '3': option3 (myBank);
               break;
               case '4': option4 (myBank);
               break;
               case '5': option5 (myBank);
               break;
               case '6': break;
               default: System.out.println("Invalid Entry ");
           }
          } while(choice != '6');
        }

        //add account
        static void option1(Bank bankIn)
        {
            //get details from user
            System.out.println("Enter Account Number: ");
            String number = EasyScanner.nextString();
            System.out.println("Enter Account Name: ");
            String name = EasyScanner.nextString();

            //add account to list
            boolean success = bankIn.addAccount(number, name);
            if(success)
            {
                System.out.println("Account Added");
            }
            else
            {
                System.out.println("Account Number Already Exists");
            }
        }
        //remove account
        static void option2(Bank bankIn)
        {
           //get account number of account to remove
            System.out.print("Enter Account Number: ");
            String number = EasyScanner.nextString();
            //delete item if it exists
            boolean found = bankIn.removeAccount(number);

            if (found)
            {
                System.out.println("Account removed");
            }
            else
            {
                System.out.println("No such account number");

            }

        }

        //deposit money in account
        static void option3(Bank bankIn)
        {
            //get details from user
            System.out.println("Enter Account Number: ");
            String number = EasyScanner.nextString();

            System.out.println("Enter Amount to Deposit: ");
            double amount = EasyScanner.nextDouble();

            boolean found = bankIn.depositMoney(number,amount);

            if (found)
            {
                System.out.println("Money Deposited");
            }
            else
            {
                System.out.println("No Such Account");
            }

        }

        //withdraw money from bank account
        static void option4(Bank bankIn)
        {
            System.out.println("Enter Account Number: ");
            String number = EasyScanner.nextString();

            System.out.println("Enter Amount to Withdraw: ");
            double amount = EasyScanner.nextDouble();

            boolean ok = bankIn.withdrawMoney(number,amount);

            if(ok)
            {
                System.out.println("Withdrawal made");
            }

            else
            {
                System.out.println("No such account or insufficient funds");
            }

        }

        //check account details
        static void option5(Bank bankIn)
        {
            //get details from user
            System.out.println("Enter Account Number: ");
            String number = EasyScanner.nextString();
            BankAccount account = bankIn.getItem(number);

            if(account != null)
            {
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Account Name: " + account.getAccountName());
                System.out.println("Account Balance: " + account.getBalance());
                System.out.println();
            }
            else
            {
                System.out.println("No such account");
            }

        }


    }
