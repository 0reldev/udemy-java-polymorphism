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

        Object unknownObject = Movie.getMovie("c", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof  ScienceFiction syfy) { // pattern matching
            syfy.watchScienceFiction();
        }
    }
}
