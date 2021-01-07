package charpter14.synchnoizedDemo;

public class synchronizedDemo1 {
 public void method(){
     synchronized (this){
         System.out.println("use synchronized on code block" );
     }
 }
}
