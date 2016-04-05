package p2.fcfs;


public class Automatico extends Thread
{
	
	
	
	
	
	
	
	public void run()
	{
		
		while(true)
		{
			if(Ventana.contador==0)
	  	   	 {
			Ventana.crea();
			Ventana.Creador.start();
	  	   	 }
	  	    else
	  	    	Ventana.crea();
			
			
			
			try {
				this.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	 
		
		
		
		
	}

}
