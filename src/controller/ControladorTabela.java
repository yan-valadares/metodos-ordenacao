package controller;

import java.util.ArrayList;
import model.BubbleSort;
import model.BucketSort;
import model.CocktailSort;
import model.HeapSort;
import utils.ExecutadorMetodo;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;
import model.RadixSort;
import model.SelectionSort;
import model.ShellSort;
import utils.GeradorVetor;
import model.dto.InformacoesResultadoDto;

public class ControladorTabela {
    
    private Integer[] elementos;
    
    private InsertionSort insertionsort;
    private SelectionSort selectionsort;
    private MergeSort mergesort;
    private QuickSort quicksort;
    private BubbleSort bubbleSort;
    private CocktailSort cocktailSort;
    private BucketSort bucketSort;
    private RadixSort radixSort;
    private HeapSort heapSort;
    private ShellSort shellSort;
    
    private ArrayList<InformacoesResultadoDto> resultados;
    private ExecutadorMetodo executadorMetodo = new ExecutadorMetodo();
    
    
    public ControladorTabela(String cenario, Integer quantidadeElementos) {
        switch (cenario) {
            case "crescente" -> elementos = GeradorVetor.vetorCrescente(quantidadeElementos);
            case "decrescente" -> elementos = GeradorVetor.vetorDecrescente(quantidadeElementos);
            case "aleatorio" -> elementos = GeradorVetor.aleatorizaNumeros(quantidadeElementos);
            default -> throw new IllegalArgumentException();
        }
        
        inicializarAlgoritmos();
        resultados = new ArrayList<InformacoesResultadoDto>();
    }
    
    private void inicializarAlgoritmos(){
        insertionsort = new InsertionSort(elementos);
        selectionsort = new SelectionSort(elementos);
        mergesort = new MergeSort(elementos);
        quicksort = new QuickSort(elementos);
        bubbleSort = new BubbleSort(elementos);
        cocktailSort = new CocktailSort(elementos);
        bucketSort = new BucketSort(elementos);
        radixSort = new RadixSort(elementos);
        heapSort = new HeapSort(elementos);
        shellSort = new ShellSort(elementos);
    }
    
    public ArrayList<InformacoesResultadoDto> realizarOperacoes(){
       
        resultados.add(executadorMetodo.executadorMetodo(bubbleSort));
        resultados.add(executadorMetodo.executadorMetodo(bucketSort));
        resultados.add(executadorMetodo.executadorMetodo(cocktailSort));
        resultados.add(executadorMetodo.executadorMetodo(heapSort));
        resultados.add(executadorMetodo.executadorMetodo(insertionsort));
        resultados.add(executadorMetodo.executadorMetodo(mergesort));
        resultados.add(executadorMetodo.executadorMetodo(quicksort));    
        resultados.add(executadorMetodo.executadorMetodo(radixSort));
        resultados.add(executadorMetodo.executadorMetodo(selectionsort));
        resultados.add(executadorMetodo.executadorMetodo(shellSort));

       
        return resultados;
    }

}
