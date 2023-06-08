public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("a", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("a", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("c", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("AirPlane");
        plane.watchComedy();


    }
}
