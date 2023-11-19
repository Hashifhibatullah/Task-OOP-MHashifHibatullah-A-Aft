package id.infinitelearning.KotlinSubmission

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
var namaDepan: String = "Muhammad"
    var namaTengah: String = "Hashif Hibatullah"
    var umur: Int = 19
    val status: Boolean = false


    println("Nama:$namaDepan $namaTengah")
    println("Umur: $umur")
    println("Status: $status")
    if (status) {
        println("You are currently single.")
    } else {
        println("You are not single.")
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

   println("GroupId =$groupId ")
    println("Group Member = ")
    for ( item in groupMember){
        println(item)
    }
    println("Session = $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */

fun myTeam(): Any {

    val teamMembers: List<Any> = listOf("azmi", "hashif", "hendrius", "zihan", "rendy")
    return teamMembers[1]

}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {

    val mentor = arrayOf("Mentor1", "Mentor2")
    val countOfGroup = arrayOf("azmi", "hashif", "zihan","hendrius","rendy")
    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("12", listOf("hashif","azmi","hendrius","zihan","rendy"), "Afternoon")

}