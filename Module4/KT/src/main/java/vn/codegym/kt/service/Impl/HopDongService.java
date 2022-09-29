package vn.codegym.kt.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt.model.HopDong;
import vn.codegym.kt.repository.IHopDongRepository;
import vn.codegym.kt.service.IHopDongService;

import java.util.List;
import java.util.Optional;

@Service
public class HopDongService implements IHopDongService {

    @Autowired
    private IHopDongRepository hopDongRepository;

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return hopDongRepository.findAll(pageable);
    }

    @Override
    public List<HopDong> findAll() {
        return hopDongRepository.findAll();
    }

    @Override
    public void delete(int id) {
        hopDongRepository.deleteById(id);
    }

    @Override
    public void create(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public void edit(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public Optional<HopDong> findById(int id) {
        return hopDongRepository.findById(id);
    }
}
