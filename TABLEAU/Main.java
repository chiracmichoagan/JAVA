// import de l'interface List;

import java.util.ArrayList; // import the ArrayList class
import java.util.List; // import the ArrayList class

public class Main {
//  declaration de tableau 
// Assignation de valeur à un tableau 
// Initialisation, d'un tableau 
// Parcours de tableau 

public static void main(String[] args){  

 
//  String[]car = {"toyota","citoen","bugati","audi"} ;   // Declaration de la variable car;  
// car = new String[] {"toyota", "citroen", "bugatti", "audi"};
// String[] car = new String[4];
//         car[0] = "toyota";
//         car[1] = "citroen";
//         car[2] = "bugatti";
//         car[3] = "bugatti1";



// // for each
// for (String string : car) {
//     System.out.println(string);
// }
// //for
//    for (int i = 0; i < car.length; i++) {
//        System.out.println(car[i]);
//    }
// // affichage litteral
//  System.out.println(Arrays.toString(car));


//  String [] code ; // DECLARATION DE LA VARIABLE CODE 
//  char [] alphabet = char[]; //DECLARATION DE LA VARIABLE ALPHABET
  
  String[] fruits = new String[5]; // Declaration et definition de la taille 
        fruits[0] = "pomme";
        fruits[1] = "citron";
        fruits[2] = "avocat";
        fruits[3] = "banane";
for (int i = 0; i < fruits.length; i++) {
       System.out.println("L'element à l'index " + i + " " + fruits[i]);
   }

// for each
for (String string : fruits) {
    System.out.println(string);
}

  int[] number1 = {
    15,
    40,
    58,
    20
  }; // Initialisation d'un tableau de nombre 


  byte [] myByteNumber = {14,115,14};

  System.out.println(myByteNumber);

  myByteNumber[0] = 20;

System.out.println(myByteNumber[0]);


    ArrayList<number> nombre = new ArrayList<number>();
    int [] nombre =[5, 2, 9, 1, 5, 6];
    Arrays.sort(nombre);
    System.out.println(nombre);
    for (int i = 0; i < nombre.length; i++) {
       System.out.println("L'element à l'index " + i + " " + nombre[i]);
   }


   int [] tab = [1, 2, 3, 4, 5, 6];
   
   for (Arrays array : tab) {

    if(array % 2 == 0) {

    System.out.println(array);
    };
}

  }

  
  }
  