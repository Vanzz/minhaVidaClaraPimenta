
/**
 * Escreva a descrição da classe ListaOrdenadaInv aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ListaOrdenadaInv <T extends Comparable<T>> 
{
    public ListaOrdenadaInv ()
    {

    }

    public void inserir (T v)
    {
        /* Maneira errada, porque O(nlog n)
         * lista[elems] = v;
         * ordenar(lista); */
        int n = 0;
        for (n = elems; n > 0; n--)
        {
            /* CompareTo
             * - 1 se v maior
             * 0 se v igual
             * 1 se v menor
            */
            
            if(lista[n-1].compareTo(v) > 0){
                break;
            }else{
                lista[n] = lista[n-1];
            }
        }

        lista[n] = v;
        elems++;
    }

    public int buscar (T v)
    {
        int esq = 0;
        int dir = elems;

        do {
            int meio = (dir + esq) / 2;
            if (lista[meio].compareTo(v) == 0)
            {
                return meio;
            } else if (lista[meio].compareTo(v) < 0) {
                dir = meio + 1;
            } else {                
                esq = meio;
            }
        } while ((dir - esq) > 0);
        return -1;
    }

    public T removerEm (int i)
    {
        T removido = lista[i];

        elems--;
        for (int n = i; n < elems; n++)
        {
            lista[n] = lista[n+1];
        }
        lista[elems] = null;

        return removido;
    }

    public T recuperarEm (int i)
    {
        return lista[i];
    }

    public int numElementos ()
    {
        return elems;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < elems-1; i++)
        {
            sb.append(lista[i]).append(",");
        }
        sb.append(lista[elems-1]).append("}");
        
        return sb.toString();
    }

    private static final int LISTA_LEN_PADRAO = 100;
    
    private T[] lista = (T[]) new Comparable[LISTA_LEN_PADRAO];
    private int elems = 0;
}
