package tsi.ensg.articles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tsi.ensg.articles.models.Article;
import tsi.ensg.articles.models.Author;

@Controller
public class ArticleController {

    @GetMapping("/myarticle")
    public String getMyArticle(Model model) {
        Author assard = new Author(1,"Axel","Chassard");
        Article artDefault = new Article(1,"Article Default","An article by default",assard);
        model.addAttribute("authorDefault",assard);
        model.addAttribute("articleDefault",artDefault); // Ajout au modèle
        return "article"; //Envoi vers la vue
    }
}
