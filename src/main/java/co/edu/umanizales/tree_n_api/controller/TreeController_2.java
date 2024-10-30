package co.edu.umanizales.tree_n_api.controller;

import co.edu.umanizales.tree_n_api.model.*;
import co.edu.umanizales.tree_n_api.model.Person;
import co.edu.umanizales.tree_n_api.service.TreeService_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/treenn")
public class TreeController_2 {
    @Autowired
    private TreeService_2 treeService_2;

    @GetMapping
    public NodeN_2 tree(){
        return treeService_2.showP();
    }

    @PostMapping("/addd")
    public String addd(@RequestBody Person person) {
       return treeService_2.getTreeN_2().add(person);
    }
}
