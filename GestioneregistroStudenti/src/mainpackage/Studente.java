package mainpackage;
import java.util.*;

public class Studente {
String nome;
String cognome;
int matricola;
Studente(String nome,String cognome,int codmatricola){
	//dichiaro le proprietà
	this.nome=nome;
	this.cognome=cognome;
	this.matricola=codmatricola;
}
      //metodo aggiungi che serve per aggiungere un nuovo studente nell'array che prende un array e che ritornerà la lista nel menù
public static ArrayList<Studente> Agg(ArrayList<Studente>Studenti) {
	
	return Studenti;
}
     //metodo visualizza che ha il solo scopo di visualizzare la lista,non ritorna e non prende nulla
	public static void Visualizza() {
		System.out.println("Ecco la stampa della lista:");
		System.out.println(Studenti);
	}
	//metodo cerca che prende  il codice di matricola per cercare la matricola nell'array e che restituisce la matricola
	public static int Cerca(ArrayList<Studente>Studenti,CodMatricola) {
		for(int i=0;i<Studenti.size();i++) {
			if(Studenti.hashCode(i)==CodMatricola) {
				System.out.println(Studenti);
				
			}
			return Studenti;
		}
		
		
		
	

}



/*Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
*/