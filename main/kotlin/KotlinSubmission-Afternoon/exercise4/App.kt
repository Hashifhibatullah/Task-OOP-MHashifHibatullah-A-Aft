package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    try {
        println("Enter a number:")
        val userInput = readLine()
        val number = userInput?.toInt()


        if (number != null) {
            println("You entered a valid number: $number")
        } else {
            throw NumberFormatException("Invalid input: Not a number")
        }

    } catch (e: NumberFormatException) {
        println("Error: ${e.message}")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
