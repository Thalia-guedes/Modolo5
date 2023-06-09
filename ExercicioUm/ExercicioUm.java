package ExercicioUm;

public class ExercicioUm {
    public static void main(String[] args) {
        System.out.println("Inicio do peograma ");
        try {
            metodo1();

        }catch (IndexOutOfBoundsException e){

        }

    }
    static void metodo1(){
        System.out.println(" metodo 1");
        metodo2();
    }
    static void metodo2 (){
        System.out.println("Inicio do metodo 2");
        int [] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            try {
                array[i] = i;
                System.out.println(i);
        }catch (IndexOutOfBoundsException exception){
                throw new IndexOutOfBoundsException();
            }
        }
        System.out.println(" Fim do programa");
    }
}
