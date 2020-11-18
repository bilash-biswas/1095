import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var i=1
    for(j <- 60 to 0 by -5)
    {
    printf("I=%d J=%d\n",i,j)
    i=i+3
    }

}
}
 
