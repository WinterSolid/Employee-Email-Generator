package EmailGenerator.model


const val companySuffix: String = "starkindustries.com"

class Email (var firstname: String?, var lastname: String?){

    var password: String? = null
    var passwordlength: Int = 16
    var department: String? = null
    var email: String? = null
    var alteremail: String? = null
    var mailboxcap: Int = 0

    init {
        // Initialize email and password in the constructor
        setEmployeeDepartment("")
        generateEmployeePassword()
    }

    fun setEmployeeDepartment(department: String) {
        this.department = department
        this.email = "${firstname.toLowerCase()}.${lastname.toLowerCase()}@${department.toLowerCase()}.$companySuffix"
    }

    fun generateEmployeePassword() {
        this.password = createRandomPassword(passwordLength)
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
            Name: ${firstname.toUpperCase()} ${lastname.toUpperCase()}
            Email: $email
            Password: $password
            Mailbox Capacity: $mailboxCap
        """.trimIndent()
    }
}
