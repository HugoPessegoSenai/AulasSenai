/*
 * Dado o algoritmo abaixo, “Calcular Valor Pedido”, identifique os dados
de entrada, qual o processamento e os dados de saída:
• Leia o código do item.
• Leia o valor do item.
• Leia a quantidade do item.
• Calcule o valor total do pedido (quantidade * valor do item).
• Escreva o valor total do pedido.
 */
package Principal;

import Model.PedidoFinal;
import java.util.Scanner;

/**
 *
 * @author hugo.gomes
 */
public class MainAula03_Pedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner: Biblioteca para solicitar entrada de dados
        // Quando o Scanner é instacio a mesma um exemplo utilizando Scanner + apelido + = + new + Scaner(System.in)
        Scanner s = new Scanner(System.in);
        PedidoFinal pedido = new PedidoFinal();
        
        System.out.println("Informe o codigo item: ");
        pedido.CodigoItem = s.nextInt();
              
        System.out.println("Informe o Quantidade do item: ");
        pedido.QuantidadeItem = s.nextInt();
        
        System.out.println("Informe o Valor unitario: ");
        pedido.ValorItem = s.nextFloat();
        
        float ValorFinal = pedido.Calcular(pedido.QuantidadeItem, pedido.ValorItem);
        
        System.out.println("Valor total do pedido: R$ "+ValorFinal);
        
        System.out.println("Valor total do pedido 2 : R$ "+pedido.QuantidadeItem * pedido.ValorItem);
        
    }
    
}
