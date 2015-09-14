import javax.swing.JFrame;
public class JogoDaVelha extends JFrame{
	public static void main(String[] args)
	{
        GameManager.getInstance().realizarJogada();
	}
}
