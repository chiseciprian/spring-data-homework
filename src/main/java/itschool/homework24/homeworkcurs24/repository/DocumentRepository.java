package itschool.homework24.homeworkcurs24.repository;

import itschool.homework24.homeworkcurs24.repository.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DocumentRepository extends JpaRepository<Document,Integer> {
    List<Document> findAllByOwner(String owner);

    Optional<Document> findFirtstByOwnerOrderByDocumentId(String owner);


}
