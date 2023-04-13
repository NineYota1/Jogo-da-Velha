import java.util.Random;

public class Computador extends Jogador{
// Cria o objeto computador
    public Computador(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
        int[] jogada = fazerJogada(tabuleiro);
        tabuleiro.setPosicao(jogada, jogador);
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
        // Computador tenta a tentativa
    }
    
    // Permite o jogador realizar uma jogada de maneira aleatoria e autonoma
    private int[] fazerJogada(Tabuleiro tabuleiro){
        int[] jogada = new int[2];
        Random gerador = new Random();
        
        do{
            jogada[0] = gerador.nextInt(3);
            jogada[1] = gerador.nextInt(3);
        }while(!checaTentativa(jogada, tabuleiro));
        
        System.out.println("O jogador " + jogador + " jogou na posição " + (jogada[0]+1) + "," + (jogada[1]+1));
        
        return jogada;
    }
}