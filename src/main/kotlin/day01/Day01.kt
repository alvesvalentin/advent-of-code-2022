package day01

class Day01 {

    fun countHighestCaloriesForOneElf(calories: List<String>): Int {
        val maxCaloriesPerElf = mutableListOf<Int>()
        var highestCaloriesPerElf = 0

        calories.forEach {
            if ("".equals(it)) {
                maxCaloriesPerElf.add(highestCaloriesPerElf)
                highestCaloriesPerElf = 0
            }
            else highestCaloriesPerElf += it.toInt()
        }.also { maxCaloriesPerElf.add(highestCaloriesPerElf) }

        return maxCaloriesPerElf.max()
    }

    fun countHighestCaloriesForThreeElves(calories: List<String>): Int {
        val maxCaloriesPerElf = mutableListOf<Int>()
        var highestCaloriesPerElf = 0

        calories.forEach {
            if ("".equals(it)) {
                maxCaloriesPerElf.add(highestCaloriesPerElf)
                highestCaloriesPerElf = 0
            }
            else highestCaloriesPerElf += it.toInt()
        }.also { maxCaloriesPerElf.add(highestCaloriesPerElf) }

        return maxCaloriesPerElf
            .take(3)
            .sum()
    }
}