public class No
{
    public int altura;
    public int key;
    public No esq, dir;
    
    public No(int valor)
    {
        this(valor, null, null);
    }
    
    public No(int valor, No esq, No dir)
    {
        key = valor;
        this.esq = esq;
        this.dir = dir;
        altura = 0;
    }
}
