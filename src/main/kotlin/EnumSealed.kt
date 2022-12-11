import java.time.DayOfWeek

fun main(){
    val cls =Day.SAT
    val cls1 =Day1.MON

    val tiles =Tiles.Red("snake",25)
    val tiles1 =Tiles.Red("snake33",26)

    println("tiles"+tiles.type)
}
/*
    set of enum class are defined to use for that variable like gender, calendar

    mon, tue are the instance of the class we cannot change that state
    each object will have single state
 */

enum class Day{
    MON,
    TUE,
    WED,
    THUR,
    FRI,SAT,SUN
}

/*
    enum class with constructor
 */
enum class Day1(val a:Int){
    MON(1),
    TUE(2),
    WED(3),
    THUR(4),
    FRI(5),
    SAT(6),
    SUN(7)
}

/*
    red color can have different types of color red it means each object will have different state
    which we cannot acheieved by enum class so we use sealed classed

    sealed which play around with types..set of type will make different objects []
    enum which play around the values
 */

/*
    sealed class works in the same class cannot be access to other classes
 */
sealed class Tiles{
    class Red(val type:String, val points:Int) :Tiles()
    class Blue( val points:Int) :Tiles()
}