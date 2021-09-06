package act_3

class Substruct{
  
  def sub(x:Float, y:Float, z:Float=0):Float={
    return (x-y)-z;
  }
}

object twoSub {
  def main(args:Array[String]){
    var obj = new Substruct();
    
    println(obj.sub(10,2));
    println(obj.sub(3f/4,5f/8,2f/7));
    
    }
}
