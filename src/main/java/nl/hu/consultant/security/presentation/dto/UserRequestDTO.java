package nl.hu.consultant.security.presentation.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserRequestDTO {
    @NotNull
    @NotBlank
    public String username;

    @NotNull
    @NotBlank
    public String password;
}