import _2_Create_a_Class.Aquarium
import _2_Create_a_Class.Plecostomus
import _2_Create_a_Class.Shark
import _2_Create_a_Class.TowerTank

fun buildAquarium(){
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    printSpace()

    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    printSpace()

    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    printSpace()

    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    printSpace()

    // Gọi constructor phụ với numberOfFish = 29
    // Constructor phụ gọi đến constructor chính với các giá trị mặc định
    // Thực thi các khối init theo thứ tự xuất hiện
    // Tính toán chiều cao dựa trên số lượng cá và cập nhật giá trị của height
    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()
    printSpace()

    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    printSpace()

    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun printSpace(){
    println()
    println("============")
    println()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
//    buildAquarium()

    makeFish()
}