package test;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class ComprarCarro {

	
	public static void main (String [] arg) {
		int[] out = new int[2];
		out = calcular(2000, 8000, 1000, 1.5);
		System.out.println(out[0] + " " + out[1]);
	}
	
	public static int[] calcular(int pCarroViejo, int pCarroNuevo, int ahorroPorMes, double percentajeDesmiMes) {
		int[] result = new int[2];

		Double costoT = 0D;
		int mes = 0;

		if (pCarroViejo >= pCarroNuevo) {
			costoT = (double) (pCarroViejo - pCarroNuevo);
			result[0] = mes;
			result[1] = costoT.intValue();
			return result;
		} else {
			// start iterating months
			double precioViejo = pCarroViejo;
			double precioNuevo = pCarroNuevo;
			double porcenMensual = percentajeDesmiMes;
			
			while (costoT < precioNuevo) {
				mes++;
				costoT += (double) ahorroPorMes;
				if ((mes % 2) == 0) {
					System.out.println("month adjust perc +0.5: " + mes);
					porcenMensual += 0.5D;
				}
				precioViejo *= (1D - porcenMensual / 100D);
				precioNuevo *= (1D - porcenMensual / 100D);
				//System.out.println("adjustedPriceOld: " + precioViejo);
				//System.out.println("adjustedPriceNew " + precioNuevo);
				
				if (costoT + precioViejo >= precioNuevo) {
					costoT += precioViejo - precioNuevo;
					result[0] = mes;
					DecimalFormat df = new DecimalFormat("#");
					df.setRoundingMode(RoundingMode.HALF_EVEN);
					Double d = costoT.doubleValue();
					result[1] = Integer.parseInt(df.format(d));
					System.out.println("result[1] " + result[1]);
					return result;
				}
			}

		}
		return result;
	}
	
	/*
	public static int[] nbMonths(int myCar, int newCar, int perMonth, double loss) {
	    loss = 1 - loss / 100;
	    double w = (double) myCar, mc = (double) myCar, nc = (double) newCar;
	    int m = 0;
	    for(; w < nc; m++) {
	      loss -= m % 2 == 0 ? 0 : .005;
	      mc *= loss;
	      nc *= loss;
	      w = mc + perMonth * (m + 1);
	    }
	    return new int[]{m, (int) Math.round(w - nc)};
	  }
	  */
	
	/*
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
	    int month = 1;
	    int savings = 0;
	    double startPriceOldD = (double) startPriceOld;
	    double startPriceNewD = (double) startPriceNew;
	    while (startPriceNewD > (startPriceOldD + savings)) {
	      if (month % 2 == 0)  percentLossByMonth += .5d;
	      startPriceOldD *= (1 - percentLossByMonth / 100);
	      startPriceNewD *= (1 - percentLossByMonth / 100);
	      savings += savingperMonth;
	      month++;
	    }
	    return new int[] { --month,  (int) Math.round((startPriceOldD + savings) - startPriceNewD) };
	  }
	  
	  */
}
