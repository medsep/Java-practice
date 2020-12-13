
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDurationInSeconds(){
        return this.durationInSeconds;
    }
    
    public boolean equals(Song compared){
        
        if (this==compared){
            return true;
        } if(!(compared instanceof Song)){
        return false;
    }
        
        Song comparedSong = (Song) compared;
        
        if((this.getArtist().equals(comparedSong.getArtist()))
                && (this.getName().equals(comparedSong.getName()))
                && (this.getDurationInSeconds() == comparedSong.getDurationInSeconds()))
        {
            return true;
         }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
