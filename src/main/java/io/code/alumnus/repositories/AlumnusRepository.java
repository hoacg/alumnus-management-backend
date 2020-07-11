package io.code.alumnus.repositories;

import io.code.alumnus.models.Alumni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnusRepository extends JpaRepository<Alumni, Long> {
}
