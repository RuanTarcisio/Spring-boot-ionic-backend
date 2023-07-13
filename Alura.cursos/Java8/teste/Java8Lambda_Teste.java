package teste;

import java.util.concurrent.atomic.AtomicInteger;

public class Java8Lambda_Teste {
	
	    public static void main(String args[])
	    {
	  
	    	  final AtomicInteger soma = new AtomicInteger(0);

	          new Thread(new Runnable() {
	              @Override
	              public void run() {
	                  System.out.println(soma);
	            	  soma.incrementAndGet();
	            	  System.out.println(soma);
	              }
	          }).run();
	          
	          System.out.println("1º: "+ soma);
	          new Thread(() -> soma.incrementAndGet()).run();
	          System.out.println("1ª: "+ soma);
	    }
	

}
