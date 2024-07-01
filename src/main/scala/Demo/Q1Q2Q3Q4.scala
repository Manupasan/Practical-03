@main def main() =
  /*Q1*/
  print("Enter a string: ")
  val a = scala.io.StdIn.readLine()
  print("Reversed string is : ")
  var b = a.length
  println(Q1reverse(a,b))
  println("")

  /*Q2*/
  for(i <- Q2length5())
    println(i)
  println("")

  /*Q3*/
  println("Average is : " + Q3avg())
  println("")

  /*Q4*/
  println("Even numbers are : " + Q4even())

def Q1reverse(a : String, b : Int) : String =
  if (b == 0) ""
  else
    a(b - 1) + Q1reverse(a,b-1)

def Q2length5(): Array[String] =
  println("Enter strings (Ex : saman,kamal, ...) : ")
  val x = scala.io.StdIn.readLine()
  val arr: Array[String] = x.split(",")
  var arr2 = Array.empty[String]

  println("Strings that have a length greater than 5 are : ")
  for (i <- arr.indices)
    if (arr(i).length > 5)
      arr2 = arr2 :+ arr(i)
  arr2

def Q3avg() =
  print("Enter first number : ")
  val num1 = scala.io.StdIn.readDouble()
  print("Enter second number : ")
  val num2 : Double = scala.io.StdIn.readDouble()
  val avg = (((num1 + num2)/2)*100).round
  avg.toFloat/100

def Q4even() =
  var str = ""
  println("How many numbers do you want to enter? :")
  val num = scala.io.StdIn.readInt()
  println("Enter numbers ")
  for(i <- 1 to num)
    val x = scala.io.StdIn.readInt()
    if(x % 2 == 0)
      str = str + x + "    "
  str







