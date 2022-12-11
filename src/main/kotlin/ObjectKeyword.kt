import org.omg.CORBA.Object
import java.util.Objects

/*
    1. to achieve singleton pattern
    2. can be inherit class & interfaces
    3. no need to create class . directly we can make object
    4. constructor is not allowed , init block

    example like database handler, logger object, retrofit
 */
fun main(){
    A
    B.test()
    PageLikes.likeToProfile()

    val testObj =object :Clone{
        override fun click() {
            println(" click on>>>>>")
        }
    }
    testObj.click()
}

object A{
     var a ="xyz"
}

object B{
    var b ="object"
    fun test(){
        println(" object B")
    }
}

object PageLikes{

    private var noOfLikesToProfile =0
    private var noOfLikesToPic =0

    fun likeToProfile() =noOfLikesToProfile++
    fun likeToPic() =noOfLikesToPic++
}

/*
    to make anonymous objects [no need to give name to the object]
 */



interface Clone {
    fun click()
}