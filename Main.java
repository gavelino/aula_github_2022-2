import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
		int option = -1;
		while (option != 4){
			option = mainMenu.getSelection();
		}
		System.out.println(option + "foi selecionada");
		System.out.println("Fim");
	}

}