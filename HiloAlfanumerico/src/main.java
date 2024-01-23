public class main {
    public static void main(String[] args) {

        Alfanumerico h1 = new Alfanumerico(Tipo.LETRA);
        Alfanumerico h2 = new Alfanumerico(Tipo.NUMERO);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
    }
}
