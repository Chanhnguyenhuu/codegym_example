package vn.codegym.kt.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.kt.model.HopDong;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    Page<HopDong> findAll(Pageable pageable);
    List<HopDong> findAll();
    void delete(int id);
    void create(T t);
    void edit(T t);
    Optional<T> findById(int id);
}
