package in.iamneo.springbootjunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.iamneo.springbootjunit.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByGenera(String genera);
}
