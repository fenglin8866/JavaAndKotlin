package demo

import java.util.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/*class Employee{
    lateinit var dept:Department
}
class Department{
    var id=0
    var name = "大宝"
    override fun toString(): String {
        return "id=$id name=$name"
    }/0
}*/

/*class User{
    var name:String by Delegate()
}

class Delegate{
    operator fun getValue(thisRef: Any,property:KProperty<*>):String=property.name
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value:String){
        println(value)
    }
}*/

/*class Department {
    var id: Int = 0;
    var name: String by Delegates.observable("无") { property, oldValue, newValue ->
        println("$property  $oldValue -> $newValue")
    }
}

val d: Department = Department()
const val s = "sss"
const val n = 10
var ns = 1*/

fun Double.interestBy(interestRate: Double) = this * interestRate


class Department {
    var name: String by Delegates.observable("无") { kProperty: KProperty<*>, s: String, s1: String ->
        println("s=$s->s1=$s1")
    }
}


/*class People {
    fun a() {
        ns = 2;
        print(ns)
    }
}

fun divide(n1: Int, n2: Int): Double? {
    if (n2 == 0) {
        return null;
    }
    return n1.toDouble() / n2

}*/
infix fun Department.a(id: Int) = id

/*fun main(args: Array<String>) {
    *//* println("你好 kotlin")
 //    val it=100
     val ary= arrayListOf<String>("A","B","C")
     ary.forEach { print(it) }*//*
    *//* val divNumber = divide(100, 0)
     val a=divNumber

     val result = divNumber?.plus(100)
     val str1="Hello\tWorld "
     val str2="""Hello \t World"""
     println("str1= $str1 str2= $str2")

     val s: StringBuilder = java.lang.StringBuilder()
     val a1 = String(s)*//*
    *//*var emp=Employee()
    emp.name="Tom"
    println(emp.name)

    var dep=Department();
    dep a 10*//*
    val day = WeekDays.MONDAY
    var id = day.ordinal
    var values = WeekDays.values()
    for (value in values) {
        println(value.name)
    }


    println(day)

}*/


/*fun main(args: Array<String>) {
//    println("你好")
    *//*val emp=Employee();
    emp.dept= Department();
    print(emp.dept)*//*
    *//*var user=User()
    user.name="Tom"
    println(user.name)*//*
    val dep=Department();
    dep.id=20
    dep.name="技术部"
    dep.name="市场部"

    *//*val imei=UUID.randomUUID().toString()
    println(imei);*//*


//bf2f9b2fa921b71ee40a28fb673f97169fb468e0a266229e1bc28a2c6a96ea2a
}*/

data class User constructor(var name: String, var age: Int) {
    var weight: Double = age * 2.0

    constructor(name: String, age: Int, weight: Double) : this(name, age) {
        this.weight = weight
    }
}

class User1(var name: String, var age: Int)

data class User2(val name: String, var passWord: String)

/*fun main(args: Array<String>) {
    *//* val user=User("Tom",25)
     val user1=user.copy(name = "Ann", age = 18)
     val user2=user.copy()
     val(name,age)=user
     println(name)
     println(age)
     val(name2,_)=user
     println(name2)*//*
    val sub = SubClass("tom", 23)
    sub.setValue()
    sub.display() //
}*/

open class ParentClass(var name: String, var age: Int) {
    open var x = 0
    protected open fun setValue() {
        x = 10
    }
}

//class SubClass : ParentClass("Tom",18) {
class SubClass(name: String, age: Int) : ParentClass(name, age) {
    override var x = 0;
    public override fun setValue() {
        x = 20
        super.setValue()
    }

    fun display() {
        println("x=$x")
        println("super.x=${super.x}")
    }
}


sealed class ContentType {
    class Text(val body: String) : ContentType()
    class Image(val url: String, val caption: String) : ContentType()
    class Audio(val url: String, val duration: Int) : ContentType()
}

/*fun renderContent(contentType: ContentType) {
    when (contentType) {
        is ContentType.Text -> println("文件：${contentType.body}")
        is ContentType.Image -> println("文件：${contentType.url}")
        is ContentType.Audio -> println("文件：${contentType.url}")
    }
}*/

/*
abstract class Shape{
    abstract var name:String
    abstract fun onDraw()

    fun display(){
        println(name)
    }

}

class Rectange(override var name: String="矩形") :Shape(){
    override fun onDraw() {
        TODO("Not yet implemented")
    }

}
*/

open class Person(var name: String = "xi", var age: Int = 12) {
    var height: Double? = null

    constructor(name: String, age: Int, height: Double) : this() {
        this.name = name
        this.age = age
        this.height = height
    }
}

open class Person1(var name: String, var age: Int)

/*class Student() : Person() {
    var school: String? = null

    constructor(name: String, age: Int, height: Double, school: String) : super(name, age) {
        this.school = school
    }
}*/


interface A {
    fun method1()
    fun method2()
}

interface B {
    fun method1()
    fun method3()
}

class Test : A, B {
    override fun method3() {
        TODO("Not yet implemented")
    }

    override fun method2() {
        TODO("Not yet implemented")
    }

    override fun method1() {
        TODO("Not yet implemented")

    }

}


open class PersonA(val name: String, val age: Int, val birthDate: Date) {
    constructor(name: String, age: Int) : this(name, age, Date())

    override fun toString(): String {
        return "PersonA name=$name,age=$age,birthDate=$birthDate"
    }
}

class StudentA(name: String, age: Int, birthDate: Date, school: String) : PersonA(name, age, birthDate) {
    constructor(name: String, age: Int, school: String) : this(name, age, Date(), school)
    constructor(name: String, school: String) : this(name, 18, school)
}

class StudentB: PersonA {
    private var school:String?=null
    constructor(name:String,age: Int,birthDate: Date,school: String):super(name,age,birthDate){
        this.school=school
    }

    constructor(name: String,age: Int,school: String):this(name, age, Date(), school)

    override fun toString(): String {
        return "StudentB name=$name,age=$age,birthDate=$birthDate,school=$school"
    }
}

fun main(args: Array<String>) {
    val studentB=StudentB("Tom",32,"清华")
    println(studentB)
}





































