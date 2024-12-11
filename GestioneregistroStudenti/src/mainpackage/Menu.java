package mainpackage;
import java.util.*;
public class Menu extends Studente {
	//le 2 righe di sotto permettono di prendere le variabili dalla classe padre(Studente)
	Menu(String nome, String cognome, int codmatricola) {
		super(nome, cognome, codmatricola);
		
		
	}
	public static void main(String[] args) {
		 ArrayList<Studente> listastudenti = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		String nome;
		String cognome;
		int CodMatricola;
		String risposta;
		System.out.println("Benvenuto nel registro elettronico,ecco come possiamo esserti utili:");
		System.out.println("Inserisci 1 per Aggiungere uno studente nel registro.");
		System.out.println("Inserisci 2 per visualizzare uno studente del registro.");
		System.out.println("Inserisci 3 per cercare una matricola nel registro.");
		System.out.println("Inserisci 4  per uscire dal programma.");
		int scelta=scanner.nextInt();
        //utilizzo un ciclo per permetterli di svolgere ulteriori azioni
        do {
        	//menù con la scelta delle opzioni
        	switch(scelta) {
        	//scelta 1 permette di aggiungere un nuovo studente, ho inserito anche un ciclo per permettergli di inserire più utenti
        	case 1:
        		
        		
        		Studente.Agg(listastudenti);
        		do {
        			System.out.println("Inserisci il nome: ");
        			 listastudenti.add(nome=scanner.nextLine());
        			 System.out.println("Inserisci il cognome: ");
        			 listastudenti.add(CodMatricola=scanner.nextInt()); 
        			System.out.println("Inserisci il cognome: ");
        			 listastudenti.add(cognome=scanner.nextLine(););
        			 
        			System.out.println("Vuoi inserire altri studenti? ");
        			  risposta=scanner.nextLine();
        		}while(risposta.equalsIgnoreCase("si"));
        		
        		break;
        		//scelta 2 permette di aggiungere un nuovo studente, ho inserito anche un ciclo per permettergli di inserire più utenti
            case 2:
            	System.out.println("Inserisci l codice matricola da cercare:");
            	CodMatricola=scanner.nextInt();
        		Studente.Cerca(listastudenti,CodMatricola);
        		System.out.println(Studenti);
        		break;
        		//scelta 3 permette di visualizzare la lista
            case 3:
	            Studente.Visualizza();
	            break;
	           //utilizzato per uscire dal menù
	            default:
	            	System.exit(4);
	            	
        	}
        	System.out.println("Inserisci 1 per Aggiungere uno studente nel registro.");
    		System.out.println("Inserisci 2 per visualizzare uno studente del registro.");
    		System.out.println("Inserisci 3 per cercare una matricola nel registro.");
        	System.out.println("Premi qualsiasi altro numero per uscire");
        	scelta=scanner.nextInt();
        }while(scelta>=1 && scelta<=3);
        System.out.println("Arrivederci!");
	}

}
