import java.util.ArrayList;
import java.util.List;

public class LojaJogos {
    private List<Jogo> estoque;
    private List<ListaDesejos> listasDesejos;

    public LojaJogos() {
        this.estoque = new ArrayList<>();
        this.listasDesejos = new ArrayList<>();
    }

    public void adicionarJogoAoEstoque(Jogo jogo) {
        estoque.add(jogo);
    }

    public void criarListaDesejos(String usuario) {
        listasDesejos.add(new ListaDesejos(usuario));
    }

    public boolean adicionarJogoNaLista(String usuario, String tituloJogo) {
        ListaDesejos lista = encontrarListaDesejos(usuario);
        Jogo jogo = buscarJogoNoEstoque(tituloJogo);

        if (lista != null && jogo != null) {
            return lista.adicionarJogo(jogo);
        }
        return false;
    }

    private ListaDesejos encontrarListaDesejos(String usuario) {
        return listasDesejos.stream()
                .filter(lista -> lista.toString().contains(usuario))
                .findFirst()
                .orElse(null);
    }

    private Jogo buscarJogoNoEstoque(String titulo) {
        return estoque.stream()
                .filter(jogo -> jogo.getTitulo().equals(titulo))
                .findFirst()
                .orElse(null);
    }

    public void comprarJogo(String titulo) {
        Jogo jogo = buscarJogoNoEstoque(titulo);
        if (jogo != null && jogo.getCopias() > 0) {
            jogo.setCopias(jogo.getCopias() - 1);
        }
    }

    public void exibirEstoque() {
        System.out.println("\\n=== Estoque de Jogos ===");
        estoque.forEach(System.out::println);
    }

    public void exibirListasDesejos() {
        System.out.println("\\n=== Listas de Desejos ===");
        listasDesejos.forEach(System.out::println);
    }
}
