import java.io.IOException
import java.lang.Exception

fun main() {
    try {
        // ... file access
        // ... array access
    } catch (e:IOException){
        // do something
    } catch (e:ArrayIndexOutOfBoundsException){
        // do something
    } catch (e:Exception){
        // do something
        // Log.e("LOG", "Some Exception Occured", e)
    } finally {
        // do this by any means: ...
    }
}