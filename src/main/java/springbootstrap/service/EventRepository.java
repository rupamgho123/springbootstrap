package springbootstrap.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import springbootstrap.domain.Event;

/**
 * Created by rupam.ghosh on 11/07/15.
 */
public interface EventRepository extends Repository<Event,Long> {

    Page<Event> findAll(Pageable pageable);
}
