import java.util.Scanner;

public class MenuDeMarcasDeTenis {
    public static void main(String[] args){

        try (Scanner input = new Scanner(System.in)){
        int opcion;



        do{
            System.out.println("Escoje tu marca de tenis favorita");
            System.out.println("1. Nike");
            System.out.println("2. Adidas");
            System.out.println("3. Pirma");
            System.out.println("4. Reebok");
            System.out.println("5. Puma");
            System.out.println("6. Vans");
            System.out.println("7. Converse");
            System.out.println("8. Fila");
            System.out.println("9. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Tu marca favorita es: Nike");
                    break;
                case 2:
                    System.out.println("Tu marca favorita es: Adidas");
                    break;
                case 3:
                    System.out.println("Tu marca favorita es Pirma");
                    break;
                case 4:
                    System.out.println("Tu marca favorita es: Reebok");
                    break;
                case 5:
                    System.out.println("Tu marca favorita es: Puma");
                    break;
                case 6:
                    System.out.println("Tu marca favorita es: Vans");
                    break;
                case 7:
                    System.out.println("Tu marca favorita es: Converse");
                    break;
                case 8:
                    System.out.println("Tu marca favorita es: Fila");
                    break;
                case 9:
                    System.out.println("Adios");
                    break;

            }

           
        }
        while(opcion !=9);
        
    }
    }
}
