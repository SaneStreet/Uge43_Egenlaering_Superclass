/*
-Hvad er en superclass i Java? Eksempel i kode og i UML. (I superclass deklarer man bare methoder man giver dem ikke værdi)
-Hvad er en subclass? Eksempel i kode og i UML.
En superclass er hvor man skriver metoder, og så kan subclasses, "hente"(public) metoder. Ved at skrive.
public class SubClass extends SuperClass(){
	(Herinde kan man så bruge metoder skrevet i SuperClass)
}


-Hvordan kan vi kalde superklassens constructor? Eksempel i kode.
-Vis et eksempel på constructor chaining i din kode.
-Hvordan kan vi kalde superklassens metoder? Eksempel i kode.

public class SuperClass(){
	String objectMes = "Example";
	public void getMessage(){ sout("This is my Superclass Message: "+objectMes)}
}
public class SubClass() extends SuperClass{
	public void getMessage(){ sout("This is my sub class message: "+objectMes)}
}

psvm{
Superclass spc = new Superclass();
Subclass sbc = new Subclass();
spc.getMessage(); // Printer This is my Superclass Message: Example.
sbc.getMessage(); // Printer This is my Subclass Message: Example.
//Så den henter objectMes/Example fra superclass, men kan "printe sit eget".
}


-Hvad er forskellen mellem overriding methods og overloading methods i Java? Eksempel i kode.
En Overload er når man har flere metoder af samme navn. Dog kan de have forskellige args.
eks.:
public class plus(int a, int b){return a+b;} // Her + den kun 2 tal sammen, og kan ikke mere end det.
public class plus(int a, int b, int c){return a+b+c;} // Her + den 3 tal sammen.
//Man kan så fortsætte videre her.

Et Override  er når man ved super+sub classes "override" en methode.
class Animal {
   public void move() {System.out.println("Animals can move");}
}

class Dog extends Animal {
   public void move() { System.out.println("Dogs can walk and run");}
}

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class (Printer: Animals can move)
      b.move();   // runs the method in Dog class(Printer: dogs can walk and run)
   }


-Hvad er toString() metoden i Java? Eksempel i kode.
En toString() kan ændre et object ala.:    Student s1=new Student(101,"Raj","lucknow");
Omtil en string der printer:  "101 Raj lucknow", istedet for "Student@1fee6fc".
Det bliver gjort ved simpel metode ala.:
public String toString() {
	return rollno+" "+name+" "+city;
}
 */
public class Main {

}
