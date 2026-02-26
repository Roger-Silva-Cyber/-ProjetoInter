import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao;
        int id = 0;
        int idt = 0;

        Scanner sc = new Scanner(System.in);
        Bebidas b = new Bebidas();
        Cliente c = new Cliente();
        Funcionario f = new Funcionario("46978403265", 29, "Cleiton dos Santos", "Atendente", "7985");
        Funcionario f1 = new Funcionario("46978413602", 25, "João Medeiros", "Entregador", "9785");

        while (true) {
            String entrada = JOptionPane.showInputDialog(null, "Menu Principal"
                    + "\n1- Cadastrar Bebida"
                    + "\n2- Consultar Estoque"
                    + "\n3- Cadastrar Cliente"
                    + "\n4- Consultar cliente"
                    + "\n5- Funcionários"
                    + "\n6- Sair"
                    + "\nDigite uma opção: ");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Até mais!");
                break;
            }

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite apenas números válidos no menu.");
                continue;
            }

            if (opcao == 6) {
                JOptionPane.showMessageDialog(null, "Até mais!");
                break;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("Cadastrar Bebida");
                    b.setId(id);
                    System.out.println("Informe o tipo de bebida:");
                    b.setProduto(sc.nextLine());
                    System.out.println("Informe a marca:");
                    b.setMarca(sc.nextLine());
                    System.out.println("Informe o peso(em ML) da bebida:");
                    b.setPeso(sc.nextLine());
                    System.out.println("Informe a quantidade recebida:");
                    b.setQtdEstoque(lerInteiro(sc));
                    System.out.println("Informe o preço:");
                    b.setPreco(lerDouble(sc));
                    id = b.cadastrarBebida();
                }
                case 2 -> {
                    System.out.println("Consultar Bebidas:");
                    b.consultarEstoque();
                }
                case 3 -> {
                    System.out.println("Cadastrar Cliente");
                    c.setIdt(idt);
                    System.out.println("Digite o nome:");
                    c.setNome(sc.nextLine());
                    System.out.println("Informe a idade:");
                    c.setIdade(lerInteiro(sc));
                    System.out.println("Informe o número do CPF");
                    c.setCpf(sc.nextLine());
                    idt = c.cadastrarCliente();
                }
                case 4 -> {
                    System.out.println("Consultar Clientes:");
                    c.consultarPessoa();
                }
                case 5 -> {
                    f.consultarPessoa();
                    f1.consultarPessoa();
                }
                default -> System.out.println("Opção inválida");
            }
        }

        sc.close();
    }

    private static int lerInteiro(Scanner sc) {
        while (true) {
            String valor = sc.nextLine();
            try {
                return Integer.parseInt(valor);
            } catch (NumberFormatException ex) {
                System.out.println("Valor inválido. Digite um número inteiro:");
            }
        }
    }

    private static double lerDouble(Scanner sc) {
        while (true) {
            String valor = sc.nextLine().replace(',', '.');
            try {
                return Double.parseDouble(valor);
            } catch (NumberFormatException ex) {
                System.out.println("Valor inválido. Digite um número decimal:");
            }
        }
    }
}
