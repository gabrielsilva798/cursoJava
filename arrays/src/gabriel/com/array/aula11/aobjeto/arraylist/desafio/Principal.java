package gabriel.com.array.aula11.aobjeto.arraylist.desafio;

public class Principal {
	 public static void main(String[] args) {
		 Cardapio cardapio = new Cardapio();
		 
		 Item item1 = new Item();
		 item1.descricao = "Rib Eye 500g";
		 item1.preco = 95;
		 
		 Item item2 = new Item();
		 item2.descricao = "Picanha 400g";
		 item2.preco = 102.5;
		 
		 Item item3 = new Item();
		 item3.descricao = "Batata frita 300g";
		 item3.preco = 12;
		 
		 cardapio.adicionarItem(item1);
		 cardapio.adicionarItem(item2);
		 cardapio.adicionarItem(item3);
		 cardapio.imprimirItensCardapio(80, 150);
		 cardapio.removerItem(0);
		 System.out.println("---");
		 cardapio.imprimirItensCardapio(0, 150);
		 }
}
