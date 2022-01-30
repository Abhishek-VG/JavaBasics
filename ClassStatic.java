class ClassStatic {
    public static void main(String[] hello) {
         test();
         int x=10;
         
         age(x);
         String y = "Body";
         name(y);

         age(21);
         name("mahesh");

         int m = money("asdasd");
         System.out.println(m);
    }

    public static void test() {
        System.out.println("TESTING...");
    }

    public static void age(int age) {
        System.out.println("Age is "+ age);
    }

    public static void name(String name) {
        System.out.println("My name is "+ name);
    }

    public static int money(String name) {
        System.out.println("Hi, i am returning money");
        return 100;
    }
}
