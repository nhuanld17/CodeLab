package Function_6

fun updateDirty(dirty: Int, operation: (Int) -> Int) : Int {
    return operation(dirty)
}

fun main() {
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel)) // 10

    println()

    println(updateDirty(30, waterFilter)) // 15

    println()

    fun increaseDirty(start: Int) = start + 1
    println(updateDirty(15, ::increaseDirty)) // 16

    println()

    dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel, {dirtyLevel -> dirtyLevel + 23})
    println(dirtyLevel)
}