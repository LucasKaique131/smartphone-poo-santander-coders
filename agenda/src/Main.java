import controller.MenuBlocoDeNotas;
import controller.MenuPrincipal;

public class Main {
    public static void main(String[] args) throws Exception {

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.selecionaOpcao();

        MenuBlocoDeNotas menuBlocoDeNotas = new MenuBlocoDeNotas();
        menuBlocoDeNotas.selecionaOpcao();
    }
}