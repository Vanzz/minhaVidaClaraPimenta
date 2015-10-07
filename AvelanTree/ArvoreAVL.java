public class ArvoreAVL
{
    public No raiz = null;

    public ArvoreAVL ()
    {
        raiz = null;
    }

    public void limpar ()
    {
        raiz = null;
    }

    public boolean isEmpty ()
    {
        if(raiz == null)
            return true;
        else
            return false;
    }

    public No getNoRaiz ()
    {
        return raiz;
    }

    public static int altura (No _no)
    {
        if(_no == null)
            return -1;
        else
            return _no.altura;
    }

    public static int max (int esq, int dir)
    {
        if(esq > dir)
            return esq;
        else
            return dir;
    }

    public int getFactor (No _no)
    {
        return altura(_no.esq) - altura(_no.dir);
    }

    public boolean inserir (int x)
    {
        raiz = inserir (x, raiz);
        return true;
    }

    public No inserir (int x, No _no)
    {
        if(_no == null)
            _no = new No (x, null, null);
        else if (x < _no.key) _no.esq = inserir (x, _no.esq);
        else if (x > _no.key) _no.dir = inserir (x, _no.dir);

        _no = balanciar (_no);
        return _no;
    }

    public No balanciar (No _no)
    {
        if (getFactor(_no) == 2)
        {
            if(getFactor(_no.esq) > 0) _no = rotacaoDir(_no);
            else _no = rotacaoDuplaDir(_no);
        }
        else if (getFactor(_no) == -2)
        {
            if(getFactor(_no.dir) < 0) _no = rotacaoEsq(_no);
            else _no = rotacaoDuplaEsq(_no);
        }

        _no.altura = max(altura(_no.esq), altura(_no.dir)) + 1;
        return _no;
    }

    public static No rotacaoDir(No _no2)
    {
        No _no1 = _no2.esq;
        _no2.esq = _no1.dir;
        _no1.dir = _no2;
        _no2.altura = max(altura(_no2.esq), altura(_no2.dir)) + 1;
        _no1.altura = max(altura(_no1.esq), _no2.altura) + 1;
        return _no1;
    }

    public static No rotacaoEsq(No _no1)
    {
        No _no2 = _no1.dir;  
        _no1.dir = _no2.esq;  
        _no2.esq = _no1;  
        _no1.altura = max( altura(_no1.esq), altura(_no1.dir)) + 1;  
        _no2.altura = max( altura(_no2.dir), _no1.altura) + 1;  
        return _no2;
    }

    public static No rotacaoDuplaDir( No _no3 ) {  
        _no3.esq = rotacaoEsq( _no3.esq );  
        return rotacaoDir( _no3 );  
    }  

    public static No rotacaoDuplaEsq( No _no1 ) {  
        _no1.dir = rotacaoDir( _no1.dir );  
        return rotacaoEsq( _no1 );  
    }

    public No searchFather (int elem) {  
        No _no = raiz;  
        No ant = null;  
        while (_no != null && !(_no.key == elem)) {
            ant = _no;                             
            if (_no.key<elem)  
                _no = _no.dir;  
            else _no = _no.esq;  
        }  
        if (_no !=null && _no.key==elem) return ant;  
        return null;  
    }  

    public void displayTree() {  
        if (isEmpty()){  
            System.out.println("Árvore vazia!");  
            return;  
        }             
        String separator = String.valueOf("  |__");  
        System.out.println(this.raiz.key+"("+raiz.altura+")");  
        displaySubTree(raiz.esq,  separator);  
        displaySubTree(raiz.dir, separator);  
    }  

    public void displaySubTree(No node, String separator) {
        if (node != null) {
            No father = this.searchFather(node.key);  
            if (node.equals(father.esq) == true) {  
                System.out.println(separator+node.key+"("+node.altura+")"+" (ESQ)");  
            }else{  
                System.out.println(separator+node.key+"("+node.altura+")"+" (DIR)");  
            }             
            displaySubTree(node.esq,  "     "+separator);  
            displaySubTree(node.dir, "     "+separator);  
        }  
    }  

    public static void main (String args[]){  
        ArvoreAVL t = new ArvoreAVL();  
        t.inserir(10);  
        t.inserir(5);  
        t.inserir(15);  
        t.inserir(23);  
        t.inserir(32);  
        t.inserir(1);  
        t.inserir(3);   
        t.displayTree();  
    }
}
