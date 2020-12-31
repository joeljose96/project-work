package somePackage;

public class ComputePi {
    public static void main(String[] args){
        int maxTerm=1000000;
        double sum=0.0;
        for (int term=1; term<=maxTerm; term++){
            if (term % 2 == 1){
                sum += 1.0/(term * 2 -1);
            }else{
                sum+= 1.0/(term * (-2) +1);
            }
        }
        System.out.println(4*sum);
        System.out.println((4*sum/Math.PI)*100);
        /*int maxDenominator=10000000;
        double sumPos=0.0;
        double sumNeg=0.0;
        double computedPi;
        for (int i=1; i<maxDenominator;i+=4){
            sumPos+=1/(double)i;
        }
        System.out.println(sumPos);
        for (int j=-3; j>=maxDenominator*-1; j-=4){
            sumNeg+=1/(double)j;
        }
        System.out.println(sumNeg);

        computedPi=4*(sumPos+sumNeg);
        System.out.println(computedPi);
       /* double suml2r=0.0;
        double sumr2l=0.0;
        double absDiff;
        for (int number=1; number<=maxDenominator; number++){
            suml2r+=1/(double)number;
        }
        System.out.println(suml2r);
        for (int kumber=maxDenominator; kumber>=1; kumber--){
            sumr2l+=1/(double)kumber;
        }
        System.out.println(sumr2l);
        if (suml2r>sumr2l){
            absDiff=suml2r-sumr2l;
        } else{
            absDiff=sumr2l-suml2r;
        }
        System.out.println(absDiff);*/
    }
}
