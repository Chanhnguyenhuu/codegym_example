package vn.codegym.kt_3.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt_3.model.QuestionType;
import vn.codegym.kt_3.repository.IQuestionTypeRepository;
import vn.codegym.kt_3.service.IQuestionTypeService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionTypeService implements IQuestionTypeService {
    @Autowired
    private IQuestionTypeRepository questionTypeRepository;

    @Override
    public Page<QuestionType> findAll(Pageable pageable) {
        return questionTypeRepository.findAll(pageable);
    }

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    @Override
    public void delete(int id) {
        questionTypeRepository.deleteById(id);
    }

    @Override
    public void create(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }

    @Override
    public void edit(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }

    @Override
    public Optional<QuestionType> findById(int id) {
        return questionTypeRepository.findById(id);
    }
}
