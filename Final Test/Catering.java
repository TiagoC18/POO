public class Catering extends Activity {
    public int participants;
    public final int preco = 35;
    private Catering.Option option;
    public enum Option{
        FULL_MENU, DRINKS_AND_SNACKS, LIGHT_BITES
    }

    public Catering(Option option, int participants){
        this.participants = participants;
        this.option = option;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Catering: " + participants + " - " + option;
    }

    
}
