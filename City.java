class City {
    static Bank karnatakaBank = new Bank();
    static Theater sanjaya = new Theater();
    static Bar kuduka = new Bar();

    public static void main(String[] hello) {
        int bal = karnatakaBank.getBalance();
        System.out.println(bal);

        String movie = sanjaya.getMovie();
        System.out.println(movie);

        String hotDrinks = kuduka.getHotdrinks();
        System.out.println(hotDrinks);
    }
}


class Theater {
    public static String movie = "JACKIE";

    public static String getMovie() {
        return movie;
    }
}

class Bar {
    public static String drinks = "Kingfisher";

    public static String getHotdrinks() {
        return drinks;
    }
}

class Bank {
    public static int balance = 1000;

    public static int getBalance() {
        return balance;
    }
}



