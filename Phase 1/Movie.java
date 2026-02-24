

public class Movie {

    private String name;
    private int release_year;
    private String actor;
    private String director;

    public Movie(String name, int release_year, String actor, String director) {
        this.name = name;
        this.release_year = release_year;
        this.actor = actor;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public int getRelease_year() {
        return release_year;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{name='" + name + '\'' +
                ", release_year=" + release_year +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
