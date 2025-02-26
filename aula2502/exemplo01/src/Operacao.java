/**
 * @author Maromo
 * @since 2025 feb
 * @version 0.1 Beta
 * Classe Operacao com método somar sobrecarregado
 */
public class Operacao {
    public int valor1; //atributo valor1
    public int valor2;

    /**
     * Método somar(int n1, int n2)
     * @param n1 - Primeiro valor passado na função
     * @param n2 - Segundo valor passado na função
     * @return - Resultado, soma dos dois valores.
     */
    public int somar(int n1, int n2){
        return n1 + n2;
    }

    /**
     * Método somar que usa os atributos do objetos
     *
     * @return A soma dos dois atributos
     */
    public int somar(){
        return valor1 + valor2;
    }

    /*
        mais do que
        uma linha
     */
}
