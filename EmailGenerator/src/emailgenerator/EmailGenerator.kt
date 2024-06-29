package emailgenerator

import emailgenerator.view.EmailView
import emailgenerator.model.Email
import emailgenerator.controller.EmailController

fun main() {
        val model = Email("", "")
        val view = EmailView()
        val controller = EmailController(model, view)

        controller.createEmailAccount()
    }