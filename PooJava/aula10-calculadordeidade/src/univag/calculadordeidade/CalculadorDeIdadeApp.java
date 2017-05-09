package univag.calculadordeidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class CalculadorDeIdadeApp {
	

    public static void main(String[] args) {
    	
        System.out.println("Bem vindo ao calculador de idade\n");

        // Pegar a entrada do usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua data de nascimento (YYYY-MM-DD): ");
        String stringDataDeNascimento = sc.nextLine();
        System.out.println();
        
        
              
        // Pegar e mostrar a data de nascimento do usuario
        LocalDate datanasc = LocalDate.parse(stringDataDeNascimento);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Sua data de nascimento é " + dtf.format(datanasc));

        // Pegar e mostrar a data atual
        LocalDate dataatual = LocalDate.now();
        System.out.println("A data atual é " + dtf.format(dataatual));

        //Calcular a idade do usuario
        int idade = dataatual.getYear() - datanasc.getYear();
        
        LocalDate aniversario = datanasc.w
                
        //Mostrar a idade do usuario
        System.out.println("Sua idade é " + (dataatual.getYear() - datanasc.getYear()));
        sc.close();
    }


}