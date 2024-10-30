package co.edu.umanizales.tree_n_api.controller;

import co.edu.umanizales.tree_n_api.service.TreeService;
import co.edu.umanizales.tree_n_api.model.Person;
import co.edu.umanizales.tree_n_api.model.NodeN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/treen")
public class TreeController {
    @Autowired
    private TreeService treeService;

    @GetMapping
    public NodeN tree() {
        return treeService.show();
    }

    @PostMapping("/add")
    public String add(@RequestBody Person person) {
        return treeService.getTreeN().add(person);
    }
}
