public  class MachineCalc {
    void plus(int x, int y){
        System.out.println(x+y);
    }
    void minus(int x, int y){
        System.out.println(x/y);
    }
    void multiplication(int x, int y){
        System.out.println(x*y);
    }
    void division(double x, double y){
        if (y == 0){
            System.out.println("Nie można dzielić przez zero");
        }else System.out.println(x/y);

    }

    static void modulo(int x, int y){
        System.out.println(x%y);
    }

    void printInfo(){
        System.out.println("Wybierz jedną z opcji");
        System.out.println("Dodawanie '+'");
        System.out.println("Odejmowanie '-'");
        System.out.println("Mnożenie '*'");
        System.out.println("Dzielenie '/'");
        System.out.println("Modulo '%'");
        System.out.println("Wyjście z programu '1'");
    }


}