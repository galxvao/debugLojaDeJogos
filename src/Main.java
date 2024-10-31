public class Main {
    public static void main(String[] args) {
        LojaJogos loja = new LojaJogos();

        // Adiciona jogos ao estoque
        loja.adicionarJogoAoEstoque(new Jogo("Minecraft", 99.90, 5, "Aventura"));
        loja.adicionarJogoAoEstoque(new Jogo("The Sims 4", 199.90, 3, "Simulação"));

        // Cria listas de desejos
        loja.criarListaDesejos("Ana");
        loja.criarListaDesejos("Bruno");

        // Tenta adicionar jogos às listas
        loja.adicionarJogoNaLista("Ana", "Minecraft");
        loja.adicionarJogoNaLista("Bruno", "The Sims 4");
        loja.adicionarJogoNaLista("Ana", "The Sims 4");

        // Realiza algumas compras
        loja.comprarJogo("Minecraft");
        loja.comprarJogo("Minecraft");
        loja.comprarJogo("The Sims 4");

        // Exibe o estado atual
        loja.exibirEstoque();
        loja.exibirListasDesejos();
    }
}