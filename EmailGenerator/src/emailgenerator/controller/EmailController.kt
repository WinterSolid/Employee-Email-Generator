package emailgenerator.controller

import emailgenerator.model.Email
import emailgenerator.model.MAILBOX_CAPACITY
import emailgenerator.view.EmailView

class EmailController(private var model: Email, private val view: EmailView) {

    fun createEmailAccount() {        val firstName = view.getFirstName()
        val lastName = view.getLastName()
        model = Email(firstName, lastName)

        val departmentChoice = view.getDepartmentChoice()
        val department = setDepartment(departmentChoice)
        model.setEmployeeDepartment(department)

        model.generateEmployeePassword()
        model.mailboxCapacity = MAILBOX_CAPACITY // Setting default mailbox capacity

        view.displayInfo(model.showInfo())
    }

    private fun setDepartment(choice: Int): String {
        return when (choice) {
            1 -> "Development"
            2 -> "Sales"
            3 -> "HR"
            4 -> "Public Safety"
            5 -> "Research"
            else -> "(None)"
        }
    }
}
