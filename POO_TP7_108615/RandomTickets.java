package POO_TP7_108615;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RandomTickets {
    String Persons;
    String AvailableTickets;
    
    public void getRandomTicket(POO_TP7_108615.Pessoa pessoa) {
		try(Scanner file = new Scanner(new File("src/exercicio/Lista_Festivais.txt"))){
			file.nextLine();    // ignora a primeira linha
			System.out.println("\n\nLEITURA DO FICHEIRO\n");
			while(file.hasNext()) {
				String[] data = file.nextLine().split("\t");	//Data in�cio	Data fim	Nome	Local	N� bilhetes
				System.out.println(Arrays.toString(data));
				tickets.add(new tickets(data[0], data[1], Double.parseDouble( data[2], data[3], data[4])));
			}
			file.close();
		}catch(IOException e) {
			System.err.println("Erro: "+e);
		}

        List<tickets> ticketList = new ArrayList<>();
		ticketList.addAll(tickets);
		System.out.println("\n\nLISTA DE BILHETES\n");
		ticketList.forEach(m -> System.out.println(m));
    }
   

    public String listPersons() {
        return Persons;
    }

    public String listAvailableTickets() {
        return AvailableTickets;
    }
	
    
}
