import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Playlist playlist = null; // Declare a variável fora do switch case

        do {
            System.out.println("\n1. Cria usuario\n2. Cria Playlist\n3. Adiciona Musica\n0. Finaliza Programa");
            System.out.print("Selecionar: ");
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
                    System.out.print("Nome da playlist: ");
                    String playlistName = scanner.next();
                    playlist = new Playlist(playlistName);
                    System.out.println("Playlist criada: " + playlist.getName());
                    break;
                case 3:
                    if (playlist != null) {
                        System.out.println("Nome da musica: ");
                        String songName = scanner.next();
                        playlist.addSong(songName);
                        playlist.printSongs();
                    } else {
                        System.out.println("Crie uma playlist primeiro.");
                    }
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
