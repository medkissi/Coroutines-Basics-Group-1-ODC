import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    println("Debut du programme principal:${Thread.currentThread().name}")
    runBlocking {
        launch {
            println("Début de ma tache lourde dans: ${Thread.currentThread().name}")
            delay(1000)
            val user = getUser()
            println(user)
            println("Fin de ma tache lourde: ${Thread.currentThread().name} ")

        }
    }
    println("Fin du programme principal: ${Thread.currentThread().name} ")
}
suspend fun getUser(): String {
    delay(1000)
    return "Mohamed Kissi"
}

