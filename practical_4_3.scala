object practical_4_3{
    def main(args: Array[String]):Unit ={
            println(formatNames("Benny",toUpper))
            println(formatNames("Niroshan",format2))
            println(formatNames("saman",toLower))
            println(formatNames("Kumara",formatname1))
    }
    def toUpper(name:String):String={
           name.toUpperCase()
    }
     def toLower(name:String):String={
           name.toLowerCase()
    }
    def formatname1(name:String):String={
        name.head.toUpper + name.tail.init +name.last.toUpper
    }
    def format2(name:String):String={
        name.head.toUpper +name.charAt(2).toUpper + name.drop(6)
    }
    def formatNames(name:String ,formatFunction: String => String):String ={
        formatFunction(name);
    }
}