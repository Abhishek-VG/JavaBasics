class Switch {
    public static void main(String[] args) {
        String stateName = "Delhi";
        getCapitalCity(stateName);
    }

    public static void getCapitalCity(String stateName) {
        switch(stateName) {
            case "Karnataka": System.out.println("Capital is Bangalore");
            break;
            case "TamilNadu": System.out.println("Capital is Chennai");
            case "Delhi": System.out.println("Capital is Delhi");
            break;
            case "Kerala": System.out.println("Capital is Tiruvanantapuram");
            break;
            default: System.out.println("No idea");
        }
    }
}

// age < 18 u cant vote
// u can vote
// switch(only one argumnet) -> case default
