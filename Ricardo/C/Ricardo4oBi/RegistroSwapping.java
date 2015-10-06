public interface RegistroSwapping
{
    /*
    * @param tamanho tamanho em bytes 
    */
    void registrarProcesso(int tamanho);
    
    /*
    * @param inicio palavra da memoria onde inicia o buraco
    * @param fim palavra da memoria onde termina o buraco
    */
    void registrarBuraco(int inicio, int fim);
}
