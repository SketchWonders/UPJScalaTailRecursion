def fibonacci(n:Int):Int={  
  def fib_( n: Int, last:Int, secondToLast:Int): Int = n match  {    
    case 0 => last    
    case x=> fib_ (n-1, last+secondToLast, last)  
  }  
  return fib_ (n, 1, 0)}

(0 to 100).foreach(n => println(fibonacci(n)))
