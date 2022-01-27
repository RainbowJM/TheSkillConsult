package nl.hu.consultant.security.presentation.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Login {
    @NotBlank
    @NotNull
    public String username;

    @NotBlank
    @NotNull
    public String password;
}
