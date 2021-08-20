package act_3

class Account{
  var acc1=8000;
  var acc2 = 2000;
  
  def transfer(trn:Double):Double={
    return acc1 - trn;
  }
  def nowblnce(trn:Double):Double={
    return acc2 + trn;
  }
}

object threeAcc {
  def main(args:Array[String]){
    var p1 = new Account();
    var p2 = new Account();
    
    print("Enter Transfer amount: ");
    var trns = scala.io.StdIn.readInt();
    println("Current value of Account 1: " + p1.transfer(trns));
    println("Current value of Account 2: " + p2.nowblnce(trns));
  }
 
}
