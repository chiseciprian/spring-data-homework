package itschool.homework24.homeworkcurs24.repository;

import itschool.homework24.homeworkcurs24.repository.model.Document;
import itschool.homework24.homeworkcurs24.repository.model.Markup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkupRepository extends JpaRepository<Markup,Integer> {
    List<Markup> findAllByDocumentId(Integer documentId);


}
