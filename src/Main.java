import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String songName;        // Initializes a string
        Library playList = new Library();  // Creates an empty arraylist populated by the user

        System.out.println(playList);


        int stop = 0;
        while (stop == 0) {         // While loop continues until user exits
            songName = playList.getNextItem();
            // List of commands for the user
            System.out.println("""
                    
                     Indicate an action (#):\s       
                    1. Play\s
                    2. Skip\s
                    3. Add\s
                    4. Remove\s
                    5. Sort\s
                    6. Shuffle\s
                    7. Find\s
                    8. Exit\s
                    """);

            String option = myObj.nextLine();
            switch (option) {       // Switch cases provides different scenarios for the different turns
                case "1" -> System.out.println("Now playing: " + songName);     // "Pops" the first song and print it as a string
                case "2" -> {
                    System.out.println("Skipped: " + songName);     // Removes the current song and plays the next by removing the first
                    playList.skipNextItem();
                    songName = playList.getNextItem();
                    System.out.println("Now playing: " + songName);
                }
                case "3" -> {       // Add a new song
                    System.out.println("What to add in playlist: ");
                    String item = myObj.nextLine();
                    playList.addItem(item);
                    System.out.print(playList.getPlayList());
                }
                case "4" -> {       // Removes a song
                    System.out.println("What to remove in playlist: ");
                    String item = myObj.nextLine();
                    playList.removeItem(item);
                    System.out.print(playList.getPlayList());
                }
                case "5" -> {           // Sorts songs alphabetically
                    System.out.println(playList.getPlayList());
                    playList.sortAlphabet();
                    System.out.println(playList.getPlayList());
                }
                case "6" -> {           // Randomizes order
                    System.out.println(playList.getPlayList());
                    playList.shuffle();
                    System.out.println(playList.getPlayList());
                }
                case "7" -> {           // Finds whether a song is in the playlist
                    System.out.println("Find: ");
                    String item = myObj.nextLine();
                    int position = playList.find(item);
                    if (position == -1) {
                        System.out.println("Item not found!");
                    } else {
                        System.out.println(position);
                    }

                }
                case "8" -> {       // Exits loop and ends code
                    System.out.println("Bye, bye!");
                    stop = 1;
                }
                default -> System.out.println("Wrong input!");      // Error Checking
            }

//         Embellishments that may be added (or not)
//            System.out.println("\nThis is Stoopify, let's create your playlist! \n" +
//                    "1. Create a new playlist \n" +
//                    "2. View playlists");
//
//            String option = myObj.nextLine();
//            if (option.equals("1")) {
//                System.out.println("What are you naming this playlist?: ");
//                String listName = myObj.nextLine();
//
//            } else if (option.equals("2")) {
//                System.out.println(playList.getPlayList());
//                playList.sortAlphabet();
//                System.out.println(playList.getPlayList());
//            }
//        }

//        if (playList.find("banas") == -1){
//            System.out.println("Item not found in list");
//        }
        }
    }
}
