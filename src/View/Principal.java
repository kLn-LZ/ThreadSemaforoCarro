package View;

import Controller.ThreadCarro;

import java.util.concurrent.Semaphore;

public class Principal {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);

        for(int i = 0; i < 4; i++) {

            Thread tCarro = new ThreadCarro(i, semaforo);
            tCarro.start();

        }

    }
}
