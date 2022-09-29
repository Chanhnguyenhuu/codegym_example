package vn.codegym.kt_3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.kt_3.model.QuestionType;

import java.util.List;
import java.util.Optional;

public interface IQuestionTypeService {
    Page<QuestionType> findAll(Pageable pageable);
    List<QuestionType> findAll();
    void delete(int id);
    void create(QuestionType questionType);
    void edit(QuestionType questionType);
    Optional<QuestionType> findById(int id);
}
