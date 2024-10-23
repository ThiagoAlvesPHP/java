package POO;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thiago Alves");
        System.out.println("Limite inicial de "+cliente.nome+" é: "+cliente.limiteCredito);
        cliente.solicitarLimiteCredito(200.0);
        System.out.println("Limite atual de "+cliente.nome+" é: "+cliente.limiteCredito);
        cliente.comprar(100.0);
        System.out.println("Limite após compra de "+cliente.nome+" é: "+cliente.limiteCredito);

        Cliente cliente2 = new Cliente("Leidy Alves");
        System.out.println("Limite inicial de "+cliente2.nome+" é: "+cliente2.limiteCredito);
        cliente2.solicitarLimiteCredito(80.0);
        System.out.println("Limite atual de "+cliente2.nome+" é: "+cliente2.limiteCredito);
        cliente2.comprar(50.0);
        System.out.println("Limite após compra de "+cliente2.nome+" é: "+cliente2.limiteCredito);
    }
}
