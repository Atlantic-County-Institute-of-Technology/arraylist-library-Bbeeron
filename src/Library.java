import java.util.*;

public class Library {

    private final ArrayList<String> playList = new ArrayList<>();
    Scanner myObj = new Scanner(System.in);

    public Library(){
        System.out.println("Let's initialize this playlist! \n" +
                    "When you're done populating, type 'n': ");
        String done = "";

        while (!(done.equals("n"))) {

                String songName = myObj.nextLine();

                if (songName.equals("n")) {
                    done = "n";
                } else {
                    playList.add(songName);
                }

            }
    }

    public ArrayList<String> getPlayList() {
        return playList;
    }

    public void addItem(String item){
        playList.add(item);
    }

    public void removeItem(String item){
        playList.remove(item);
    }

    public String getNextItem(){
        return playList.getFirst();
    }

    public void skipNextItem(){
        playList.removeFirst();
    }

    public void sortAlphabet(){
        playList.sort(String::compareTo);
    }

    public int find(String item){
        return playList.indexOf(item);
    }

    public void shuffle(){
        Collections.shuffle(playList);
    }



    @Override
    public String toString() {
        return "Playlist: " + playList;
    }
}
