import java.io.File
import java.io.InputStream
import java.net.URL

class ReadFile {

    operator fun invoke(): List<String> {
        val inputStream: InputStream? = this.javaClass.getResource("data-day01.txt")?.openStream()


        return inputStream!!.bufferedReader().readLines()
    }
}