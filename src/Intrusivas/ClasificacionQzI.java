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
public class ClasificacionQzI extends ConstValues.Names{


    
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
if (Q== 0 && P== 0 && F== 0){
    return mensajeND;
}
if (0 <= Q && Q < 5){ 
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _6b + " y " + _7b;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) < 0){
        return mensaje + _6b;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, Q, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, Q, P) < 0)){
        return mensaje + _7b;
    }    
    if (distancia_2(Y1, Y2, _2X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _7b + " y " + _8b; 
    }
    if ((distancia_2(Y1, Y2, _2X1, X2, Q, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, Q, P) < 0)){
        return mensaje + _8b;
    }    
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _8b + " y " + _9b;
    }    
    if ((distancia_3(Y1, Y2, _3X1, X2, Q, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, Q, P) < 0)){
        return mensaje + _9b;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) == 0){
        if (Q == 0){
            return mensaje2_reconteoPA;
        }    
        return mensaje2 + _9b + " y " + _10b;
    }        
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) > 0){
        return mensaje + _10b;
    }    
} 
if (5 <= Q && Q < 20){ 
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }
        return mensaje2 + _6a + " y " + _7a;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) < 0){
        if (Q == 5){
            return mensaje2 + _6a + " y " + _6b;
        }
        return mensaje2 + _6a;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, Q, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, Q, P) < 0)){
        if (Q == 5){
            return mensaje2 + _7a + " y " + _7b;
        }
        return mensaje + _7a;
    }    
    if (distancia_2(Y1, Y2, _2X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }    
        return mensaje2 + _7a + " y " + _8a;
    }    
    if ((distancia_2(Y1, Y2, _2X1, X2, Q, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, Q, P) < 0)){
        if (Q == 5){
            return mensaje2 + _8a + " y " + _8b;
        }
        return mensaje + _8a;
    }    
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }
        return mensaje2 + _8a + " y " + _9a;
    }    
    if ((distancia_3(Y1, Y2, _3X1, X2, Q, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, Q, P) < 0)){
        if (Q == 5){
            return mensaje2 + _9a + " y " + _9b;
        }
        return mensaje + _9a;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) == 0){
        if (Q == 5){
            return mensaje4_reconteoPAQ;
        }
        return mensaje2 + _9a + " y " + _10a;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) > 0){
        if (Q == 5){
            return mensaje2 + _10a + " y " + _10b;
        }
        return mensaje + _10a;
    }    
}
if (20 <= Q && Q <= 60){ 
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) == 0){
        if (Q == 20){
            return mensaje4_reconteoPAQ;
        }    
        if (Q == 60){
            return mensaje3_reconteoPAQ;
        }    
        return mensaje2 + _2 + " y " + _3a;
    }    
    if (distancia_1(Y1, Y2, _1X1, X2, Q, P) < 0){
        if (Q == 20){
            return mensaje2 + _2 + " y " + _6a;
        }    
        if (Q == 60){
            return mensaje2 + _2 + " y " + _1b   ;
        }    
        return mensaje + _2;
    }    
    if ((distancia_1(Y1, Y2, _1X1, X2, Q, P) > 0) && (distancia_2(Y1, Y2, _2X1, X2, Q, P) < 0)){
        if (Q == 20){
            return mensaje2 + _3a + " y " + _7a ;
        }    
        if (Q == 60){
            return mensaje2 + _3a + " y " + _1b     ;
        }    
        return mensaje + _3a;
    }    
    if (distancia_2(Y1, Y2, _2X1, X2, Q, P) == 0){
        if (Q == 20){
            return mensaje4_reconteoPAQ;
        }    
        if (Q == 60){
            return mensaje3_reconteoPAQ ;
        }    
        return mensaje2 + _3a + " y " + _3b;
    }     
    if ((distancia_2(Y1, Y2, _2X1, X2, Q, P) > 0) && (distancia_3(Y1, Y2, _3X1, X2, Q, P) < 0)){
        if (Q == 20){
            return mensaje2 + _3b + " y " + _8a;
        }    
        if (Q == 60){
            return mensaje2 + _3b + " y " + _1b     ;
        }    
        return mensaje + _3b;
    }    
    if (distancia_3(Y1, Y2, _3X1, X2, Q, P) == 0){
        if (Q == 20){
            return mensaje4_reconteoPAQ;
        }    
        if (Q == 60){
            return mensaje3_reconteoPAQ ;
        }    
        return mensaje2 + _3b + " y " + _4;
    }    
    if ((distancia_3(Y1, Y2, _3X1, X2, Q, P) > 0) && (distancia_4(Y1, Y2, _4X1, X2, Q, P) < 0)){
        if (Q == 20){
            return mensaje2 + _4 + " y " + _9a;
        }    
        if (Q == 60){
            return mensaje2 + _4 + " y " + _1b      ;
        }    
        return mensaje + _4;
    }    
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) == 0){
        if (Q == 20){
            return mensaje4_reconteoPAQ;
        }    
        if (Q == 60){
            return mensaje3_reconteoPAQ ;
        }    
        return mensaje2 + _4 + " y " + _5 ;
    }      
    if (distancia_4(Y1, Y2, _4X1, X2, Q, P) > 0){
        if (Q == 20){
            return mensaje2 + _5 + " y " + _10a;
        }    
        if (Q == 60){
            return mensaje2 + _5 + " y " + _1b;
        }    
        return mensaje + _5;
    }    
}
if (90 < Q && Q <= 100 ){
    return mensaje + _1a;
}    
if (60 < Q && Q < 90){
    return  mensaje + _1b;
}   
    return errorparam;
    }//GETROCK
}
    

