
package io.sim;

/**
 *
 * @author vinicius
 */
public class FuelStationPaymentBot extends Thread {
    private int paymentAmount;

    public FuelStationPaymentBot(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void run() {
        try {
            Thread.sleep(2000); // Aguarda 2 segundos antes de fazer o pagamento
            System.out.println("Pagamento de R$" + paymentAmount / 100.0 + " feito à Fuel Station.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

