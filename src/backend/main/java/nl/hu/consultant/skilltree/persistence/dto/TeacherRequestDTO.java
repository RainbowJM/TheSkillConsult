package nl.hu.consultant.skilltree.persistence.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TeacherRequestDTO {
    @NotNull
    @NotBlank
    public String username;

    @NotNull
    @NotBlank
    public String password;
}
