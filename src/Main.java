import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("This is Stoopify, let's create your playlist! \n" +
                "1. Create a new playlist \n" +
                "2. View playlists");

        String option = myObj.nextLine();
        if (option.equals("1")) {
            System.out.println("What are you naming this playlist?: ");
            String listName = myObj.nextLine();
            System.out.println("Type out the songs to be added on this playlist! \n" +
                    "When you're done populating, type 'n': ");
            String done = "";
            Library playList = null;
            while (!(done.equals("n"))) {

                String songName = myObj.nextLine();
                if (songName.equals("n")) {
                    done = "n";
                } else {
                    playList = new Library(songName);
                }
            }
            System.out.println(playList);
//        int stop = 0;
//        while(stop == 0){
//
//
//            }
            // this comment is to simulate stuff
        }


    }
}
