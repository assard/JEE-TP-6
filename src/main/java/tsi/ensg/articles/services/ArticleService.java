package tsi.ensg.articles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsi.ensg.articles.models.Article;
import tsi.ensg.articles.repositories.ArticleRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepo repository;

    public List<Article> findAll() {
        List<Article> articles = (List<Article>) repository.findAll();
        return articles;
    }

    public void save(Article article) {  // pas testé avec persist !
        repository.save(article);
    }

    public Optional<Article> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Article article) {
        repository.delete(article);
    }
    
}
