fun main(){
    print("Введите первое число: ")
    var one = readLine()!!.toDouble()
    print("Введите второе число: ")
    var two = readLine()!!.toDouble()
    if(one > two)
        one++
    else if(two > one)
        two++
    else one = one* one * one
    println("Первое число $one, втоое число $two")

}