import java.util.Hashtable;
import java.util.Dictionary;
import java.util.Enumeration;
/**
 * Write a description of class Histograma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Histograma
{
    /**
     * Constructor for objects of class Histograma
     */
    public Histograma(String s) {
        Dictionary<Character, Integer> dicionario = new Hashtable();
        
        for(int i = 0;i < s.length();i++){
            
            if(dicionario.get(s.charAt(i)) == null){
                dicionario.put(s.charAt(i), 1);
            } else {
                dicionario.put(s.charAt(i), dicionario.get(s.charAt(i))+ 1);
            }
        }
        valores = dicionario;
    }
    
    /**
     * Classe responsável por limpar a String
     * 
     * @param palavra1 palavra a ser limpa
     * @return a palavra limpa e minúscula (padrão)
     */
    public static String limparString(String palavra1)
    {
        //         String palavra = palavra1.replaceAll("\\s", "");
        //         palavra = palavra.replaceAll("!","");
        //         palavra = palavra.replaceAll("'","");
        //         palavra = palavra.replaceAll("-","");
        //         palavra = palavra.replaceAll(",","");
        //         palavra = palavra.replaceAll("\\.","");
        //         palavra = palavra.replaceAll("\\?","");
        //         palavra = palavra1.replaceAll("\\W", "");
        String palavra = palavra1.replaceAll("\\s","");
        return palavra.toLowerCase();
    }
    
    public String toString(){
        String answer = "";
        Enumeration<Character> E = valores.keys();
        while(E.hasMoreElements()) {
            char next = E.nextElement(); 
            answer += next + " :" + valores.get(next) + "\n";
        }
        return answer;
    }
    private Dictionary<Character,Integer> valores = new Hashtable();
}
