package _2_Create_a_Class

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    /**
     * Các khối init trong Kotlin cho phép thực thi mã khởi tạo khi 1 đối tượng được
     * tạo ra.
     */
    init {
        println("Aquarium initializing")
    }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) /  (width * length)
        }

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")

        println("Volume: $volume litters Water: $water liters (${water / volume * 100.0}% full)")
    }
}