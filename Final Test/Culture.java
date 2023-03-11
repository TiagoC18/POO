public class Culture extends Activity {
    public int participants;
    public final int preco = 25;
    private Culture.Option option;
    public enum Option{
        ARCHITECTURAL_TOUR, RIVER_TOUR, WINE_TASTING
    }

    public Culture(Option option, int participants){
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
        return "Culture: " + participants + " - " + option;
    }
}

