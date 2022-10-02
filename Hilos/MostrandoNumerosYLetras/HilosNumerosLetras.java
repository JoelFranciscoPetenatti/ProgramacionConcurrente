package Hilos.MostrandoNumerosYLetras;

public class HilosNumerosLetras implements Runnable {

    private int tipo;

    public HilosNumerosLetras(int tipo) {
        this.tipo = tipo;
    }

    public void run() {

        while (true) {
            switch (tipo) {
                case 1:
                    for (int i = 1; i < 30; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (char c = 'a'; c < 'z'; c++) {
                        System.out.println(c);
                    }
                    break;
            }
        }
    }


}
