
package model;

public class ShellSort extends ModeloMetodo{
    
    private Integer[] numeros;
    
    public ShellSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        return shellSort(numeros);
    }
    
    public Integer shellSort(Integer numeros[]) {
        int tamanho = numeros.length;
        int trocas = 0; // Variável para contar as trocas
        
        // Começa com um intervalo grande e reduz gradualmente
        for (int intervalo = tamanho / 2; intervalo > 0; intervalo /= 2) {
            // Realiza o insertion sort para os elementos no intervalo
            for (int i = intervalo; i < tamanho; i++) {
                int chave = numeros[i];
                int j = i;
                
                // Move os elementos anteriores que são maiores que a chave
                // para uma posição à frente de sua posição atual
                while (j >= intervalo && numeros[j - intervalo] > chave) {
                    numeros[j] = numeros[j - intervalo];
                    j -= intervalo;
                    trocas++; // Incrementa o contador de trocas
                }
                
                // Coloca a chave na posição correta
                numeros[j] = chave;
            }
        }
        
        return trocas; // Retorna o número total de trocas realizadas
    }
}
