package com.example.tasks


import org.testng.annotations.Test

//create the class BankAccount with a private property i.e. balance
class BankAccount(private var balance : Double) {
    //create an instance method to deposit money into the account
    fun deposit(amount: Double) {
        balance += amount
    }
    //create an instance method to withdraw money from the account
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        }
    }
    //create an instance method to get the current balance
    fun getBalance(): Double {
        return balance
    }
}

//create a main function to test the BankAccount class
@Test
fun main() {
    //create an instance of the BankAccount class with a balance of 1000.0
    val account = BankAccount(1000.0)
    //print the balance before transaction
    println("Balance before transactions: ${account.getBalance()}")
    //deposit $500.0 into the account
    account.deposit(500.0)
    //print the balance after deposit
    println("Balance after deposit: ${account.getBalance()}")
    //withdraw $200.0 from the account
    account.withdraw(200.0)
    //print the balance after withdrawal
    println("Balance after withdrawal: ${account.getBalance()}")
}
