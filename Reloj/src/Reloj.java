import java.util.Calendar;


public class Reloj extends Thread {

    @Override
    public void run (){
        while (true){
            try {
            Calendar calendario = Calendar.getInstance();
            int hora = calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);

            String reloj_digital = String.format("%02d:%02d:%02d", hora, minutos, segundos);
            System.out.println(reloj_digital);
           
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                System.out.println("NO SE OBTUVO LA HORA");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Reloj reloj= new Reloj();
        reloj.start();
    }
}
