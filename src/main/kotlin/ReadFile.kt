import java.io.File
import java.io.InputStream
import java.net.URL

class ReadFile {

    operator fun invoke(fileName: String): List<String> {
        val inputStream: InputStream? = this.javaClass.getResource(fileName)?.openStream()


        return inputStream!!.bufferedReader().readLines()
    }
}