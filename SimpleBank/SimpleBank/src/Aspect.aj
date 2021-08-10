import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public aspect Aspect {
	/*Se crea el punto de corte llamado success y será llamado cada vez que termine de ejecutarse un método cuyo nombre
	comience con registrar*/
	pointcut success() : call(* registrar*(..) );
    after() : success() {
    
    	System.out.println("****Avion registrado con exito****");
    }	    
    //Se inicializa el descriptor del archivo junto con la fecha actual
    File file = new File("log.txt");
    Calendar cal = Calendar.getInstance();
   
    FileWriter bw;
    /*Punto de corte que se llamará solo para el método despegar*/
    pointcut success2() : call(* despegar(..) );
    after() : success2() {
    	System.out.println("Despego el avion"+" "+cal.getTime()+"  ");
    	//Se intenta registrar el despegue del avion en log.txt
    	try {
    		bw = new FileWriter(file,true);
			bw.write("Despego el avion"+" "+cal.getTime()+"\n");
	    	bw.close();
    	//En caso de alguna falla se imprime por consola
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /*Este último punto de corte llamado retirar será llamado cuando se llame
    a un método que comience con aterrizar */
    pointcut retirar() : call(* aterrizar*(..) );
    after() : retirar() {
    	String st = "Aterrizo el avion: "+cal.getTime();
    	System.out.println(st);
    	FileWriter fw2;
		try {
			fw2 = new FileWriter(file,true);
			fw2.write("Aterrizo el avion: "+cal.getTime()+"\n");
	    	fw2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
