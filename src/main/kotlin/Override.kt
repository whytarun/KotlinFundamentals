fun main(){

    val iphoneObject =Iphone()
    iphoneObject.makeCall()
    iphoneObject.display()
}
/*
    to over methods in mobile class we use open keyword of inheritance
 */
open class Mobile{
    var name :String =""
    open var size :Int =6
    fun makeCall() = println("calling mobile")
    fun makeReboot() = println("reboot mobile")
    /*
        we are over-riding display with help of open keyword
     */
    open fun display()= println("display mobile")
}

class Iphone :Mobile(){

    override fun display() {
        super.display()
        println("display iphone")
    }
}