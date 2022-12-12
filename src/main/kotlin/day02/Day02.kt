package day02

private const val POINTS_WINNING_ROUND = 6

private const val TIE_SCORE = 3

private const val POINTS_LOSING_ROUND = 0

private const val ROCK_SCORE = 1

private const val PAPER_SCORE = 2

private const val SCISSOR_SCORE = 3

private const val OPPONENT_ROCK = "A"

private const val OPPONENT_PAPER = "B"

private const val OPPONENT_SCISSOR = "C"

private const val MY_ROCK = "X"

private const val MY_PAPER = "Y"

private const val MY_SCISSOR = "Z"

private const val LOST = "X"

private const val DRAW = "Y"

private const val WIN = "Z"

class Day02(private var data: List<Pair<String, String>>) {
    private var myPoints = 0
    private var totalPoints = 0

    fun calculateTotal(data: List<Pair<String, String>> = emptyList()): Int {
        data.map {
            totalPoints += calculatePoint(it)
        }

        return totalPoints
    }

    fun calculateTotalWithKnownOutcome(data: List<Pair<String, String>> = emptyList()): Int {
        data.map {
            totalPoints += calculatePointWithKnownOutcome(it)
        }

        return totalPoints
    }

    fun calculatePoint(pair: Pair<String, String>): Int {
        val opponentChoice = pair.first
        val myChoice = pair.second

        if (opponentChoice == OPPONENT_ROCK) myPoints = computeRock(myChoice)

        if (opponentChoice == OPPONENT_PAPER) myPoints = computePaper(myChoice)

        if (opponentChoice == OPPONENT_SCISSOR) myPoints = computeScissor(myChoice)

        return myPoints
    }

    private fun calculatePointWithKnownOutcome(pair: Pair<String, String>): Int {
        val opponentChoice = pair.first
        val knownOutcome = pair.second

        if (opponentChoice == OPPONENT_ROCK) {
            when(knownOutcome) {
                WIN -> myPoints = computeRock(MY_PAPER)
                LOST -> myPoints = computeRock(MY_SCISSOR)
                DRAW -> myPoints = computeRock(MY_ROCK)
            }
        }

        if (opponentChoice == OPPONENT_PAPER) {
            when(knownOutcome) {
                WIN -> myPoints = computePaper(MY_SCISSOR)
                LOST -> myPoints = computePaper(MY_ROCK)
                DRAW -> myPoints = computePaper(MY_PAPER)
            }
        }

        if (opponentChoice == OPPONENT_SCISSOR) {
            when(knownOutcome) {
                WIN -> myPoints = computeScissor(MY_ROCK)
                LOST -> myPoints = computeScissor(MY_PAPER)
                DRAW -> myPoints = computeScissor(MY_SCISSOR)
            }
        }

        return myPoints
    }

    private fun computeRock(myChoice: String): Int {
        return when(myChoice) {
            MY_ROCK -> ROCK_SCORE + TIE_SCORE
            MY_PAPER -> PAPER_SCORE + POINTS_WINNING_ROUND
            MY_SCISSOR -> SCISSOR_SCORE + POINTS_LOSING_ROUND
            else -> throw Exception()
        }
    }

    private fun computeScissor(myChoice: String): Int {
        return when(myChoice) {
            MY_ROCK -> ROCK_SCORE + POINTS_WINNING_ROUND
            MY_PAPER -> PAPER_SCORE + POINTS_LOSING_ROUND
            MY_SCISSOR -> SCISSOR_SCORE + TIE_SCORE
            else -> throw Exception()
        }
    }

    private fun computePaper(myChoice: String): Int {
        return when(myChoice) {
            MY_ROCK -> ROCK_SCORE + POINTS_LOSING_ROUND
            MY_SCISSOR -> SCISSOR_SCORE + POINTS_WINNING_ROUND
            MY_PAPER -> PAPER_SCORE + TIE_SCORE
            else -> throw Exception()
        }
    }
}