public abstract class Jogador {
    protected int[] tentativa = new int[2];
    protected int jogador;

    // cria o objeto jogador
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    // pega as referencias do tabuleiro, conceito de tentativa, e checa se a tentativa é valida
    public abstract void jogar(Tabuleiro tabuleiro);
    public abstract void Tentativa(Tabuleiro tabuleiro);
    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro){
        if(tabuleiro.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
            
    }
    
}