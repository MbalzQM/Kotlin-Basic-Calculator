package com.ravi.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    fun main() {
        println("Enter the numbers:")
        val firstNumber = readLine()?.toDoubleOrNull()
        val secondNumber = readLine()?.toDoubleOrNull()

        if (firstNumber != null && secondNumber != null) {
            println("Enter +, -, * or /:")
            val o = readLine().toString()[0]
            var result: Double? = null

            if (o == '+') {
                result = firstNumber + secondNumber
            } else if (o == '-') {
                result = firstNumber - secondNumber
            } else if (o == '*') {
                result = firstNumber * secondNumber
            } else if (o == '/') {
                result = firstNumber / secondNumber
            } else {
                println("Please enter a valid operator.")
            }

            if (result != null) {
                println("$firstNumber $o $secondNumber = $result")
            }
        } else {
            print("Please enter valid inputs")
        }
    }
}
fun main(args: Array<String>) {
    val numArray = doubleArrayOf(2, 3, 4, 5, 7, 8,9,0)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is: %.2f".format(average))
}