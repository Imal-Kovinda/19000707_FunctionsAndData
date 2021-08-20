package act_3

class Negative(var a:Int){
  def neg(){
    println(-a);
  }
}

object oneNeg {
  def main(args:Array[String]){
    print("Enter a number: ")
    var n=scala.io.StdIn.readInt();
    var x = new Negative(n);
    x.neg();
  }
}