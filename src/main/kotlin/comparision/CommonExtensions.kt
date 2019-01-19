package comparision

import java.text.SimpleDateFormat
import java.util.*

// Kotlin extension 기능을 이용하자.

fun Date.date2Str(): String {
    val df: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    return df.format(this)
}

fun String.isValid(): Boolean {
    if(this == null || this.equals("")) {
        return false
    }
    return true
}