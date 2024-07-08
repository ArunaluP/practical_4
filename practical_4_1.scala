object practical_4_2{
    def main(args: Array[String]):Unit ={
        println("Enter a number")
        var integer = scala.io.StdIn.readInt()
        var number = integer.toInt
        if(number<0){
            println("NUmber is Negative")
            if(number%2 ==0){
                println("and even")
            }else{
                println("and odd")
            }
        }else if(number ==0){
            println("Number is Zero")}else{
            if(number%2==0){
                println("Entered Number is Even")
            }else{
                println("Entered number is Odd")
            }
        }

    }
}