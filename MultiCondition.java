class MultiCondition {
    public static void main(String[] args) {
    int age=61;

    if(age < 14) {
        System.out.println("you cannot work");
    } else if(age <= 60){
        System.out.println("You can work");
    } else {
        System.out.println("you should retire");
    }
    }
}