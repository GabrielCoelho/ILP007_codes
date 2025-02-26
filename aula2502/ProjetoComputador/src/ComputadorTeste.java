public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "hp";
        computador1.modelo = "Novo";
        computador1.preco = 5000;
        computador1.cor = "Azul";
        computador1.numeroSerie = 1231235;
        computador1.imprimir();

        computador1.calcularValor();

        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Computador";
        computador2.preco = 10000;
        computador2.cor = "Verde";
        computador2.numeroSerie = 1231237;
        computador2.imprimir();

        computador2.calcularValor();

        computador2.imprimir();

        boolean resultado = computador2.alterarValor(3000);
        if (resultado) {
            System.out.println("Preco alterado com sucesso!");
        }else{
            System.out.println("Preco nao alterado!");
        }

        computador2.imprimir();
    }
}
