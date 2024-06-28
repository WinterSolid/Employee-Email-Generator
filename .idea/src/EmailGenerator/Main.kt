package EmailGenerator

import EmailGenerator.view
import EmailGenerator.controller
import EmailGenerator.model

    fun main() {
        val model = Email("", "")
        val view = EmailView()
        val controller = EmailController(model, view)

        controller.createEmailAccount()
    }