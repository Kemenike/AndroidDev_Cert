fun main() {
	val D6 = Dice(6, "red")
    println("Your ${D6.color} ${D6.numSides}-sided dice rolled a value of ${D6.roll()}.")
    
    val D20 = Dice(20, "white")
    println("Your ${D20.color} ${D20.numSides}-sided dice rolled a value of ${D20.roll()}")
    
    val quarter = Coin()
    println("Your quarter landed on ${quarter.flip()}.")
}

class Dice(val numSides: Int, val color: String){
    
    fun roll(): Int{
        return (1..numSides).random()
       
    }
}

class Coin() {
    fun flip(): String{
        var range = 0..1
        if(range.random() == 1) {return "Heads"}
        else {return "Tails"}
    }
}