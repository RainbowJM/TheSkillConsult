//package nl.hu.consultant.security.presentation.controller;
//
//import nl.hu.consultant.security.presentation.dto.UserRequestDTO;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping("/teacher")
//public class UserController {
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
////    @GetMapping()
////    public @ResponseBody
////    ResponseEntity<List<TeacherResponseDTO>> get(){
////
////        // Retrieve teachers
////        List<TeacherResponseDTO> newDTOs = new ArrayList<>();
////        List<Teacher> teachers = teacherService.getTeachers();
////
////        // Convert to DTOs
////        for (Teacher teacher : teachers){
////
////            TeacherResponseDTO teacherResponseDTO = new TeacherResponseDTO(teacher.getUser().getUsername(), );
////
////        }
////
////        // Return
////        return new ResponseEntity<>(newDTOs, HttpStatus.OK);
////    }
//    @PatchMapping("/edit")
//    public @ResponseBody ResponseEntity<?> edit(@Valid @RequestBody UserRequestDTO dto){
//        if (userService.editExistingTeacher(dto.username, dto.password)){
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.CONFLICT);
//    }
//
//}
