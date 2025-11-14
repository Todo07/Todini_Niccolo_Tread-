
public class AssemblaggioLama extends Thread{

    private String nomeFase;
    private int durata;

    public AssemblaggioLama(String nomeFase, int durata){
        this.nomeFase = nomeFase;
        this.durata = durata;
    }

    @Override
    public void run(){
        System.out.println("inizio" + nomeFase);
        try{
            Thread.sleep(durata);
        }catch (InterruptedException e) {}
        System.out.println("fine" + nomeFase);
    }

}
