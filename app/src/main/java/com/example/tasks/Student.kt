package com.example.tasks

import org.testng.annotations.Test

//create a class Student with private properties name and grade
class Student(private var name: String, private var grade: String) {

    //create a getter and setter for both properties
    fun setName(name: String) {
        this.name = name
    }
    fun getName(): String {
        return name
    }

    fun setGrade(grade: String) {
        this.grade = grade
    }

    fun getGrade(): String {
        if (grade=="A" || grade=="B" || grade=="C" || grade=="D" || grade=="F"){
            return grade
        }
        else{
            return "Invalid Grade"
        }
    }
}

//create a main function to test the class
@Test
fun main() {
//create an object of the class Student
    val student = Student("", "")
    //set the properties of the object
    student.setName("Junaid")
    student.setGrade("E")
    //print the properties of the object
    println("Name: ${student.getName()} \n" + "Grade: ${student.getGrade()}")

}

