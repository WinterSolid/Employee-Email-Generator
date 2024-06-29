package emailgenerator.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

const val PASSWORD_LENGTH = 16
const val MAILBOX_CAPACITY = 1500

class EmailTest {

    @Test
    fun `test email creation with valid inputs`() {
        val email = Emailt("John", "Doe")

        assertEquals("john.doe@(none).starkindustries.com", email.email)
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