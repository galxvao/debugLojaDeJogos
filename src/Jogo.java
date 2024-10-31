public class Jogo {
    private String titulo;
    private double preco;
    private int copias;
    private String genero;

    public Jogo(String titulo, double preco, int copias, String genero) {
        this.titulo = titulo;
        this.preco = preco;
        this.copias = copias;
        this.genero = genero;
    }

    // Getters e Setters básicos
    public String getTitulo() { return titulo; }
    public double getPreco() { return preco; }
    public int getCopias() { return copias; }
    public String getGenero() { return genero; }
    public void setCopias(int copias) { this.copias = copias; }

    @Override
    public String toString() {
        return titulo + " - R$" + preco + " (" + copias + " cópias disponíveis)";
    }
}
