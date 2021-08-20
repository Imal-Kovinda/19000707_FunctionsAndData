package act_3

class Acc(){
    var accountVal = Array(5000,-1000,2000,100,-600);
    var accountNo = Array("081112547633","081112584267","081112575321","081112577898","081112599963");
    
    
    def neg(){
      var i:Int=0;
      for(i<- 0 to 4){
        if(accountVal(i)<0){
          println("Account number: " + accountNo(i));
        }
      }
    }
    
    def sum(){
      var count:Double = 0;
      var i:Int=0;
      for(i<-0 until 5){
        count += accountVal(i);
      }
      println("Sum of accounts balance: Rs. " + count);
    }
    
    def interest(){
      var i:Int=0;
      for(i<-0 until 5){
        if(accountVal(i)>0){
          var inter = 0.05;
          var kk = accountVal(i)*inter;
          println("Interest of Acc No. " + accountNo(i)+ " : Rs. " + (accountVal(i)+kk));
        }
        else{
          var inter = 1;
          var kk = (-(accountVal(i)))*inter
          println("Interest of Acc No. " + accountNo(i)+ " : Rs. " + (accountVal(i)-kk) );
        }
      }
    }
}

object fourAccList {
  def main(args:Array[String]){
    def test(x:Int) = x match{
      case 0 =>
        var balance = new Acc();
        balance.neg();
        
      case 1 =>
        var bal = new Acc();
        bal.sum();
        
      case 2 =>
        var inst = new Acc();
        inst.interest();
      case _ =>
        println("Plese Enter between 0 and 2");
        
      
    }
    print("Enter 0 for List of Negative balance!\nEnter 1 for Calculate all Acc Balance!\nEnter 2 for get Interest!\n");
    var k = scala.io.StdIn.readInt();
    test(k);
  }
}