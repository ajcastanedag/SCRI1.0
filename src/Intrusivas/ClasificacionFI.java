/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Intrusivas;


/**
 *
 * @author bebop
 */
public class ClasificacionFI extends ConstValues.Names {
    
public static double distancia_1(double Y1, double Y2, double _1X1, double X2, double F, double P){
    double dist =(Y2-Y1)*((F/2)+P) + (_1X1-X2)*(F*((3^(1/2))/2)) + (X2*Y1-Y2*_1X1);
return dist;
}	
public static double distancia_2(double Y1, double Y2, double _1X2, double X2, double F, double P){
    double dist =(Y2-Y1)*((F/2)+P) + (_2X1-X2)*(F*((3^(1/2))/2)) + (X2*Y1-Y2*_2X1);
return dist;
}	
public static double distancia_3(double Y1, double Y2, double _1X3, double X2, double F, double P){
    double dist =(Y2-Y1)*((F/2)+P) + (_3X1-X2)*(F*((3^(1/2))/2)) + (X2*Y1-Y2*_3X1);
return dist;
}			
public static double distancia_4(double Y1, double Y2, double _4X1, double X2, double F, double P){
    double dist =(Y2-Y1)*((F/2)+P) + (_4X1-X2)*(F*((3^(1/2))/2)) + (X2*Y1-Y2*_4X1);
return dist;
}	
public static double distancia_5(double Y1, double Y2, double _5X1, double X2, double F, double P){
    double dist =(Y2-Y1)*((F/2)+P) + (_5X1-X2)*(F*((3^(1/2))/2)) + (X2*Y1-Y2*_5X1);
return dist;
}	        
public static String getRock(double F, double P, double A) {
    if (F== 0 && P== 0 && A== 0){
        return mensajeND;
    }    
        
    if (0 <= F && F < 10){ 
	if (distancia_1(Y1, Y2, _1X1, X2, F, P) == 0){
		if (F == 0){
                    return mensaje2_reconteoPA;
		}	
            return mensaje2 + _6c + " y " + _7c;
	}	
	if (distancia_1(Y1, Y2, _1X1, X2, F, P) < 0){
            return mensaje + _6c;
	}	
	if ((distancia_1(Y1, Y2, _1X1, X2, F, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, F, P) < 0)){
            return mensaje + _7c;
	}	
	if (distancia_2(Y1, Y2, _2X1, X2, F, P) == 0){
            if (F == 0){
		return mensaje2_reconteoPA;
            }	
            return mensaje2 + _7c + " y " + _8c;
        }		
	if ((distancia_2(Y1, Y2, _2X1, X2, F, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, F, P) < 0)){
            return mensaje + _8c;
	}	
	if (distancia_3(Y1, Y2, _3X1, X2, F, P) == 0){
            if (F == 0){
		return mensaje2_reconteoPA;
            }        
            return mensaje2 + _8c + " y " + _9c;
	}	
	if ((distancia_3(Y1, Y2, _3X1, X2, F, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, F, P) < 0)){
            return mensaje + _9c;
	}	
	if (distancia_4(Y1, Y2, _4X1, X2, F, P) == 0){
            if (F == 0){
                return mensaje2_reconteoPA;
            }
            return mensaje2 + _10c + " y " + _9c;
	}		
	if (distancia_4(Y1, Y2, _4X1, X2, F, P) > 0){
            return mensaje + _10c;
	}	
    }
    if (10 <= F && F <= 60){ 
	if (distancia_1(Y1, Y2, _1X1, X2, F, P) == 0){
            if (F == 10){
		return mensaje4_reconteoPAF;
            }	
            if (F == 60){
		return mensaje3_reconteoPAF;
            }	
            return mensaje2 + _11 + " y " + _12;
	}	
	if (distancia_1(Y1, Y2, _1X1, X2, F, P) < 0){
            if (F == 10){
		return mensaje2 + _6c + " y " + _11;
            }	
            if (F == 60){
                return mensaje2 + _11 + " y " + _15;
            }		 
            return mensaje + _11;
	}	
	if ((distancia_1(Y1, Y2, _1X1, X2, F, P) > 0) && (distancia_5(Y1, Y2, _5X1, X2, F, P) < 0)){
            if (F == 10){
		if (distancia_2(Y1, Y2, _2X1, X2, F, P) == 0){
                    return mensaje3_reconteoPAF;
		}	
		if (distancia_2(Y1, Y2, _2X1, X2, F, P) < 0){
                    return mensaje2 + _7c + " y " + _12;
		}	
		if (distancia_2(Y1, Y2, _2X1, X2, F, P) > 0){
                    return mensaje2 + _8c + " y " + _12;
		}
            }    
            if (F == 60){
                return mensaje2 + _12 + " y " + _15;
            }			
            return mensaje + _12;
	}	
	if (distancia_5(Y1, Y2, _5X1, X2, F, P) == 0){
            if ((F == 10) || (F == 60)){
		return mensaje3_reconteoPAF;
            }	
            return mensaje2 + _12 + " y " + _13;
	}		
	if ((distancia_5(Y1, Y2, _5X1, X2, F, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, F, P) < 0)){
            if (F == 10){
                if (distancia_3(Y1, Y2, _3X1, X2, F, P) == 0){
                    return mensaje3_reconteoPAF;
		}	
		if (distancia_3(Y1, Y2, _3X1, X2, F, P) < 0){
                    return mensaje2 + _8c + " y " + _13;
		}	
		if (distancia_3(Y1, Y2, _3X1, X2, F, P) > 0){
                    return mensaje2 + _9c + " y " + _13;
		}	
            }	
            if (F == 60){
		return mensaje2 + _13 + " y " + _15;
            }			
            return mensaje + _13;
	}			
	if (distancia_4(Y1, Y2, _4X1, X2, F, P) == 0){
            if (F == 10){
                return mensaje4_reconteoPAF;
            }	
            if (F == 60){
		return mensaje3_reconteoPAF;
            }	
            return mensaje2 + _13 + " y " + _14;
	}		 
	if (distancia_4(Y1, Y2, _4X1, X2, F, P) > 0){
            if (F == 10){
                return mensaje2 + _10c + " y " + _14;
            }	
            if (F == 60){
		return mensaje2 + _14 + " y " + _15;
            }	
            return mensaje + _14;
	}	
    }
    if (F > 60 ){
	return mensaje + _15;
    }
    
    
    return errorparam;  
    }
}
