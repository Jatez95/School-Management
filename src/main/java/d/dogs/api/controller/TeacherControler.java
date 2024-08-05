package d.dogs.api.controller;


import d.dogs.api.models.TeacherModel;
import d.dogs.api.repository.Repository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TeacherControler {

    @Autowired
    private Repository repository;

    @GetMapping()
    public String index(){
        return "CONNECTED";
    }


    @GetMapping("teachers")
    public List<TeacherModel> get_teachers(){
        return repository.findAll();
    }

    @PostMapping("create-teacher")
    public String save_teacher(@RequestBody TeacherModel teacher){
        repository.save(teacher);
        return "SAVED";
    }

    @PutMapping("edit-teacher{id}")
    public String update_teacher(@PathVariable Integer id, @RequestBody TeacherModel teacher){
        TeacherModel update_teacher = repository.findById(id).get();
        update_teacher.setFirst_name(teacher.getFirst_name());
        update_teacher.setYears_experience(teacher.getYears_experience());
        repository.save(update_teacher);
        return "UPDATED SUCCESFULY";

    }

    @DeleteMapping("del-teacher")
    public String delete_teacher(@PathVariable Integer id){
        TeacherModel teacher = repository.findById(id).get();
        repository.delete(teacher);
        return "DELETED SUCCESFULY";
    }

}
