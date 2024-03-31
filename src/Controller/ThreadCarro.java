package Controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {


    Semaphore semaforo;
    int idCarro;
    String sentido;
    public ThreadCarro(int idCarro, Semaphore semaforo) {
        this.idCarro = idCarro;
        this.semaforo = semaforo;
    }


    @Override
    public void run() {

        try {
            semaforo.acquire();
            carroCruzamento();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaforo.release();
        }


    }

    private void carroCruzamento() {

        int idSentido = (int) (Math.random() * 4);

        if (idSentido == 0){
            sentido = "Direita";
            System.out.println("O carro #" + idCarro + " está atrevessando para " + sentido);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("O carro #" + idCarro + " está atrevessou");

        } else if (idSentido == 1){
            sentido = "Esquerda";
            System.out.println("O carro #" + idCarro + " está atrevssando para " + sentido);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("O carro #" + idCarro + " está atrevessou");
        } else if (idSentido == 2){
            sentido = "Baixo";
            System.out.println("O carro #" + idCarro + " está atrevssando para " + sentido);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("O carro #" + idCarro + " está atrevessou");
        } else {
            sentido = "Cima";
            System.out.println("O carro #" + idCarro + " está atrevssando para " + sentido);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("O carro #" + idCarro + " está atrevessou");
        }





    }
}
