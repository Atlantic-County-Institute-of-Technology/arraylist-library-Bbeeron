import java.util.*;     // Imports all libraries

public class Library {      // Library class is referenced for its arrayList commands

    private final ArrayList<String> playList = new ArrayList<>();       // Global variable making an empty arraylist
    Scanner myObj = new Scanner(System.in);     // For telling what the user wants to do

    public Library(){
        System.out.println("Let's initialize this playlist! \n" +
                    "When you're done populating, type 'n': ");
        String done = "";

        while (!(done.equals("n"))) {       // While loop forces user to keep inputting songs into the arraylist

                String songName = myObj.nextLine();

                if (songName.equals("n")) {
                    done = "n";
                } else {
                    playList.add(songName);     // Allows the user to initialize an arraylist with items already in it
                }

            }
    }

    public ArrayList<String> getPlayList() {
        return playList;
    }   // Returns the playlist allowing user to view the contents

    public void addItem(String item){
        playList.add(item);
    }   //  Appends an item at the end of the playlist

    public void removeItem(String item){
        playList.remove(item);
    }   // Removes an item based on user input

    public String getNextItem(){
        return playList.getFirst();
    }   // Return the first item in the arraylist

    public void skipNextItem(){
        playList.removeFirst();
    }  // Removes the first item on the playlist

    public void sortAlphabet(){
        playList.sort(String::compareTo);
    }  // Sorts the items alphabetically (uppercase > lowercase)

    public int find(String item){
        return playList.indexOf(item);
    }   // Returns index of item inputted

    public void shuffle(){
        Collections.shuffle(playList);
    }       // Shuffles the playlist using command from library Collections



    @Override
    public String toString() {
        return "\nPlaylist: " + playList;
    }       // Formats return statement
}
