import org.scalatest.wordspec._

class FizzBuzzSpec extends AnyWordSpec {
  "The sample code" should {
    "say hello" in {
      assert(Sample.greeting == "hello")
    }
  }
  "One" should {
      "equal one" in {
          assert(FizzBuzz.SayOne == 1)
      }
  }
  "One and two" should {
    "equal one and two" in {
      // arrange
      val teacherSpeak = Array(1, 2)
      val correctReply = Array(1, 2)
      // act
      val studentSpeak = FizzBuzz.SaySomething(teacherSpeak)
      // assert
      assert(studentSpeak.seq == correctReply.seq)
    }
  }
  "One, two, and three" should {
    "equal one, two, and fizz" in {
      val teacherSpeak = Array(1, 2, 3)
      val correctReply = Array(1, 2, "fizz" )

      val studentSpeak = FizzBuzz.SayFizz(teacherSpeak)

      assert(studentSpeak.seq == correctReply.seq)
    }
  }
  "Counting from one to five" should {
    "equal one, two, fizz, four, buzz" in {
      val teacherSpeak = Array(1, 2, 3, 4, 5)
      val correctReply = Array(1, 2, "fizz", 4, "buzz")

      val studentSpeak = FizzBuzz.SayFizzBuzz(teacherSpeak)

      assert(studentSpeak.seq == correctReply.seq)
    }
  }
  "Counting from one to ten" should {
    "equal one, two, fizz, four, buzz, fizz, seven, eight, fizz, buzz" in {
      val teacherSpeak = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      val correctReply = Array(1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz")

      val studentSpeak = FizzBuzz.SayFizzBuzzSmart(teacherSpeak)

      assert(studentSpeak.seq == correctReply.seq)
    }
  }
  "Counting from one to fifteen" should {
    "Have the reply be \"fizzbuzz\" at fifteen" in {
      val teacherSpeak = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
      val correctReply = Array(1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz", 11, "fizz", 13, 14, "fizzbuzz")

      val studentSpeak = FizzBuzz.SayFizzBuzzSmarter(teacherSpeak)

      assert(studentSpeak.seq == correctReply.seq)
    }
  }
}