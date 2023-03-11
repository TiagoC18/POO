public class Sport extends Activity {
    public int participants;
    public final int preco = 30;
    private Sport.Modality modality;
    public enum Modality{
        KAYAK, BIKE
    }

    public Sport(Modality modality, int participants){
        this.participants = participants;
        this.modality = modality;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Sport: " + participants + " - " + modality;
    }

    

}
