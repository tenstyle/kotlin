const val MAX_EXPERIENCE: Int = 5000

fun main() {
    val playerName = "Tenstyle"
    var experiencePoints = 5
    var hasSteed = false
    val tavern = "Unicorn Horn"
    val innkeeperName = "Innkeeper"
    var cash = 50
    var menu: Set<String> = setOf("Honey", "Vine", "Beer")
    println(experiencePoints)
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println(hasSteed)
    println(MAX_EXPERIENCE)
    println(playerName.reversed())
}