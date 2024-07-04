package com.example.tasks

import org.testng.annotations.Test

//create a class called Car with private properties i.e make, model, and milleage
class Car(private var make:String, private var model:String, private var milleage:Int) {
    //create getters and setters for each property
    fun setMake(make: String) {
        this.make = make
    }

    fun getMake(): String {
        return this.make
    }

    fun setModel(model: String) {
        this.model = model
    }

    fun getModel(): String {
        return this.model
    }

    fun setMilleage(milleage: Int) {
        this.milleage = milleage
    }

    fun getMilleage(): Int {
        if (milleage > 0) {
            return this.milleage
        }
        return 0
    }
}

//create a main function to test the class
@Test
fun main() {
    //create an instance of the class
    val car = Car("", "", 0)
    //set the properties of the instance
    car.setMake("Toyota")
    car.setModel("Camry")
    car.setMilleage(-20000)
    //print the properties of the instance
    println("The car's make is " + car.getMake())
    println("The car's model is " + car.getModel())
    println("The car's milleage is " + car.getMilleage())

}
