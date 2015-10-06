import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class AulaRadix
{
    public static void ordenarPessoas()
    {
        List<Pessoa> pessoas = Pessoa.construirPessoas(40);

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println("");

        Pessoa.ordenarPorIdades(pessoas);
        System.out.println("Order by age\n-------------------------------\n");

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println("");
        
        Pessoa.ordenarPorNomes(pessoas);
        System.out.println("Order by nome\n-------------------------------\n");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }

    private AulaRadix(){
    }
}
