package br.edu.principal;

public class Principal {
	import java.util.ArrayList;

	public class AddressBook {
	    private ArrayList<Contact> contacts;

	    public AddressBook() {
	        this.contacts = new ArrayList<>();
	    }

	    public void addContact(Contact contact) {
	        this.contacts.add(contact);
	    }

	    public void listAllContacts() {
	        System.out.println("=== LISTA DE CONTATOS ===");
	        for (Contact contact : contacts) {
	            contact.displayContactInfo();
	        }
	        System.out.println("-------------------------");
	    }

	    public static void main(String[] args) {
	        AddressBook myBook = new AddressBook();

	        // Criação de Objetos e adição à lista
	        Contact c1 = new Contact("Alice", "Rua A, 123", "alice@mail.com", "9911-2233");
	        Contact c2 = new Contact("Bob", "Av B, 456", "bob@mail.com", "9944-5566");

	        myBook.addContact(c1);
	        myBook.addContact(c2);

	        // Exibir a lista
	        myBook.listAllContacts();
	        
	        // Exemplo de modificação de um atributo
	        c1.setAddress("Rua A, 123 - Novo Endereço");
	        myBook.listAllContacts();
	    }
	}
}
