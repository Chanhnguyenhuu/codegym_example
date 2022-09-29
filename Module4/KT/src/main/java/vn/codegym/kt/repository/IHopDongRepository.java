package vn.codegym.kt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.kt.model.HopDong;

@Repository
public interface IHopDongRepository extends JpaRepository<HopDong, Integer> {
}
