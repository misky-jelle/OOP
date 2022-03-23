fun main() {
    var humanWeight=human("Misky",21,73)
    humanWeight.eat(20)
    println(humanWeight.weight)

    humanWeight.speak("AkiraChix is a dope school")

    var details=human.User("Misky","Jelle","misky-jelle","mwd32i")
    println(details.firstname)
    println(details.lastname)

}



class human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        var eat=30
        weight+=foodWeight
        println("i am eating $foodWeight kgs of food")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(year:Int):Int{
        age+=year
        return age
    }
    data class User(var firstname:String,var lastname:String,var email:String,var password:String)
}








