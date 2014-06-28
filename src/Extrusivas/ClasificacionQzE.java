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
public class ClasificacionQzE extends ConstValues.Names{
public static double distancia_1(double Y1,double Y2,double _1X1,double X2,double Q,double P){
    double dist = (Y2-Y1)*((Q/2)+P) + (_1X1-X2)*(Q*((3^(1/2))/2)) + (X2*Y1-Y2*_1X1);
    return dist;
}
public static double distancia_2(double Y1,double Y2,double _1X2,double X2,double Q,double P){
    double dist = (Y2-Y1)*((Q/2)+P) + (_2X1-X2)*(Q*((3^(1/2))/2)) + (X2*Y1-Y2*_2X1);
    return dist;
}
public static double distancia_3(double Y1,double Y2,double _1X3,double X2,double Q,double P){
    double dist = (Y2-Y1)*((Q/2)+P) + (_3X1-X2)*(Q*((3^(1/2))/2)) + (X2*Y1-Y2*_3X1);
    return dist;
}
public static double distancia_4(double Y1,double Y2,double _1X4,double X2,double Q,double P){
    double dist = (Y2-Y1)*((Q/2)+P) + (_4X1-X2)*(Q*((3^(1/2))/2)) + (X2*Y1-Y2*_4X1);
    return dist;
}
static public String getRock(double Q, double P, double F){
if (0 <= Q && Q < 5){ 
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }
        return mensaje2 + _4b + " y " + _5b;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) < 0){
        return mensaje + _4b;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, Q, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, Q, P) < 0)){
        return mensaje + _5b;
    }    
    if (distancia_2(Y1, Y2, _2X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }
        return mensaje2 + _5b + " y " + _6be;
    }    
    if ((distancia_2(Y1, Y2, _2X1, X2, Q, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, Q, P) < 0)){
        return mensaje + _6be;
    }    
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }
        return mensaje2 + _6be + " y " + _7ce;
    }    
    if ((distancia_3(Y1, Y2, _3X1, X2, Q, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, Q, P) < 0)){
        return mensaje + _7ce;
    }
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }
        return mensaje2 + _7ce + " y " + _7d    ;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) > 0){
        return mensaje + _7d;
    }    
}    
if (5 <= Q && Q < 20){ 
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }    
        return mensaje2 + _4a + " y " + _5a;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) < 0){
        if (Q == 5){
            return mensaje2 + _4a + " y " + _4b;
        }    
        return mensaje2 + _4a;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, Q, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, Q, P) < 0)){
        if (Q == 5){
            return mensaje2 + _5a + " y " + _5b;
        }    
        return mensaje + _5a;
    }    
    if (distancia_2(Y1, Y2, _2X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }    
        return mensaje2 + _5a + " y " + _6ae    ;
    }    
    if ((distancia_2(Y1, Y2, _2X1, X2, Q, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, Q, P) < 0)){
        if (Q == 5){
            return mensaje2 + _6ae + " y " + _6be;
        }    
        return mensaje + _6ae;
    }    
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }    
        return mensaje2 + _6ae + " y " + _7ae;
    }    
    if ((distancia_3(Y1, Y2, _3X1, X2, Q, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, Q, P) < 0)){
        if (Q == 5){
            return mensaje2 + _7ae + " y " + _7ce;
        }    
        return mensaje + _7ae;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }    
        return mensaje2 + _7ae + " y " + _7be   ;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) > 0){
        if (Q == 5){
            return mensaje2 + _7be + " y " + _7d;
        }    
        return mensaje + _7be;
    }    
}      

if (20 <= Q && Q <= 60){ 
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) == 0){
        if (Q == 20){
            return mensaje4_reconteoPAQ;
        }    
        if (Q == 60){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _1e + " y " + _2e;
    }
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) < 0){
        if (Q == 20){
            return mensaje2 + _1e + " y " + _4a;
        }    
        if (Q == 60){
            return mensaje + _1e;
        }    
        return mensaje + _1e;
    }
    if ((distancia_1(Y1, Y2, _1X1, X2, Q, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, Q, P) < 0)){
        if (Q == 20){
            if (distancia_2(Y1, Y2, _2X1, X2, Q, P) == 0){
                return mensaje3_reconteoPAQ;
            }   
            if (distancia_2(Y1, Y2, _2X1, X2, Q, P) < 0){
                return mensaje2 + _2e + " y " + _5a;
            }   
            if (distancia_2(Y1, Y2, _2X1, X2, Q, P) > 0){
                return mensaje2 + _2e + " y " + _6ae ;
            }   
        }    
        if (Q == 60){
            return mensaje + _2e;
        }            
        return mensaje + _2e;           
    }
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) == 0){
        if (Q == 20){
            return mensaje4_reconteoPAQ;
        }    
        if (Q == 60){
            return mensaje2 + _2e + " y " + _3e;
        }    
        return mensaje2 + _2e + " y " + _3e;
    }
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) > 0){
        if (Q == 20){
            if (distancia_4(Y1, Y2, _4X1, X2, Q, P) == 0){
                return mensaje3_reconteoPAQ;
            }    
            if (distancia_4(Y1, Y2, _4X1, X2, Q, P) < 0){
                return mensaje2 + _3e + " y " + _7ae;
            }    
            if (distancia_4(Y1, Y2, _4X1, X2, Q, P) > 0){
                return mensaje2 + _3e + " y " + _7be ;
            }    
        }
        if (Q == 60){
            return mensaje + _3e;
        }            
        return mensaje + _3e;
    }    
}  























if (Q > 60){
    return mensajeND;
}    
   return errorparam;
}//GETROCK
    
}
