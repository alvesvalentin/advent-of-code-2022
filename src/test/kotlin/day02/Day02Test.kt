package day02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class Day02Test {

    @Nested
    inner class Rock {
        @Test
        fun `winning with rock against a scissor grants us 8 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("C", "X")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(7)
        }

        @Test
        fun `tying with rock grants us 4 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("A", "X")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(4)
        }

        @Test
        fun `Losing with rock grants us 1 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("B", "X")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(1)
        }


    }

    @Nested
    inner class Scissor {
        @Test
        fun `winning with scissor against a paper grants us 8 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("B", "Z")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(9)
        }

        @Test
        fun `tying with scissor grants us 4 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("C", "Z")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(6)
        }

        @Test
        fun `Losing with scissor against a rock grants us 1 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("A", "Z")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(3)
        }


    }

    @Nested
    inner class Paper {
        @Test
        fun `winning with paper against a rock grants us 8 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("A", "Y")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(8)
        }

        @Test
        fun `tying with paper grants us 4 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("B", "Y")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(5)
        }

        @Test
        fun `Losing with paper against a scissor grants us 1 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("C", "Y")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(2)
        }


    }

    @Nested
    inner class WithKnownOutcome {
        @Test
        fun `winning with paper against a rock grants us 8 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("A", "Y")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(8)
        }

        @Test
        fun `tying with paper grants us 4 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("B", "Y")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(5)
        }

        @Test
        fun `Losing with paper against a scissor grants us 1 points`() {
            // Arrange
            val day02 = Day02(emptyList())
            val pair = Pair("C", "Y")

            // Act
            val calculatePoint = day02.calculatePoint(pair)
            // Assert
            assertThat(calculatePoint).isEqualTo(2)
        }


    }
}