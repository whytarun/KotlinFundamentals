fun main(){
    println("Hello People".myFormatString())

}

/*
    extension functions helps to add method & properties to the class
 */

fun String.myFormatString():String{
    return "------\n$this\n------"
}