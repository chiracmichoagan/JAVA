public class Main {
  public static void main(String[] args){ 
    
//   double myNum = 127; 
//    int  myNum1 = (int)myNum;
//    boolean compare = 12 == 15

//  System.out.println(myNum1);
//  System.out.println(myNum);

  //    Exercice


byte   aByte   = 0;
short  aShort  = 0;
int    aInt  = 0;
long   aLong  = 0;
float  aFloat  = 0;
double aDouble  = 0;
char   aChar  = 0;
boolean  aBoolean  = true;
System.out.println("Taille de byte: " + Byte.BYTES + " octets");
System.out.println("Taille de short: " + Short.BYTES + " octets");
System.out.println("Taille de int : " + Integer.BYTES + " octets");
System.out.println("Taille de long : " + Long.BYTES + " octets");
System.out.println("Taille de float : " + Float.BYTES + " octets");
System.out.println("Taille de double: " + Double.BYTES + " octets");
// System.out.println("Taille de boolean: " + boolean.BYTES + " octets");
System.out.println("Taille de char: " + Character.BYTES + " octets");

// EXERcice

//  String str1 = "Hello";
//  String str2 = "word";
//  String str3 = str1 + " " + str2;
//  boolean compare = str1 == str2;
//  boolean compare1 = str1.equals(str2);
//  System.out.println(compare);
//  System.out.println(compare1);
//  System.out.println(str1  + " " + str2);
//  System.out.println(str3);

// int a = 12 ;
// int b = a + 2 ; 
// int c = b * 2; 
// System.out.println(a > b);
// System.out.println(b = a + 2);
// System.out.println(c = b * 2);
// System.out.println( a > b && b < c);
// System.out.println(b > 3 || b < 4);
// System.out.println(!(a > 3 && a < 10));

// widening Casting

        // int intvar  = 150;
        // double mydouble = intvar;
        // System.out.println(intvar);
        // System.out.println(mydouble);


// Narrowing Casting (explicite)
        // short shortvar  = (short)mydouble;
        // System.out.println(mydouble);

//  int x = 20;
//  int y = 18;

//  if (x > y) {
//    System.out.println("x is greater than y");
//  }


//  int age = 20;

// switch (day) {
//   case 0 à 12ans:
//     System.out.println("Monday");
//     break;
//   case 13 à 19ans:
//     System.out.println("Tuesday");
//     break;
//   case 20 à 64ans:
//     System.out.println("Wednesday");
//     break;
//   case 65 ans et plus:
//     System.out.println("Thursday");
//     break;
//   case 5:
//     System.out.println("Friday");
//     break;
//   case 6:
//     System.out.println("Saturday");
//     break;
//   case 7:
//     System.out.println("Sunday");
//     break;
//     default : 
//     System.out.println("not found");
// }

//   }

// int a = 10;
// String result = (a % 2 == 0)? "is pair" : "is impair";
// System.out.println(result);

//  int myNum = 10;

// if (myNum % 2 == 0) {
//   System.out.println(myNum + " is pair");
// }else if(myNum == 10 ){
//   System.out.println(myNum + " : est le nombre saisi ");
// } else {
//   System.out.println(myNum + " is impair");
// } 

// int nbr1 = 1;
// int nbr2 = 2;
// int nbr3 = 3 ;

// if(nbr3 > nbr1 && nbr3 > nbr2) {
//   System.out.println(nbr3 + "est superieur");
// }else if(nbr2>nbr1) {
//   System.out.println(nbr2 + "est superieur");
// }else{
//    System.out.println("Le plus grand nombre est : " + nbr3);
// }

// int note = 100;
// String result = (note >= 50 )? "Réussi" : "echouer";
// System.out.println(result);


// int age;

// if( 0 =< age &&  12 =< age) {
//   System.out.println("Enfant");
// }else if(age >13 && age<= 19) {
//   System.out.println("Adolescent");
// }else if(age >= 19 &&  age <= 64) {
// System.out.println("Adulte");
// } else if (age > ) {
//    System.out.println("Sénior");
// }else{
//   System.out.println("not found");
// }

// int montant = 500;
// int remise = 0 ;

// if (montant>500) {
// remise = (montant * 20) /100;
// montant = montant - remise;
// System.out.println(montant);
// }else if (montant >=100){
//   remise  = (montant * 10)/100;
//   montant = montant-remise;
//   System.out.println(montant);
// }else {
//   System.out.println(montant);
// }



// Notion de boucles  

// int i = 15;
// byte x = 1; 
// while ( x <= i ) {
//   System.out.println("codeur à " + i + "etoilles");
//   i++;
// }
//   }

// Boucles for 
int x = 20;
   for( int i =0 ; i<x ; i++){
 if (i % 2 == 0 && i < 20 && i > 1 ) {
  System.out.println(i + "est pair");
 }
 }

//Boucles While

int sum = 0;
int i = 0;
int a = 10;
while (i<=a) {
 sum = sum + i ;
  System.out.println(sum);
  i++;
}

// // Do-While
// int nbr = 1234;

// do{
//   // du code
//   System.out.println('4321');
// }while (!nbr)

//   }
  }

  
}
