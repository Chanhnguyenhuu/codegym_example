package vn.codegym.kt_3.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt_3.model.QuestionContent;
import vn.codegym.kt_3.repository.IQuestionContentRepository;
import vn.codegym.kt_3.service.IQuestionContentService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionContentService implements IQuestionContentService {

    @Autowired
    private IQuestionContentRepository questionContentRepository;

    @Override
    public Page<QuestionContent> findAll(Pageable pageable) {
        return questionContentRepository.findAll(pageable);
    }

    @Override
    public List<QuestionContent> findAll() {
        return questionContentRepository.findAll();
    }

    @Override
    public void delete(int id) {
        questionContentRepository.deleteById(id);
    }

    @Override
    public void create(QuestionContent questionContent) {
        questionContentRepository.save(questionContent);
    }

    @Override
    public void edit(QuestionContent questionContent) {
        questionContentRepository.save(questionContent);
    }

    @Override
    public Optional<QuestionContent> findById(int id) {
        return questionContentRepository.findById(id);
    }

    public Page<QuestionContent> find(String key, String value, Pageable pageable) {
        switch (key.toLowerCase()) {
            case "name":
                return null;
            case "gender":
                return null;
            default:
                return findAll(pageable);
        }
    }

}
