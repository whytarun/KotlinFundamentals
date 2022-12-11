fun main(){

        val emp = Employee(123, "tarun")
        emp.id =234
        emp.name ="var"

    println(emp)

    // apply it return object

    emp.apply {
        id =456
        name ="kar"
    }

    // with if you want to return as object

    with(emp){
        id =8888
        name ="ooooo"
    }

    // run will also return the object... it has also combination of let & with
    emp.run {
        id = 44
        name ="whyyyy"
    }

    emp.also {
        it.name ="help"
        it.id =1233
    }


    // let function, this returns lambda & you can get any properties of this
    emp.let {
        println( it.name +"-"+it.id)
     }

    // if xyz value is not null then xyz value will be update string
    var xyz :String? =null
    xyz?.let {
        xyz= "update string"
    }

}


data class Employee(var id :Int, var name:String)