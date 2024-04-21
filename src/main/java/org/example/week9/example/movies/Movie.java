package org.example.week9.example.movies;

public class Movie {
    private int id;
    private  String name;
    private int stars;
    private boolean watched;

    Movie( String name,int stars,boolean watched){
        this.name = name;
        this.stars= stars;
        this.watched=watched;
    }
    Movie(int id, String name,int stars,boolean watched){
        this.id =id;
        this.name = name;
        this.stars= stars;
        this.watched=watched;
    }

    @Override
    public String toString(){
        return "ID "+ " Movie name: "+ name + " is rated "+ stars + " stars. "+ " Have you watched this ? "+ watched;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
