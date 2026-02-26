import javax.swing.JOptionPane;

public class Cliente extends Pessoa {

    private static final int LIMITE_CLIENTES = 100;

    // Atributos da classe
    private int idt = 0;
    private int qtdClientes = 0;

    private String[] nomeCliente = new String[LIMITE_CLIENTES];
    private int[] idadeCliente = new int[LIMITE_CLIENTES];
    private String[] cpfCliente = new String[LIMITE_CLIENTES];

    // Métodos construtores
    public Cliente() {
    }

    public Cliente(String cpf, int idade, String nome) {
        super(cpf, idade, nome);
    }

    public Cliente(String[] nomeCliente, int[] idadeCliente, String[] cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.cpfCliente = cpfCliente;
    }

    // Métodos de acesso
    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public int getQtdClientes() {
        return qtdClientes;
    }

    public void setQtdClientes(int qtdClientes) {
        this.qtdClientes = qtdClientes;
    }

    public String[] getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String[] nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int[] getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int[] idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String[] getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String[] cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    // Método para cadastrar clientes
    public int cadastrarCliente() {
        int i = this.idt;

        if (i < 0 || i >= LIMITE_CLIENTES) {
            JOptionPane.showMessageDialog(null, "Limite de clientes cadastrados atingido.");
            return qtdClientes;
        }

        nomeCliente[i] = super.getNome();
        idadeCliente[i] = super.getIdade();
        cpfCliente[i] = super.getCpf();
        qtdClientes++;
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        return qtdClientes;
    }

    public void relatorioDeClientes(int i) {
        System.out.println(nomeCliente[i] + "\t" + idadeCliente[i] + "\t" + cpfCliente[i]);
    }

    // Método para consultar clientes
    public void consultarPessoa() {
        System.out.println("\n\n \t\tClientes Cadastrados\n\n");
        System.out.println("Nome\tIdade\tCPF");
        for (int i = 0; i < qtdClientes; i++) {
            relatorioDeClientes(i);
        }
    }
}
