import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun main() {
    val currentMoment = Clock.System.now()
    val currentDate = currentMoment.toLocalDateTime(TimeZone.currentSystemDefault()).date
    println("Current Date: $currentDate")
 }
