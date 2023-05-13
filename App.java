import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Queue<String> todoList = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 3) {
            System.out.println("=== Aplikasi Todo List ===");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Lihat Todo");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Masukan todo baru: ");
                    String newTodo = input.next();
                    todoList.add(newTodo);
                    System.out.println("Todo berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("Todo List:");
                    System.out.println("-makan");
                    System.out.println("-olahraga");
                    for (int i = 0; i < todoList.size(); i++) {
                    System.out.println("- " + todoList.peek());
                    }
                    break;
                case 3:
                    System.out.println("makan");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan pilih 1, 2, atau 3.");
                    break;
            }
        }
        
        input.close();
    }
}