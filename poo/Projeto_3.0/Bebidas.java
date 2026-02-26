import javax.swing.JOptionPane;

public class Bebidas {

    private static final int LIMITE_REGISTROS = 100;

    // Atributos da classe
    private String produto;
    private String marca;
    private double preco;
    private int qtdEstoque = 0;
    private String peso;
    private int id;
    private int qtd = 0;

    private final String[] produtoBebida = new String[LIMITE_REGISTROS];
    private final String[] marcaBebida = new String[LIMITE_REGISTROS];
    private final double[] precoBebida = new double[LIMITE_REGISTROS];
    private final int[] qtdEstoqueBebida = new int[LIMITE_REGISTROS];
    private final String[] pesoBebida = new String[LIMITE_REGISTROS];

    // Métodos construtores
    public Bebidas() {
    }

    public Bebidas(int id, String marca, String peso, double preco, String produto, int qtdEstoque) {
        this.id = id;
        this.marca = marca;
        this.peso = peso;
        this.preco = preco;
        this.produto = produto;
        this.qtdEstoque = qtdEstoque;
    }

    // Métodos de acesso
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método para cadastro das bebidas
    public int cadastrarBebida() {
        int i = this.id;

        if (i < 0 || i >= LIMITE_REGISTROS) {
            JOptionPane.showMessageDialog(null, "Limite de bebidas cadastradas atingido.");
            return qtd;
        }

        produtoBebida[i] = produto;
        marcaBebida[i] = marca;
        precoBebida[i] = preco;
        qtdEstoqueBebida[i] = qtdEstoque;
        pesoBebida[i] = peso;
        qtd++;
        JOptionPane.showMessageDialog(null, "Bebida cadastrada com sucesso!");
        return qtd;
    }

    public void relatorio(int i) {
        System.out.println(
                produtoBebida[i] + "\t\t" + marcaBebida[i] + "\t" + pesoBebida[i] + "\t" + precoBebida[i] + "\t\t"
                        + qtdEstoqueBebida[i]);
    }

    // Método para consulta de estoque
    public void consultarEstoque() {
        System.out.println("\n\n \t\tBebidas disponíveis\n\n");
        System.out.println("Produto\t\tMarca\t\tPeso\tPreço\t\tQuantidade em estoque");
        for (int i = 0; i < qtd; i++) {
            relatorio(i);
        }
    }
}
