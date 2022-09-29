package vn.codegym.kt_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.kt_3.model.QuestionType;

@Repository
public interface IQuestionTypeRepository extends JpaRepository<QuestionType, Integer> {
}
