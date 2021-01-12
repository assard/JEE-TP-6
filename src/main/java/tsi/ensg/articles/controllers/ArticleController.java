package tsi.ensg.articles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tsi.ensg.articles.models.Article;
import tsi.ensg.articles.models.Author;
import tsi.ensg.articles.services.ArticleService;
import tsi.ensg.articles.services.AuthorService;

@Controller
public class ArticleController {

    @Autowired
    AuthorService authorService;

    @Autowired
    ArticleService articleService;

//    @GetMapping("/")
//    public String launch(Model model){
//        Author assard = new Author("Axel","Chassard");
//        Article artDefault = new Article("Article Default","An article by default");
//        Article artVertigeo = new Article("Article Vertigéo","An article about Vertigeo");
//        assard.addArticle(artDefault);
//        assard.addArticle(artVertigeo);
//        authorService.save(assard);
//        model.addAttribute("authorDefault",assard);
//        model.addAttribute("articleDefault",artDefault); // Ajout au modèle
//        return "article"; //Envoi vers la vue
//    }

    @GetMapping("/myarticle")
    public String getMyArticle(Model model) {
        Author assard = new Author("Axel","Chassard");
        Article artDefault = new Article("Article Default","An article by default");
        Article artVertigeo = new Article("Article Vertigéo","An article about Vertigeo");
        assard.addArticle(artDefault);
        assard.addArticle(artVertigeo);
        authorService.save(assard);
        model.addAttribute("authorDefault",assard);
        model.addAttribute("articleDefault",artDefault); // Ajout au modèle
        return "article"; //Envoi vers la vue
    }
}
