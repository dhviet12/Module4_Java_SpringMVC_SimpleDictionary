package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    DictionaryService dictionaryService = new DictionaryService();
    @GetMapping("")
    public ModelAndView display(){
        ModelAndView modelAndView = new ModelAndView("dictionary");
        return modelAndView;
    }
    @PostMapping("")
    public ModelAndView translate(@RequestParam String word){
        ModelAndView modelAndView = new ModelAndView("dictionary");
        String result = dictionaryService.translate(word);
        if(result== null){
            result= "Not found in dictionary";
        }
        modelAndView.addObject("result",result);
        return modelAndView;
    }

}
