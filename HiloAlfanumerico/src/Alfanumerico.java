import java.util.concurrent.TimeUnit;

public class Alfanumerico implements Runnable {

    private Tipo tipo;

    public Alfanumerico(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        //Segun el tipo hace una u otra cosa
        try {
            switch (tipo) {
                case NUMERO -> {
                    for (int i = 1; i < 10; i++) {
                        System.out.println(i);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                case LETRA -> {
                    for (char c = 'A'; c <= 'Z'; c++) {

                        System.out.println(c);
                        TimeUnit.SECONDS.sleep(1);

                    }
                }
            }
        } catch (InterruptedException ex) {
        }
    }
}