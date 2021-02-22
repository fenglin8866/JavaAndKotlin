package demo

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class PersonMan {
    var firstName = "天"
    var lastName = "麒"
    var age = 1
    var fullName: String
        set(value) {
            val name = value.split(".")
            firstName = name[0]
            lastName = name[1]
        }
        get() = firstName + lastName
    var salary: Double = 0.0
        /*set(value) {
            if (value > 0.0) {
                field = value
            }
        }*/
        set(value) = if (value > 0.0) {
            field = value
        } else {
            field = 0.0
        }
    lateinit var e: Employee
    var name: String by Delegate()

    val study: String by lazy { fullName }

    var exp: String by Delegates.observable("无") { p, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }

}

class Delegate {
    operator fun getValue(personMan: PersonMan, property: KProperty<*>): String {
//        TODO("Not yet implemented")
        return property.toString()
    }

    operator fun setValue(personMan: PersonMan, property: KProperty<*>, s: String) {
//        TODO("Not yet implemented")
//        property.name=s
        println(s)
    }

}

fun main(args: Array<String>) {
    val p = PersonMan()
    /* println(p.fullName)
     p.fullName="天.麟"
     println(p.lastName)*/
    p.name = "熊天麒"

    println(p.name)

}

