package demo.repository;

import demo.dtos.logfile.Logfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogfileRepository extends MongoRepository<Logfile, String> {
}
