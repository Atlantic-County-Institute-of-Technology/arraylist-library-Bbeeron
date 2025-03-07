import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Library playList = new Library();

        System.out.println(playList);


        int stop = 0;
        while (stop == 0) {

            System.out.println("\n Indicate an action (#): \n" +
                            "1. Play \n" +
                            "2. Skip \n" +
                            "3. Add \n" +
                            "4. Remove \n" +
                            "5. Sort \n" +
                            "6. Shuffle \n" +
                            "7. Find \n" +
                            "8. Exit \n");

            



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
