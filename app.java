public class app {
    public static void main(String[] args) {
        /* IF */
        int numeroIf = 5;
        if(numeroIf >= 0)
            System.out.println("Numero positivo");
        else
            System.out.println("Numero negativo");
        /* WHILE */
        int numeroWhile = 1;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        /* DO WHILE */
        int contandor = 0;
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
            contador++;
        }while(contador<1);
        /* FOR */
        for(numeroFor == 0; numeroFor <= 3; numeroFor++)
            System.out.println(numeroFor);
        /* SWITCH */
        var estacion = "Verano";
        switch(estacion){
            case "Primavera": System.out.println("Es primavera");
            break;
            case "Verano": System.out.println("Es verano");
            break;
            case "Otoño": System.out.println("Es otoño");
            break;
            case "Invierno": System.out.println("Es invierno");
            break;
            default: System.out.println("No es una estación");
            break;
        }
    }
}
