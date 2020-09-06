package concurrency;

import java.util.concurrent.*;

/**
 * Thread is a low level API.
 * Runnable is very limited. It does not return anything.
 *
 * ExecutorService for different needs
 * ForkJoinPook: uses work stealing
 * ScheduledThreadPoolExecutor: runs task periodically or after a delay
 * ThreadPoolExecutor: pooled threads, can be configured
 */

public class PriceCatalogueThread {

    /*private final Catalogue catalogue = new Catalogue();
    private final PriceFinder priceFinder = new PriceFinder();
    private final ExchangeService exchangeService = new ExchangeService();*/

    public static void main(String[] args) throws InterruptedException {
        new PriceCatalogueThread().findLocalDiscountedPrice(Currency.CHF, "Nexus7");
    }

    private void findLocalDiscountedPrice(Currency currency, String product) throws InterruptedException {
        long time1 = System.currentTimeMillis();
        runSequentially(currency);
        long time2 = System.currentTimeMillis();
        System.out.println("Time sequentially it took -> " + (time2 - time1));
        System.out.println("************************");
        long time3 = System.currentTimeMillis();
        runUsingThreads(product);
        long time4 = System.currentTimeMillis();
        System.out.println("Time parallely it took using Thread-> " + (time4 - time3));
        System.out.println("***********************");
        runUsingExecutorServices();
    }

    private void runUsingExecutorServices() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Double> exchangeRate = executorService.submit(() -> lookupExchangeRate(Currency.USD, Currency.CHF));
    }

    private void runSequentially(Currency currency) throws InterruptedException {
        String outputProduct = searchProduct();
        double exchangeRate = lookupExchangeRate(Currency.USD, currency);
    }

    private void runUsingThreads(String product) throws InterruptedException {
        Runnable productRunner = new ProductRunner(product);
        Runnable exchangeRunner = new ExchangeRunner(Currency.CHF);
        Thread thread1 = new Thread(productRunner);
        Thread thread2 = new Thread(exchangeRunner);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    private double lookupExchangeRate(Currency currency, Currency localCurrency) throws InterruptedException {
        Thread.sleep(1500);
        return 73.50d;
    }

    private String searchProduct() throws InterruptedException {
        Thread.sleep(2000);
        return "Nexux 7";
    }


    private class ProductRunner implements Runnable {
        private String product;

        public ProductRunner(String product) {
            this.product = product;
        }

        public String getProduct() {
            return product;
        }

        @Override
        public void run() {
            try {
               this.product =  searchProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class ExchangeRunner implements Runnable {
        private Currency localCurrency;
        private double exchangeRate;

        public ExchangeRunner(Currency localCurrency) {
            this.localCurrency = localCurrency;
        }

        @Override
        public void run() {
            try {
                exchangeRate = lookupExchangeRate(Currency.USD, localCurrency);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
