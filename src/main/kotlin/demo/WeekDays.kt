package demo

enum class WeekDays (private val wname:String, private val index:Int){
    MONDAY("星期一",0),TUESDAY("星期二",1);

    override fun toString(): String {
        return "$wname-$index"
    }
}