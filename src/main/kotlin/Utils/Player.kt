package Utils

class Player(private val inputPlayer: String) {

    fun validateInputUser(): Boolean {
       return if (inputPlayer != "kertas" && inputPlayer != "gunting" && inputPlayer != "batu") {
            println(" Please input Kertas, gunting, Batu!")
            false
        } else {
            true
        }
        }
}