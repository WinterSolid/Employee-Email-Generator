package EmailGenerator.model


const val companySuffix: String = "starkindustries.com"
const val PASSWORD_LENGTH = 16
const val MAILBOX_CAPACITY = 1500

class Email (var firstname: String, var lastname: String){

    var password: String = " "
    var passwordlength: Int = 16
    var department: String = " "
    var email: String = " "
    var alteremail: String = " "

    init {
        // Initialize email and password in the constructor
        setEmployeeDepartment("")
        generateEmployeePassword()
    }

    fun setEmployeeDepartment(department: String) {
        this.department = department
        this.email = "${firstname.lowercase()}.${lastname.lowercase()}@${department.lowercase()}.$companySuffix"
    }

    fun generateEmployeePassword() {
        this.password = createRandomPassword(PASSWORD_LENGTH)
    }

    private fun createRandomPassword(length: Int): String {
        val passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890)(*&^%$#@!"
        val password = CharArray(length)
        for (i in password.indices) {
            val rand = (Math.random() * passwordSet.length).toInt()
            password[i] = passwordSet[rand]
        }
        return String(password)
    }

    fun showInfo(): String {
        return """
            Name: ${firstname.uppercase()} ${lastname.uppercase()}
            Email: $email
            Password: $password
            Mailbox Capacity: $MAILBOX_CAPACITY
        """.trimIndent()
    }
}
