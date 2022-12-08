package day01

class Day01 {

    val maxCaloriesPerElf = mutableListOf<Int>()
    var highestCaloriesPerElf = 0

    fun countHighestCaloriesForOneElf(calories: List<String>): Int {
        getTotalCaloriesPerElf(calories)

        return maxCaloriesPerElf.max()
    }

    fun countHighestCaloriesForThreeElves(calories: List<String>): Int {

        getTotalCaloriesPerElf(calories)

        return maxCaloriesPerElf
            .sortedDescending()
            .take(3)
            .sum()
    }

    private fun getTotalCaloriesPerElf(calories: List<String>) {
        calories.forEach {
            if ("".equals(it)) {
                maxCaloriesPerElf.add(highestCaloriesPerElf)
                highestCaloriesPerElf = 0
            } else highestCaloriesPerElf += it.toInt()
        }.also { maxCaloriesPerElf.add(highestCaloriesPerElf) }
    }
}