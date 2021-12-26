package App

import Utils.Player
import Utils.ResultSuit

class Apps {
    private var inputPlayerOne: String = ""
    private var inputPlayerTwo: String = ""

    fun run() {
        printHeader()
        playerOne()
        playerTwo()
    }

    private fun printHeader() {
        println("==================================")
        println("GAME SUIT ")
        println("Pilih Antara Kertas, Gunting Dan Batu ")
        println("==================================")
    }

    private fun playerOne() {
        println("Silahkan Masukan Pilihan Pemain Satu")
        inputPlayerOne = getInputFromUser()
        if (Player(inputPlayerOne).validateInputUser()) {
            printResult(inputPlayerOne, inputPlayerTwo)
        } else {
            playerOne()
        }
    }
    private fun playerTwo() {
        println("Silahkan Masukan Pilihan Pemain Dua")
        inputPlayerTwo = getInputFromUser()
        if (Player(inputPlayerTwo).validateInputUser()) {
            printResult(inputPlayerOne, inputPlayerTwo)
        } else {
            playerTwo()
        }
    }
    private fun printResult(playerOne: String, playerTwo: String){
        val result = ResultSuit()
        result.getResult(playerOne, playerTwo)
}
    private fun getInputFromUser(): String{
        return try {
            readLine().toString()
        }catch (e:Exception){
            ""
        }
}
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            Apps().run()
        }
}
}
