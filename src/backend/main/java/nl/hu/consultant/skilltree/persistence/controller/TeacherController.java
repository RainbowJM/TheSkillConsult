package nl.hu.consultant.skilltree.persistence.controller;

import nl.hu.consultant.skilltree.application.TeacherService;
import nl.hu.consultant.skilltree.domain.Teacher;
import nl.hu.consultant.skilltree.persistence.dto.TeacherRequestDTO;
import nl.hu.consultant.skilltree.persistence.dto.TeacherResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

//    @GetMapping()
//    public @ResponseBody
//    ResponseEntity<List<TeacherResponseDTO>> get(){
//
//        // Retrieve teachers
//        List<TeacherResponseDTO> newDTOs = new ArrayList<>();
//        List<Teacher> teachers = teacherService.getTeachers();
//
//        // Convert to DTOs
//        for (Teacher teacher : teachers){
//
//            TeacherResponseDTO teacherResponseDTO = new TeacherResponseDTO(teacher.getUser().getUsername(), );
//
//        }
//
//        // Return
//        return new ResponseEntity<>(newDTOs, HttpStatus.OK);
//    }
    @PatchMapping("/edit")
    public @ResponseBody ResponseEntity<?> edit(@Valid @RequestBody TeacherRequestDTO dto){
        if (teacherService.editExistingTeacher(dto.username, dto.password)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

}
