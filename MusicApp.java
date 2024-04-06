import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MusicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Cria usuario\n2. Cria Playlist\n3. Adiciona Musica\n0. Finaliza Programa");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Nome de usuario: ");
                    String userName = scanner.next();
                    System.out.print("Email do usuario: ");
                    String userEmail = scanner.next();
                    User user = new User(userName, userEmail);
                    System.out.println("Usuario criado: " + user.getName());
                    break;
                case 2:

                    System.out.print("Nome de usuario: ");
                    String userName2 = scanner.next();
                    User user2 = new User(userName2, "");
                    System.out.println("Usuario encontrado: " + user2.getName());
                    System.out.print("Nome da playlist: ");
                    String playlistName = scanner.next();
                    Playlist playlist = new Playlist(playlistName);
                    System.out.println("Playlist criada: " + playlist.getName());
                    break;
                case 3:
                    System.out.println("Nome da playlist: ");
                    String playlistName = scanner.next();
                    Playlist playlist = new Playlist(playlistName);
                    System.out.println("Nome da musica: ");
                    String songName = scanner.next();
                    playlist.addSong(songName);
                    playlist.printSongs();
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Escolha invalida, escolha novamente");
            }
        } while (choice != 0);

        scanner.close();
    }
}