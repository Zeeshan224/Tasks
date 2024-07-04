package com.example.tasks



import org.testng.annotations.Test

//create a class Employee with private properties i.e name, position, and salary
class Employee(private var name : String,private var position: String, private var salary: Int) {

    //create a getter and setter for each property

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

    fun setPosition(position: String) {
        this.position = position
    }

    fun getPosition(): String {
        return position
    }

    fun setSalary(salary: Int) {
        this.salary = salary
    }

    fun getSalary(): Int {
        if (salary > 0) {
            return salary
        } else {
            return 0
        }
    }
}

//create a main function to test the class
@Test
fun main() {
    //create an object of the class
    val employee = Employee("", "", 0)
    //set the properties of the object
    employee.setName("Junaid")
    employee.setPosition("Developer")
    employee.setSalary(-150000)
    //print the properties of the object
    println("Name: " + employee.getName())
    println("Position: " + employee.getPosition())
    println("Salary: " + employee.getSalary())
}


