package Function_5


fun main() {

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, trả về 1 list mới
    // trả về các chuỗi có kí tự đầu tiên it[0] là p
    val eager = decorations.filter { it[0] == 'p' }
    println("Eager : " + eager)

    println()

    // Lazy filter với Sequence
    // Lazy, will wait until asked to evaluated
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("Filtered:  $filtered")
    // Filtered:  kotlin.sequences.FilteringSequence@3f91beef

    // Force evaluation of lazy list
    val newList = filtered.toList()
    println("New list: $newList")

    println()

    /**
     * Dùng map() để trực quan hóa những gì đang xảy ra với Sequence và lazy evaluation
     * In ra dòng Access: Kèm theo giá trị của phần tử ($it)
     * Trả về chính phần tử đó (it), nghĩa là không thực hiện biến đổi gì cả
     */
    val lazyMap = decorations.asSequence().map {
        println("Access: $it")
        it
    }
    println("Lazy: $lazyMap") // In ra cái đéo gì không biết
    println("----------")
    println("first: ${lazyMap.first()}") // Gọi first() để tính toán, khi này trả về phần tử đầu tiên
    println("----------")
    println("All: ${lazyMap.toList()}") // lặp qua tất cả các phần tử rồi mới tạo list

    println()

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("Access: $it")
        it
    }
    println("---------")
    println("filtered: ${lazyMap2.toList()}") // lặp qua các phần tử (In ra access: it) rồi đưa vào 1 list

    println()

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}