
package boletin17_1;

public class MetodosArray {
    public MetodosArray(){
        
    }
    public static int[] crearArray(){
        int[]numeros=new int[6];
        for(int f=0;f<numeros.length;f++){
            numeros[f]=(int)(Math.random()*50)+1;
        }
        return numeros;
    }
    public static int[] reverse(int[]numeros){
            int i,j;
            int aux;
            for(i=0;i<numeros.length-1;i++)
            for(j=i+1;j<numeros.length;j++)
                if(numeros[i]<numeros[j]){
                    aux=numeros[i];
                            numeros[i]=numeros[j];
                                    numeros[j]=aux;
                }
        return numeros;
}
    public static void amosar(int[]numeros){
        for(int f=0;f<numeros.length/2;f++){
        System.out.println(numeros[f]);
    }
}
}