package nl.hu.consultant.skilltree.application;

import nl.hu.consultant.security.application.UserService;
import nl.hu.consultant.skilltree.domain.Teacher;
import nl.hu.consultant.skilltree.presentation.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherService {
    private final UserService userService;
    private final TeacherRepository teacherRepository;

    public TeacherService(UserService userService, TeacherRepository teacherRepository) {
        this.userService = userService;
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public boolean editExistingTeacher(String username, String password) {
        return userService.edit(username, password);
    }
}
