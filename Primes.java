public class Primes {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        final int n = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[n + 1];

        // אתחול המערך - נניח שכולם ראשוניים
        int i = 2;
        while (i <= n) {
            prime[i] = true;
            i++;
        }

        // אלגוריתם הנפה
        int p = 2;
        while (p * p <= n) {
            if (prime[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    prime[multiple] = false;
                    multiple = multiple + p;
                }
            } 
            p++; 
        } 

        System.out.println("Prime numbers up to " + n + ":");
        int primeCount = 0;
        int k = 2;
        while (k <= n) {
            if (prime[k]) {
                System.out.println(k);
                primeCount++;
            }
            k++;
        }
        
        double percentage = ((double) primeCount / n) * 100;
        System.out.println("There are " + primeCount + " primes between 2 and " + n +
                " (" + (int)percentage + "% are primes)");
    }
}