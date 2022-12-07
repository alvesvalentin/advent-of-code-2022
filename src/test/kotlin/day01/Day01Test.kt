package day01

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Day01Test {

    @Test
    fun `show highest calorie for one elf`() {
        // Arrange 6250 6817
        val day01 = Day01()

        val calories = listOf("5229", "1021", "", "2051", "4766")
        // Act
        val countHighestCalories = day01.countHighestCaloriesForOneElf(calories)
        // Assert
        assertThat(countHighestCalories).isEqualTo(6817)
    }

    @Test
    fun `show highest calorie for 3 elves`() {
        // Arrange 30269
        val day01 = Day01()

        val calories = listOf(
            "5229",
            "1021",
            "",
            "2051",
            "4766",
            "2272",
            "",
            "5810",
            "4688",
            "2324",
            "2108",
        )
        // Act
        val countHighestCalories = day01.countHighestCaloriesForThreeElves(calories)
        // Assert
        assertThat(countHighestCalories).isEqualTo(30269)
    }
}