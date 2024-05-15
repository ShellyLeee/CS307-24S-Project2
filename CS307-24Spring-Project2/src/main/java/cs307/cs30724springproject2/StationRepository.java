package cs307.cs30724springproject2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StationRepository extends JpaRepository <Station, Long> {

    public Station findByID(Long id);
    public void deleteByID(Long id);


}

