package emailgenerator.view

import java.util.Scanner

class EmailView {

    private val scanner = Scanner(System.`in`)

    fun getFirstName(): String {
        print("Enter First Name: ")
        return scanner.nextLine()
    }

    fun getLastName(): String {
        print("Enter Last Name: ")
        return scanner.nextLine()
    }

    fun getDepartmentChoice(): Int {
        print(
            """
            What is the employee's department?
            Enter the number for the department:
            0 for none
            1 for Development
            2 for Sales
            3 for HR
            4 for Public Safety
            5 for Research
            Choice: 
        """.trimIndent()
        )
        return scanner.nextInt()
    }

    fun displayInfo(info: String) {
        println(info)
    }
}
