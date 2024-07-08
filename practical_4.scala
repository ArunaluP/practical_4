object Practical_4{
    def main(args: Array[String]):Unit ={
        val name = scala.io.StdIn.readLine()
        println(name)
        var items =Array("soap","Toothpaste","Brush")
        var quantity = Array(34,45,23)
        sellstock("Brush",12,quantity,items)
        println(quantity.mkString(","))
        displaystock(quantity,items)
    }
    def restock(s:String,a:Int,x:Array[Int],y:Array[String],index:Int = 0):Array[Int]={
        if( index>= y.length){
        return x }
        if(s==y(index)){
            x(index) = assignment(x(index),a)
            return x
        }
        else{
            restock(s,a,x,y,index +1)
            return x
        }
         

    }
    def sellstock(s:String,a:Int,x:Array[Int],y:Array[String],index:Int = 0):Array[Int]={
        if( index>= y.length){
        return x }
        if(s==y(index)){
            x(index) = minassignment(x(index),a)
            return x
        }
        else{
            sellstock(s,a,x,y,index +1)
            return x
        }
         

    }
    def assignment(x:Int,y:Int):Int={
        x+y

    }
    def minassignment(x:Int,y:Int):Int ={
        x-y

    }
    def displaystock(x:Array[Int],y:Array[String]):Unit={
        if(y.isEmpty){
            return

        }else{println(y.head  +" : "+  x.head)
            displaystock(x.tail,y.tail)
        }
    }
}