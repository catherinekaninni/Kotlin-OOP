fun main(){
    var being =Human("Catherine",20,40)
    being.eat( 2)
    being.Speak("japanese")
    being.birthday()

        var person = User("Timothy","Mutuvi","timothymtuvi@gmail.com",76554444,75436)
    println("${person.firstName} ${person.email}" )


}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat (foodweight:Int){
        weight+=foodweight
        println("I am eating $foodweight kgs of food")
    }
    fun Speak(speech:String){
        println(speech)
    }
    fun birthday(){

        println(age+1)
    }

}
class User(var  firstName:String,var lastName:String,var  email:String,var phoneNumber:Int,var password:Int ){

}



