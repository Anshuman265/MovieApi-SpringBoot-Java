package dev.anshuman265.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
// Code to find the imdB movie by id

    Optional<Movie> findMovieByImdbId(String imdbId);
}
