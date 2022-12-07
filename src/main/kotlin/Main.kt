import day01.Day01

fun main(args: Array<String>) {
    val day01 = Day01()
    val readFile = ReadFile()

    println(readFile())

    val elfWithHighest = day01.countHighestCaloriesForOneElf(readFile())
    val highestThreeElvesCombined = day01.countHighestCaloriesForThreeElves(readFile())
    println("max for one elf: $elfWithHighest")
    println("max for 3 elves: $highestThreeElvesCombined")
}