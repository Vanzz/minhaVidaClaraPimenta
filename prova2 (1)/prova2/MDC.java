import java.util.List;
import java.util.ArrayList;
import java.lang.*;
import java.math.*;

/**
 * Write a description of class GDC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MDC
{
    public static Integer primoProximo(Integer n) {
        BigInteger a = new BigInteger(""+n);
        BigInteger b;
        Integer resp;
        
        b = a.nextProbablePrime();
        resp = b.intValue();
        
        return resp;
        //         int cont = 0;
        //         for(int i = 0; i <= n; i++){
        //             if (n%i == 0){
        //                 cont = cont+1;
        //             }
        //             if (cont == 2){
        //                 //É primo
        //             }else{
        //                 //Não é primo
        //             } 
        //         }
    }
    
    public static List<Integer> decomporPrimos(Integer n) {
        List <Integer> fatores = new ArrayList<Integer>();
        
        for(int i = 0; i <= n; i++){
            int temp = primoProximo(i);
            while(n%temp == 0){
                n = n/temp;
                fatores.add(temp);
            }
        }
        
        return fatores;
    }
    
    public static Integer calcularMDC(Integer a, Integer b) {
        List <Integer> fatoresA = new ArrayList<Integer>();
        List <Integer> fatoresB = new ArrayList<Integer>();
        fatoresA = decomporPrimos(a);
        fatoresB = decomporPrimos(b);
        List <Integer> resp = new ArrayList<Integer>();
        int mdc = 1;
        
        int cont = 0;
        if(fatoresA.size() > fatoresB.size()) cont = fatoresA.size();
        else cont = fatoresB.size();
        
        for(int i = 0; i < fatoresA.size(); i++){
            //if(fatoresA.get(i) == null || fatoresB.get(i) == null) break;
            for(int j = 0; j < fatoresB.size(); j++){
                if(fatoresA.get(i) == fatoresB.get(j)) {
                    resp.add(fatoresA.get(i));
                    fatoresB.remove(j);
                    break;
                }
            }
        }
        
        for(int i = 0; i < resp.size(); i++){
            mdc *= resp.get(i);
        }
        
        return mdc;
    }
}
