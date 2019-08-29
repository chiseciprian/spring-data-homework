package itschool.homework24.homeworkcurs24.repository.service;

import itschool.homework24.homeworkcurs24.repository.MarkupRepository;
import itschool.homework24.homeworkcurs24.repository.model.Document;
import itschool.homework24.homeworkcurs24.repository.model.Markup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarkupService {

    @Autowired
    private MarkupRepository markupRepository;

    public List<Markup> getMarkups(Integer documentId) {
        return (List<Markup>) markupRepository.findAllByDocumentId(documentId);
    }

    public Markup getMarkupById(Integer documentId, Integer markupId) {
        List<Markup> docMarkup = getMarkups(documentId);
        return docMarkup.stream()
                .filter(markup -> markup.getMarkupId().equals(markupId))
                .findFirst()
                .orElse(null);
    }


    public void addMarkup(Integer documentId, Markup markup) {
        markup.setDocumentId(documentId);
        markupRepository.save(markup);
    }

    public void updateMarkup(Integer documentId, Integer markupId, Markup markup) {
        Markup markup1 = getMarkupById(documentId, markupId);
        markup.setMarkupId(markupId);
        markup.setDocumentId(documentId);
        markupRepository.save(markup);
    }

    public void deleteMarkup(Integer documentId,Integer markupId){
        markupRepository.delete(getMarkupById(documentId,markupId));
    }
}

