/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Extrusivas;

/**
 *
 * @author bebop
 */
public class ClasificacionFE extends ConstValues.Names {

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
public static String getRock(double F, double P, double A){
if (0 <= F && F < 10){ 
    if (distancia_1(Y1, Y2, _1X1, X2, F, P) == 0){
        if (F == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _4c + " y " + _5c;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, F, P) < 0){
        return mensaje + _4c;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, F, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, F, P) < 0)){
        return mensaje + _5c;
    }    
    if (distancia_2(Y1, Y2, _2X1, X2, F, P) == 0){
        if (F == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _5c + " y " + _6ce;
    }    
    if ((distancia_2(Y1, Y2, _2X1, X2, F, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, F, P) < 0)){
        return mensaje + _6ce;
    }    
    if (distancia_3(Y1, Y2, _3X1, X2, F, P) == 0){
        if (F == 0){
            return mensaje2_reconteoPA;
        }   
        return mensaje2 + _6ce + " y " + _7e;
    }    
    if ((distancia_3(Y1, Y2, _3X1, X2, F, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, F, P) < 0)){
        return mensaje + _7e;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, F, P) == 0){
        if (F == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _7f + " y " + _7e ;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, F, P) > 0){
        return mensaje + _7f;
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
        return mensaje2 + _8 + " y " + _9;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, F, P) < 0){
        if (F == 10){
            return mensaje2 + _4c + " y " + _8;
        }    
        if (F == 60){
            return mensaje2 + _8 + " y " + _12a;
        }    
        return mensaje + _8;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, F, P) > 0) && (distancia_5(Y1, Y2, _5X1, X2, F, P) < 0)){
        if (F == 10){
            if (distancia_2(Y1, Y2, _2X1, X2, F, P) == 0){
                return mensaje3_reconteoPAF;
            }    
            if (distancia_2(Y1, Y2, _2X1, X2, F, P) < 0){
                return mensaje2 + _5c + " y " + _9;
            }    
            if (distancia_2(Y1, Y2, _2X1, X2, F, P) > 0){
                return mensaje2 + _6ce + " y " + _9;
            }    
        }        
        if (F == 60){
            return mensaje2 + _9 + " y " + _12a;
        }    
        return mensaje + _9;
    }    
    if (distancia_5(Y1, Y2, _5X1, X2, F, P) == 0){
        if (F == 10){
            return mensaje3_reconteoPAF;
        }    
        if (F == 60){
            return mensaje4_reconteoPAF;
        }    
        return mensaje2 + _9 + " y " + _10;
    }    
    if ((distancia_5(Y1, Y2, _5X1, X2, F, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, F, P) < 0)){
        if (F == 10){
            if (distancia_3(Y1, Y2, _3X1, X2, F, P) == 0){
                return mensaje3_reconteoPAF;
            }    
            if (distancia_3(Y1, Y2, _3X1, X2, F, P) < 0){
                return mensaje2 + _6ce + " y " + _10;
            }    
            if (distancia_3(Y1, Y2, _3X1, X2, F, P) > 0){
                return mensaje2 + _7e + " y " + _10;
            } 
        }       
        if (F == 60){
            return mensaje2 + _10 + " y " + _12b;
        }    
        return mensaje + _10;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, F, P) == 0){
        if (F == 10){
            return mensaje4_reconteoPAF;
        }    
        if (F == 60){
            return mensaje3_reconteoPAF;
        }    
        return mensaje2 + _10 + " y " + _11e;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, F, P) > 0){
        if (F == 10){
            return mensaje2 + _7f + " y " + _11e;
        }    
        if (F == 60){
            return mensaje2 + _11e + " y " + _12b;
        }    
        return mensaje + _11e;
    }    
    if (distancia_5(Y1, Y2, _5X1, X2, F, P) == 0){  
        if (F == 90){
            return mensaje3_reconteoPAF;
        }    
        return mensaje2_reconteoPA;
    }    
    if (distancia_5(Y1, Y2, _5X1, X2, F, P) > 0){
        if (F == 90){
            return mensaje2_reconteoPA;
        }    
        return mensaje + _12b;
    }    
    if (distancia_5(Y1, Y2, _5X1, X2, F, P) < 0){
        if (F == 90){
            return mensaje2_reconteoPA;
        }    
        return mensaje + _12a;
    }    
} 
if (60 < F && F <= 90){
            if (distancia_5(Y1, Y2, _5X1, X2, F, P) == 0){  
                if (F == 90){
                    return mensaje3_reconteoPAF;
                }
                return mensaje2_reconteoPA;
            }
            if (distancia_5(Y1, Y2, _5X1, X2, F, P) > 0){
                if (F == 90){
                    return mensaje2_reconteoPA;
                }
                return mensaje + _12b;
            }
            if (distancia_5(Y1, Y2, _5X1, X2, F, P) < 0){
                if (F == 90){
                    return mensaje2_reconteoPA;
                }
                return mensaje + _12a;
            }    
}  
if (F > 90){
    return _12c;
}         
    
    return errorparam;
}//GETROCK
       
}
