package vn.codegym.kt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.kt.model.Hotel;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Integer> {
}
