package logaritmo;

public class Logaritmo {
  double loge(){
      double enl, delta, fact;
     int n;
     enl=fact =delta=1.0;
     n=1;
     do{
         enl +=delta;
         n++;
         fact*=n;
         delta=1.0/fact;
     }while(enl!=enl+delta);
      return enl;
  }
   
  double loge2( double enl2,double delta2,double fact2, int n2){
    
     if(enl2==enl2+delta2){
         return enl2;
     }
     else{
           n2++;
         enl2 +=delta2;
         fact2*=n2;
         delta2=1.0/fact2;
         return loge2(enl2,delta2,fact2,n2);
     }
  }
  
    public static void main(String[] args) {
    Logaritmo obj=new Logaritmo();
        System.out.println(""+obj.loge());
        double enl2=1.0, delta2=1.0, fact2=1.0;
     int n2=1;
        System.out.println(""+obj.loge2(enl2,delta2,fact2,n2));
    }
   
}