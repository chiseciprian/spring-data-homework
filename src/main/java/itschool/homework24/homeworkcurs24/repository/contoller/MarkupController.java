package itschool.homework24.homeworkcurs24.repository.contoller;

import itschool.homework24.homeworkcurs24.repository.model.Document;
import itschool.homework24.homeworkcurs24.repository.model.Markup;
import itschool.homework24.homeworkcurs24.repository.service.DocumentService;
import itschool.homework24.homeworkcurs24.repository.service.MarkupService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/documents")
public class MarkupController {

    private final MarkupService markupService;

    public MarkupController(MarkupService markupService) {
        this.markupService = markupService;
    }

    @GetMapping("{documentId}/markups")
    List<Markup> getMarkups(@PathVariable Integer documentId) {
        return markupService.getMarkups(documentId);
    }

    @GetMapping("{documentId}/markups/{markupId}")
    Markup getMarkupById(@PathVariable Integer documentId, @PathVariable Integer markupId){
        return markupService.getMarkupById(documentId,markupId);
    }

    @PostMapping("{documentId}/markups")
   void addMarkup(@PathVariable Integer documentId,@RequestBody Markup markup){
         markupService.addMarkup(documentId,markup);
    }

    @PutMapping("{documentId}/markups/{markupId}")
    void updateMarkup(@PathVariable Integer documentId,@PathVariable Integer markupId,@RequestBody Markup markup){
         markupService.updateMarkup(documentId,markupId,markup);
    }

    @DeleteMapping("{documentId}/markups/{markupId}")
    void deleteMarkup(@PathVariable Integer documentId, @PathVariable Integer markupId){
        markupService.deleteMarkup(documentId,markupId);
    }

}
