import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventManager {
    private String nome;
    public Set<Client> clients = new HashSet<Client>();
    public List<Event> events = new ArrayList<Event>();

    public EventManager(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addEvent(Client client, LocalDate date) {
        events.add(client, date);
    }

    public void getEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public void listClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public void listEvents(){
        for (Client client : clients) {
            System.out.println(client.getEvents());
        }
    }

   

}
