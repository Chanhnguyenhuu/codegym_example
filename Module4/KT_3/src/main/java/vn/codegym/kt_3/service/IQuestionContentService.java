package vn.codegym.kt_3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.kt_3.model.QuestionContent;
import vn.codegym.kt_3.model.QuestionType;

import java.util.List;
import java.util.Optional;

public interface IQuestionContentService {
    Page<QuestionContent> findAll(Pageable pageable);
    List<QuestionContent> findAll();
    void delete(int id);
    void create(QuestionContent questionContent);
    void edit(QuestionContent questionContent);
    Optional<QuestionContent> findById(int id);
}
