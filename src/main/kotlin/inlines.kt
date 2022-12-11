fun main(){

        calculateTime {
            myLoop( 10000)
        }
        calculateTime1 {
        myLoop( 10000)
        }
}

/*
    it enhnace the perfomance of higher-order function

    higher order function create  each class for the function parameter and
     also create instance for the class

     where as inline funciton doesnt create the instacne of the class, it will copy the body and paste it
 */

/*
    will know the perfomance
 */
fun calculateTime1(fn:()->Unit){
    val start =System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    val totalTime =end-start
}
/*
    will know the perfomance
 */
inline fun calculateTime(fn:()->Unit){
    val start =System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    val totalTime =end-start
}

fun myLoop( n:Long){
    for ( i in 1..n){

    }
}