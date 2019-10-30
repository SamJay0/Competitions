class BadHorse{
    fun takeInput (){
        print("enter number of testCases: ")
        val testCases = readLine()
        var count =0;
        while (count< testCases?.toIntOrNull()!!){
            print("enter number of troublesome pairs :")
            val troublesomePairs= readLine()
            for (i in 1..troublesomePairs?.toInt()!!){
                print("enter the pair :")
                var myPair = readLine()
            }
            count++
        }
    }
}