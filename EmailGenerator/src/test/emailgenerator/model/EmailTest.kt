package emailgenerator.model

import emailgenerator.controller.MAILBOX_CAPACITY
import emailgenerator.controller.PASSWORD_LENGTH
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class EmailTest {

    @Test
    fun `test email creation with valid inputs`() {
        val email = Email("John", "Doe")

        assertEquals("john.doe@.starkindustries.com", email.email)
        assertEquals(MAILBOX_CAPACITY, email.mailboxCapacity)
        assertTrue(email.password.isNotEmpty())
        assertTrue(email.password.length == PASSWORD_LENGTH)
    }

    @Test
    fun `test setting department`() {
        val email = Email("Jane", "Smith")
        email.setEmployeeDepartment("Development")

        assertEquals("jane.smith@development.starkindustries.com", email.email)
    }

    @Test
    fun `test password generation`() {
        val email = Email("Alice", "Johnson")
        email.generateEmployeePassword()

        assertTrue(email.password.isNotEmpty())
        assertTrue(email.password.length == PASSWORD_LENGTH)
    }

    @Test
    fun `test show info`() {
        val email = Email("Bob", "Brown")
        email.setEmployeeDepartment("Sales")
        email.generateEmployeePassword()

        val expectedInfo = """
            Name: BOB BROWN
            Email: bob.brown@sales.starkindustries.com
            Password: ${email.password}
            Mailbox Capacity: $MAILBOX_CAPACITY
        """.trimIndent()

        assertEquals(expectedInfo, email.showInfo())
    }
}
