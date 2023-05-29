import javax.swing.*;

public class RestauranteMain {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        String nomeClienteOnline = JOptionPane.showInputDialog("Informe o nome do cliente para o pedido online: ");
        String enderecoCliente = JOptionPane.showInputDialog("Informe o endereço de entrega: ");
        String valorStrOnline = JOptionPane.showInputDialog("Informe o valor do pedido online: ");
        double valorOnline = Double.parseDouble(valorStrOnline);

        PedidoOnline pedido1 = new PedidoOnline("1", nomeClienteOnline, "pedido online", valorOnline, enderecoCliente);

        String nomeClientePresencial = JOptionPane.showInputDialog("Informe o nome do cliente para o pedido presencial: ");
        String localCliente = JOptionPane.showInputDialog("Informe o local do cliente (ex: Mesa 4): ");
        String valorStrPresencial = JOptionPane.showInputDialog("Informe o valor do pedido presencial: ");
        double valorPresencial = Double.parseDouble(valorStrPresencial);

        PedidoPresencial pedido2 = new PedidoPresencial("2", nomeClientePresencial, "pedido presencial", valorPresencial, localCliente);

        restaurante.adicionarPedido(pedido1);
        restaurante.adicionarPedido(pedido2);

        pedido1.fazer();
        pedido2.fazer();

        String novoNomeOnline = JOptionPane.showInputDialog("Informe o novo nome para o cliente do pedido online: ");
        String novoValorStrOnline = JOptionPane.showInputDialog("Informe o novo valor para o pedido online: ");
        double novoValorOnline = Double.parseDouble(novoValorStrOnline);

        pedido1.atualizar(novoNomeOnline, novoValorOnline);

        pedido2.concluir();
        pedido1.registrarPagamento();

        String idPedidoRemover = JOptionPane.showInputDialog("Informe o ID do pedido a ser removido: ");
        restaurante.removerPedido(idPedidoRemover);
    }
}