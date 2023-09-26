import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Music[] song = new Music[6];
        song[0] =new Music("exile", "folklore", "3:19", "indie", new Date(17, 8, 2023), new Artist("Taylor Swift", "American", 9));
        song[1]=new Music("mary", "seven", "4:09", "jazz", new Date(3, 1, 2022), new Artist("RKS", "Irish", 7));
        song[2] =new Music("Flower", "Epiphany", "3:09", "rock", new Date(17, 8, 2023), new Artist("Ethel Cain", "swedish", 10));
        song[3] =new Music("LOW", "SOS", "5:00", "rap", new Date(10, 2, 2018), new Artist("SZA", "moroccon", 2));
        song[4] = readFromKeyboard.inputMusicObjects();
        song[5]=new Music("LOW", "SOS", "5:00", "rap", new Date(10, 2, 2018), new Artist("SZA", "moroccon", 2));
        for (int i = 0; i <=5; i++) {
            System.out.println("----------SPOTIFY-----------");
            System.out.println(song[i].toString());
        }

        //this is to compare two object titles
        if (song[3].equalsIgnoreCase(song[5]))
             System.out.println("they are equal");
        else
            System.out.println("they are not equal");


    }
}

