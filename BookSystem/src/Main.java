import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Library kniznica = new Library();
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Zadaj cislo");
			System.out.println("1. Pridat knihu");
			System.out.println("2. Odstranit knihu podla isbn");
			System.out.println("3. Zobrazit knihy");
			System.out.println("4. Vyhladat knihu podla nazvu");
			System.out.println("5. Ukoncit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(choice) {
				
				case 1:
					System.out.println("zadaj nazov knihy");
					String title = scanner.nextLine();
					System.out.println("zadaj autora knihy");
					String autor = scanner.nextLine();
					System.out.println("zadaj isbn knihy");
					int isbn = scanner.nextInt();
					Book book = new Book(title,autor,isbn);
					kniznica.addBook(book);
					break;
				case 2:
					System.out.println("Zadaj isbn");
					int risbn = scanner.nextInt();
					kniznica.deleteBook(risbn);
					break;
				case 3:
					System.out.println("Zoznam knih nizsie");
					kniznica.showBooks();
					break;
				case 4:
					System.out.println("zadaj nazov");
					String stitle = scanner.nextLine();
					kniznica.searchBook(stitle);
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("Nespravne zadana hodnota");
					break;
			}
			
			
		}
	}

}
