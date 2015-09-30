import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Pessoa
{
    public static void ordenarPorNomes(List<Pessoa> pessoas){
        for (int i = 0; i < pessoas.size()-1; i++)
        {
            int m = i;
            for (int j = i+1; j < pessoas.size(); j++)
            {
                String maior = pessoas.get(m).nome;
                String outro = pessoas.get(j).nome;
                if(maior.compareTo(outro) > 0)
                {
                    m = j;
                }
            }
            trocar(pessoas, i, m);
        }
    }

    public static void ordenarPorIdades(List<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size() - 1; i++) { 
            int menor = i;
            for (int j = i+1; j < pessoas.size(); j++) {
                Integer idadeMenor = pessoas.get(menor).idade;
                Integer outro = pessoas.get(j).idade;
                if (idadeMenor.compareTo(outro) > 0) {
                    menor = j;
                }
            }
            trocar(pessoas, i, menor);
        }
    }

    public static List<Pessoa> construirPessoas(int qtde){
        final String[] nomes = { "Ricardo", "Guilherme", "Patrick" };
        final String[] sobrenomes = { "Inácio", "Bexiga", "Oliveira", "Onaya", "Prece", "Campos" };
        final Integer[] idades = { 18, 21, 22, 25 };

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Random r = new Random(qtde);
        do {
            String nome = nomes[r.nextInt(nomes.length)];
            String sobrenome = sobrenomes[r.nextInt(sobrenomes.length)];
            Integer idade = idades[r.nextInt(idades.length)];

            pessoas.add(new Pessoa(nome+" "+sobrenome, idade));
            qtde--;
        }while(qtde > 0);

        return pessoas;
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void trocar(List<Pessoa> ps, int i, int m)
    {
        Pessoa aux = ps.get(i);
        ps.set(i, ps.get(m));
        ps.set(m, aux);
    }

    @Override
    public String toString()
    {
        return this.nome + ", " + this.idade;
    }

    public String nome;
    public Integer idade;
}
