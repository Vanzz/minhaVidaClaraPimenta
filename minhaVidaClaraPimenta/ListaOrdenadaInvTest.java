public class ListaOrdenadaInvTest
{
    public static void testaLista ()
    {
        ListaOrdenadaInv<Float> loi = new ListaOrdenadaInv<Float>();
        
        float[] insercoes = { 8f,4f,9f,3f,2f,0f,6f,4f,1f };
        
        for (float n : insercoes)
        {
            loi.inserir(n);
        }
        System.out.println(loi);
        
        loi.removerEm(0);
        System.out.println(loi);
        
        loi.removerEm(loi.buscar(4f));
        System.out.println(loi);
    }
    
    public static void testaHeap()
    {
        Integer[] naoHeap = { null, 10, 8, 9, 4, 9, 8, 7 };
        Integer[] heap = { null, 10, 8, 9, 4, 7, 8, 7 };
        
        System.out.println(UtilitariosHeap.verificarHeap(heap));
        System.out.println(UtilitariosHeap.verificarHeap(naoHeap));
    }
}
