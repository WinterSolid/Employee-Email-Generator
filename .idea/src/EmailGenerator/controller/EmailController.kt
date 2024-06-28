package EmailGenerator.controller

import EmailGeneratormodel.Email
import EmailGenerator.view.EmailView

class EmailController(private var model: Email, private val view: EmailView) {

    fun createEmailAccount() {        val firstName = view.getFirstName()
        val lastName = view.getLastName()
        model = Email(firstName, lastName)

        val departmentChoice = view.getDepartmentChoice()
        val department = setDepartment(departmentChoice)
        model.setDepartment(department)

        model.generatePassword()
        model.mailboxCap = 500 // Setting default mailbox capacity

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
