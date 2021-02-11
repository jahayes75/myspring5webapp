package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jh on 02/10/21.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
