package com.example.tasks

import org.testng.annotations.Test

//create a class Product with private properties name and price
class Product(private var name : String, private var price : Double) {
    //create setter and getter methods for name and price
    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

    fun setPrice(price: Double) {
        this.price = price
    }

    fun getPrice(): Double {
        if (price > 0) {
            return price
        } else {
            return 0.0
        }
    }
}

//create a main function to test the class
@Test
fun main(){
    //create an object of Product class
    val product = Product("", 1.0)
    //set the name and price
    product.setName("Laptop")
    product.setPrice(-1000.0)
    //print the name and price
    println("Product Name: " + product.getName())
    println("Product Price: " + product.getPrice())

}