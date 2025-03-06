import java.util.ArrayList;

public class Library {

    private ArrayList<String> playList = new ArrayList<>();

    public Library(String item){
        playList.add(item);
    }

//
//    public void addItem(String item){
//        ;
//    }
//
//    public void removeItem(String item){
//        ;
//    }
//
//    public String getNextItem(){
//        return "Banans";
//    }
//
//    public void skipNextItem(){
//        ;
//    }
//
//    public void sortAlphabet(){
//        ;
//    }
//
//    public int find(String item){
//        return 3;
//    }
//
//    public void shuffle(){
//        ;
//    }
//


    @Override
    public String toString() {
        return "Playlist: " + playList;
    }
}
