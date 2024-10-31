import java.util.ArrayList;
import java.util.List;

public class ListaDesejos {
    private String usuario;
    private List<Jogo> jogos;

    public ListaDesejos(String usuario) {
        this.usuario = usuario;
        this.jogos = new ArrayList<>();
    }

    public boolean adicionarJogo(Jogo jogo) {
        return jogos.add(jogo);
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    @Override
    public String toString() {
        return "Lista de Desejos de " + usuario + ": " + jogos;
    }
}
