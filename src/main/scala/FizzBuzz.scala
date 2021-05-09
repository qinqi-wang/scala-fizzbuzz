object Sample extends Greeting with App {
  println(greeting)
}

trait Greeting { lazy val greeting: String = "hello" }

object FizzBuzz {
  def SayOne : Int = {
    return 1
  };
  
  def SaySomething(array: Array[Int]) : Array[Int] = {
    return array
  };
  
  def SayFizz(array: Array[Int]): Array[Any] = {
    val spokenArray : Array[Any] = new Array(array.length)
    array.zipWithIndex.foreach{ case(number, count) =>
      if( number == 3) {
        spokenArray(count) = "fizz"
      } else {
        spokenArray(count) = number
      }
    }
    return spokenArray
  }

  def SayFizzBuzz(array: Array[Int]): Array[Any] = {
    val spokenArray : Array[Any] = new Array(array.length)
    array.zipWithIndex.foreach{ case(number, count) =>
      if( number == 3) {
        spokenArray(count) = "fizz"
      } else if (number == 5){
        spokenArray(count) = "buzz"
      }
      else {
        spokenArray(count) = number
      }
    }
    return spokenArray
  }

  def SayFizzBuzzSmart(array: Array[Int]): Array[Any] = {
    val spokenArray : Array[Any] = new Array(array.length)
    array.zipWithIndex.foreach{ case(number, count) =>
      if( number % 3 == 0) {
        spokenArray(count) = "fizz"
      } else if (number % 5 == 0){
        spokenArray(count) = "buzz"
      }
      else {
        spokenArray(count) = number
      }
    }
    return spokenArray
  }

  def SayFizzBuzzSmarter(array: Array[Int]): Array[Any] = {
    val spokenArray : Array[Any] = new Array(array.length)
    array.zipWithIndex.foreach{ case(number, count) =>
      if (number % 3 == 0 && number % 5 == 0) {
        spokenArray(count) = "fizzbuzz"
      }
      else if (number % 3 == 0) {
        spokenArray(count) = "fizz"
      } else if (number % 5 == 0){
        spokenArray(count) = "buzz"
      }
      else {
        spokenArray(count) = number
      }
    }
    return spokenArray
  }
}
