package test;

public class RebotePelota {

	public static void main (String [] arg) {
		
		bouncingBall(3.0, 0.66, 1.5);
	}
	
	
	public static int bouncingBall(double h, double rebote, double ventana) {
        if (h <= 0 || rebote <= 0 || rebote >= 1 || ventana >= h) return -1;
        double bounceHight = h * rebote;
        int cantidad = 1;
        
        while (bounceHight > ventana) {
            cantidad += 2;
            bounceHight = bounceHight * rebote;
        }
        System.out.println("Cantidad : "+cantidad);
        return cantidad;
    }
	
	/*
	public static int bouncingBall(double h, double bounce, double window) {
	    if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
	      return -1;
	    int seen = -1;
	    while (h > window) {
	          seen += 2;
	          h = h * bounce;
	    }
	      return seen;
	    
	  }
	  */
	  
}
