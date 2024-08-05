package d.dogs.service;


import d.dogs.api.controller.TeacherControler;
import d.dogs.api.models.TeacherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class TeacherService {

    @Autowired
    private TeacherControler teacherControler;

    public List<TeacherModel> get_teachers(){
        return teacherControler.get_teachers();
    }

    public String save_teacher(TeacherModel teacher){
        return teacherControler.save_teacher(teacher);
    }

}
