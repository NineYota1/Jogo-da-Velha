import java.util.Scanner;
public class Humano extends Jogador{
    public Scanner entrada = new Scanner(System.in);
    // cria um player que a interage com o sistema manualmente
    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
        System.out.println("Jogador 'Humano' foi criado!");
    }
    // Insere o jogador humano no jogo
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }
    // Insere a tentativa no jogador
    public void Tentativa(Tabuleiro tabuleiro){
        do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();
                
                if( tentativa[0] > 3 ||tentativa[0] < 1)
                    System.out.println("Linha inv�lida. Digite: 1, 2 ou 3");
                
            }while( tentativa[0] > 3 ||tentativa[0] < 1);
            
            do{
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();
                
                if(tentativa[1] > 3 ||tentativa[1] < 1)
                    System.out.println("Coluna inv�lida. Digite: 1, 2 ou 3");
                
            }while(tentativa[1] > 3 ||tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local j� foi marcado. Tente outro!");
        }while( !checaTentativa(tentativa, tabuleiro) );
    }
}