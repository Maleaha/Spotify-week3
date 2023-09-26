import java.util.Scanner;

public class readFromKeyboard {
    public static Music inputMusicObjects() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter details for song 5: ");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Duration: ");
        String duration = scanner.nextLine();
        System.out.print("albumName: ");
        String albumName = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Date: ");
        int date = scanner.nextInt();
        System.out.print("month: ");
        int month = scanner.nextInt();
        System.out.print("year: ");
        int year = scanner.nextInt();
        System.out.print("artist name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("nationality: ");
        String nationality = scanner.nextLine();
        scanner.nextLine();
        System.out.print("rating: ");
        int rating = scanner.nextInt();
        scanner.close();

        return new Music(title, duration,albumName, genre, new Date(date,month,year), new Artist(name,nationality,rating)) ;
    }
}

