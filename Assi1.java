import java.util.Random;
import java.util.Arrays;
import java.util.*;
public class Assi1 {
    
    public static int[] InsertionSort(int[] array, int n){
        for(int i=0;i<n;i++){
          int value = array[i];
           int hole = i;
           
           while(hole>0 && array[hole-1] > value){
               array[hole] = array[hole-1];
               hole =hole -1;
               array[hole]=value;
           }
          
        }
           return array;
        }
    
    

void RandomGen(int arr[]){
    
    for(int i=0;i<10;i++){
      int randomInteger = (int)(100.0*Math.random());
      arr[i]=randomInteger;
      
      
    }
}    
void merge(int arr[], int l, int m, int r) 
    { 

        int n1 = m - l + 1; 
        int n2 = r - m; 
  
     
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
       
  
        
        int i = 0, j = 0; 
  
        
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }

    void MergeSort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            
            int m = (l+r)/2; 
  
            
            MergeSort(arr, l, m); 
            MergeSort(arr , m+1, r); 
  
            
            merge(arr, l, m, r); 
        } 
    } 

    
    public static void main(String[] args){
        
        
        
        int n= 5;
        
        int[] randarr = new int[10];
        
        
        
        
        
        
        
        Assi1 rand = new Assi1();
        rand.RandomGen(randarr);
        System.out.println("Random Array:");
        System.out.println(Arrays.toString(randarr));
        
        int[] array1 = {0,0,0,0,0};
        int[] array2 = {0,0,0,0,0};
        
        for(int i=0;i<5;i++){
            array1[i]=randarr[i];
        }
        
        for(int j=0;j<5;j++){
            array2[j]=randarr[j+5];
        }
        
        long startt1 = System.nanoTime();
        int[] isort=InsertionSort(array1,n);
        long endt1 = System.nanoTime();
        System.out.println("Inserion Sort:");
        System.out.println(Arrays.toString(isort));
        System.out.println("Time Taken:");
        System.out.println(endt1-startt1);
        
        
        long startt = System.nanoTime();
        Assi1 ob = new Assi1(); 
        ob.MergeSort(array2, 0, array2.length-1);
        long endt = System.nanoTime();
        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(array2));
        System.out.println("Time Taken:");
        System.out.println(endt-startt);
        
        
        
        
       
        
        
        
        
        
        
        System.out.println("Time Taken:");
        System.out.println(endt-startt);
        
        
    }
}
