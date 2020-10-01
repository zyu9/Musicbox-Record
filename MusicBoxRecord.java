import java.util.*;
import java.io.*;
/**
 * This class contains code for reading a txt file and put the 
 * values into an arraylist; sort the arraylist and display 
 * it into a tree set. (Use TreeSet to prevent repeat input)
 *
 * @author (Zhiyan Yu)
 * @version (9/30/2020)
 */
public class MusicBoxRecord
{
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public static void main(String[] args){
        new MusicBoxRecord().go();
    }
    
    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }
    
    private void getSongs(){
        try{
            File file = new File("SongListRecord.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
