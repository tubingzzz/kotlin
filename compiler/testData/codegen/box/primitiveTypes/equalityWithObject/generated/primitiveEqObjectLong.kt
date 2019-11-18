// IGNORE_BACKEND_FIR: JVM_IR
// Auto-generated by GeneratePrimitiveVsObjectEqualityTestData. Do not edit!

val nx: Any? = 0L
val nn: Any? = null
val x: Long = 0L
val y: Long = 1L

fun box(): String {
    val ax: Any? = 0L
    val an: Any? = null
    val bx: Long = 0L
    val by: Long = 1L

    return when {
        0L != nx -> "Fail 0"
        1L == nx -> "Fail 1"
        !(0L == nx) -> "Fail 2"
        !(1L != nx) -> "Fail 3"
        x != nx -> "Fail 4"
        y == nx -> "Fail 5"
        !(x == nx) -> "Fail 6"
        !(y != nx) -> "Fail 7"
        0L == nn -> "Fail 8"
        !(0L != nn) -> "Fail 9"
        x == nn -> "Fail 10"
        !(x != nn) -> "Fail 11"
        0L != ax -> "Fail 12"
        1L == ax -> "Fail 13"
        !(0L == ax) -> "Fail 14"
        !(1L != ax) -> "Fail 15"
        x != ax -> "Fail 16"
        y == ax -> "Fail 17"
        !(x == ax) -> "Fail 18"
        !(y != ax) -> "Fail 19"
        bx != ax -> "Fail 20"
        by == ax -> "Fail 21"
        !(bx == ax) -> "Fail 22"
        !(by != ax) -> "Fail 23"
        0L == an -> "Fail 24"
        !(0L != an) -> "Fail 25"
        x == an -> "Fail 26"
        !(x != an) -> "Fail 27"
        bx == an -> "Fail 28"
        !(bx != an) -> "Fail 29"
        else -> "OK"
    }
}
