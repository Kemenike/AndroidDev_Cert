/*
    Written by: Kanayo Emenike
    
    Description:
        This code is a practice exercise for Kotlin
    classes and inheritance.
*/

fun main() {

}

abstract class Dwelling (private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean {
        return residents < capacity
    }
}

class SquareCabin(residents: Int) : Dwelling (residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
}