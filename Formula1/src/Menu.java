
public class Menu {

    public void mostrarMenuPrincipal() {
        // LISTAR OPCIONES
        System.out.println(Colores.BLUE+"╔════════════════════════════════════════╗");
        System.out.println(Colores.BLUE+"║"+Colores.WHITE_BACKGROUND+Colores.BLACK_BOLD+"            ELIGE UNA OPCIÓN            "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"╠════════════════════════════════════════╣");
        System.out.println(Colores.BLUE+"║"+Colores.RED+" 1 - "+Colores.GREEN_BOLD+"Añadir Piloto                      "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"║"+Colores.RED+" 2 - "+Colores.YELLOW_BOLD+"Añadir Coche                       "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"║"+Colores.RED+" 3 - "+Colores.PURPLE_BOLD+"Añadir Circuito                    "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"║"+Colores.RED+" 4 - "+Colores.CYAN_BOLD+"Listar"+Colores.GREEN_BOLD+" Piloto,"+Colores.YELLOW_BOLD+" Coche,"+Colores.PURPLE_BOLD+" Circuito     "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"║"+Colores.RED+" 5 - "+Colores.CYAN_BOLD+"Eliminar"+Colores.GREEN_BOLD+" Piloto,"+Colores.YELLOW_BOLD+" Coche,"+Colores.PURPLE_BOLD+" Circuito   "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"║"+Colores.RED+" 0 - "+Colores.RED_BOLD+"Salir                              "+Colores.BLUE+"║");
        System.out.println(Colores.BLUE+"╚════════════════════════════════════════╝"+Colores.RESET);
    }

}