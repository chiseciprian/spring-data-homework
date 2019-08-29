package itschool.homework24.homeworkcurs24.repository.service;

import itschool.homework24.homeworkcurs24.repository.DocumentRepository;
import itschool.homework24.homeworkcurs24.repository.model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;


    public List<Document> getAll() {
        return (List<Document>) documentRepository.findAll();
    }

    public Optional<Document> getDocumentById(Integer documentId) {
        return (Optional<Document>) documentRepository.findById(documentId);
    }

    public void addDocument(Document document) {
        documentRepository.save(document);
    }

    public void updateDocument(Integer documentId, Document document) {
        Optional<Document> studentOptional = documentRepository.findById(documentId);
        document.setDocumentId(documentId);
        documentRepository.save(document);
    }

    public void deleteDocument(Integer documentId){
        documentRepository.deleteById(documentId);
    }


}
