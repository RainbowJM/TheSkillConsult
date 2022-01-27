package nl.hu.consultant.security.presentation.controller;

import nl.hu.consultant.security.application.UserService;
import nl.hu.consultant.security.presentation.dto.UserRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PatchMapping("/edit")
    public @ResponseBody ResponseEntity<?> edit(@Valid @RequestBody UserRequestDTO dto){
        if (userService.edit(dto.username, dto.password)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

}
