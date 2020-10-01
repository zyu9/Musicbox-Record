
/**
 * This class contains attributes for a Song object; including title.
 * artist, rating and bpm. 
 *
 * @author (Zhiyan Yu)
 * @version (9/30/2020)
 */
public class Song implements Comparable<Song>
{
    String title;
    String artist;
    String rating;
    String bpm;
    /**
     * The compare method in order to use a tree set.
     * @param  Song - pass a Song object called s
     * @return integer - determines whether is equal or not
     */
    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }
    
    /**
     * The constructor - for initalizing values
     * @param String - string t which means the title
     * @param String - string a which means the artist
     * @param String - string r which means the rating
     * @param String - string b which means the bpm
     */
    Song(String t, String a, String r, String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }
    
    /**
     * The get method for get the title. 
     * @return String - return title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * The get method for get the artist. 
     * @return String - return artist
     */
    public String getArtist(){
        return artist;
    }
    
    /**
     * The get method for get the rating. 
     * @return String - return rating
     */
    public String getRating(){
        return rating;
    }
    
    /**
     * The get method for get the Bpm. 
     * @return String - return Bpm
     */
    public String getBpm(){
        return bpm;
    }
    
    /**
     * The get method for get the tilte. 
     * @return String - return title
     */
    public String toString(){
        return title; 
    }
}
