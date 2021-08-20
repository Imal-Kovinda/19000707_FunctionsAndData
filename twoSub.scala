package act_3

class Substruct{
  
  def sub(a:Double, b:Double):Double={
    return a-b;
  }
  def sub3(x:Float, y:Float, z:Float):Float={
    return (x-y)-z;
  }
}

object twoSub {
  def main(args:Array[String]){
    var obj = new Substruct();
    var obj3 = new Substruct();
    
    println(obj.sub(10,2));
    println(obj3.sub3(3f/4,5f/8,2f/7));
    
    }
}