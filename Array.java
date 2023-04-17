/**
 * 
 */

/**
 * @author MEDAC
 *
 */


	/**
	 * @param args
	 */
	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;
	 
	public abstract class Array {
	     
	    static int numeros[];
	    static int numElementos;
	     
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce la dimension del array: ");
	        int dim = sc.nextInt();
	        sc.close();
	        numeros = new int[dim];
	        numElementos = numeros.length;
	        inicializar();
	        visualizar();
	        Arrays.sort(numeros);
	        visualizar();
	        System.out.printf("%n%nLa media es %.2f y la mediana es %.2f.", 
	                calcularMedia(), 
	                calcularMediana());
	    }
	     
	    private static double calcularMediana(){
	        double mediana;
	        if(numElementos % 2 == 0){
	            int sumaMedios = numeros[numElementos/2] + numeros[numElementos/2 - 1]; 
	            mediana = (double)sumaMedios / 2; 
	        } else {
	            mediana = numeros[numElementos/2];
	        }
	        return mediana;
	    }
	     
	    private static double calcularMedia(){
	        int cont = 0;
	        for (int num : numeros) {
	            cont += num;
	        }
	        return (double)cont/numElementos;
	    }
	     
	    private static void visualizar() {
	        System.out.println();
	        for (int i=0; i<numElementos; i++) {
	            System.out.print(numeros[i] + " ");
	        }
	    }
	     
	    private static void inicializar() {
	        Random r = new Random();
	        for (int i = 0; i < numElementos; i++) {
	            numeros[i] = r.nextInt(100) + 1;
	        }
	    }
	}