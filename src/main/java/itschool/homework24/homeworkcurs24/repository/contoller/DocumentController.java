package itschool.homework24.homeworkcurs24.repository.contoller;


import itschool.homework24.homeworkcurs24.repository.model.Document;
import itschool.homework24.homeworkcurs24.repository.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    List<Document> getDocuments() {
        return documentService.getAll();
    }

    @GetMapping("{documentId}")
    <Optional> java.util.Optional<Document> getDocumentById(@PathVariable Integer documentId) {
        return documentService.getDocumentById(documentId);
    }

    @PostMapping
    void addDocument(@RequestBody Document document){
         documentService.addDocument(document);
    }

    @PutMapping("{documentId}")
    void updateDocument(@PathVariable Integer documentId,@RequestBody Document document){
         documentService.updateDocument(documentId,document);
    }

    @DeleteMapping("{documentId}")
    void deleteDocument(@PathVariable Integer documentId){
        documentService.deleteDocument(documentId);
    }
}
