import java.lang.Thread;
import java.lang.InterruptedException;



class ProduzionePalette{
    public static void main(String[] args){
        System.out.println("inizio produzione delle palette.");

        Thread progettazione = new ProgettazioneManico("Progettazione Manico", 900);
        Thread assemblaggio = new AssemblaggioLama("Assemblaggio Lama", 500);

        progettazione.start();
        assemblaggio.start();

        try{
            progettazione.join();
            assemblaggio.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("fine produzione.");
    }
}