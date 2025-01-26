package sort;

public class Sort {

    public static void main(String[] args) {
        int sort[] = {8, 3, 5, 4, 2, 6, 7, 1};
        int n = sort.length/2;
        int w=sort.length;
        int f[]=new int [n];
        int f2[]=new int [n];
        int i = 0, j = 1, s = 0, c = 0;
        int aux1 = 0, aux2 = 0, p;
        while (i!=n&&j!=n){
            if (sort[i] > sort[n]) {
                aux1 = sort[i];
                s = 1;
            } else {
                i++;
            }
            if (sort[n] > sort[sort.length - j]) {
                aux2 = sort[sort.length - j];
                c = 1;
            } else {
                j++;
            }
            if (s == 1 && c == 1) {
                sort[sort.length - j] = aux1;
                sort[i] = aux2;
                s = 0;
                c = 0;
                i++; j++;
            }
        }//while
        int ñ=0;
        for (int k = 0; k < sort.length; k++) {
            if (k<n) {
                  f[k]=sort[k];
            }
            else{
                f2[ñ]=sort[k];
                ñ++;
            }
            
        }
    
        for (int o = 0; o !=1; o++) {        
        if (f[n-1]>f2[n-n]) {
            p=f2[n-n];
                f2[n-n]=f[n-1];
                f[n-1]=p;
        } 
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (f[k]<f[l]) {
                p=f[l];
                f[l]=f[k];
                f[k]=p;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (f2[k]<f2[l]) {
                p=f2[l];
                f2[l]=f2[k];
                f2[k]=p;
                }
                
            }
        }
        o=0;
        if (f[n-1]>f2[n-n]) {
            p=f2[n-n];
                f2[n-n]=f[n-1];
                f[n-1]=p;
        } 
    }   
        for (int k = 0; k < sort.length/2; k++) {
            System.out.print(" "+f[k]);
        }
        for (int k = 0; k < n; k++) {
            System.out.print(" "+f2[k]);
        }
        System.out.println("");
      
    }
}
