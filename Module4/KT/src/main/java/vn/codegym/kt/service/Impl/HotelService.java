package vn.codegym.kt.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt.model.HopDong;
import vn.codegym.kt.model.Hotel;
import vn.codegym.kt.repository.IHotelRepository;
import vn.codegym.kt.service.IHotelService;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private IHotelRepository e2Repository;

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<HopDong> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(Hotel customer) {

    }

    @Override
    public void edit(Hotel customer) {

    }

    @Override
    public Optional<Hotel> findById(int id) {
        return Optional.empty();
    }
}
