class Loop {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++) {
            System.out.println("Hello "+ i);
        }
    }
}
// i = 1 ; true ; HELLO; i = 2
//       ; true ; HELLO; i = 3
//       ; true ; Hello; i = 4
//       ; true ; Hello; i = 5
//       ; true ; Hello; i = 6
//       ; false



// LOOP HAS 3 TYPES
// for * -> initializer; condition; updation
// while
// do while
// i++ => i = i + 1;
// i-- => i = i - 1;
// RUN
// INI (ONE TIME) -> COND CHECK(true) -> BLOCK(STATEMENTS) -> UPDATION -> CON CHECK....
// INI -> COND CHECK(false)
