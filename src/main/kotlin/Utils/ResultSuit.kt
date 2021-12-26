package Utils

class ResultSuit {
    fun getResult(playerOne: String, playerTwo: String) {
        when {
            playerOne == "gunting" && playerTwo == "kertas" -> {
                println("===============================")
                println("===  Pemain Satu Menang ! ===")
                println("===============================")
            }
            playerOne == "kertas" && playerTwo == "batu" -> {
                println("===============================")
                println("===  Pemain Satu Menang ! ===")
                println("===============================")
            }
            playerOne == "batu" && playerTwo == "gunting" -> {
                println("===============================")
                println("===  Pemain Satu Menang ! ===")
                println("===============================")
            }
            playerTwo == "gunting" && playerOne == "kertas" -> {
                println("===============================")
                println("===  Pemain Dua Menang ! ===")
                println("===============================")
            }
            playerTwo == "kertas" && playerOne == "batu" -> {
                println("===============================")
                println("===  Pemain Dua Menang ! ===")
                println("===============================")
            }
            playerTwo == "batu" && playerOne == "gunting" -> {
                println("===============================")
                println("===  Pemain Dua Menang ! ===")
                println("===============================")
            }
            playerOne == playerTwo -> {
                println("===============")
                println("=== IMBANG ! ===")
                println("=================")
            }
        }
    }
}