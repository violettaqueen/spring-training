package com.cydeo.dto;


import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class UserDto {

    private Long id;

    @NotBlank(message = "Username is required")
    @Email (message = "Email is required field" )
    private String username;

    @NotBlank (message = "password is required field")
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}", message = "password should be at least 4 characters long and contains 1 capital letter, 1 small letter, 1 special character or number")
    private String password;

    @NotNull(message = "Password should match")
    private String confirmPassword;

    @NotBlank (message = "First name is required field")
    @Size(max = 50, min = 2, message = "First name must be between 2 and 50 characters long")
    private String firstname;

    @NotBlank (message = "Last name is required field")
    @Size(max = 50, min = 2, message = "First name must be between 2 and 50 characters long")
    private String lastname;

    @NotBlank (message = "Phone number is required field")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" // +111 (202) 555-0125  +1 (202) 555-0125
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"                                  // +111 123 456 789
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$", message = "Phone Number is required field and may be in any valid phone number format.")
    private String phone;

    @NotNull(message = "Please select a role")
    private RoleDto role;

    @NotNull(message = "Please select a customer")
    private CompanyDto company;

    private boolean isOnlyAdmin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkConfirmPassword();
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        checkConfirmPassword();
    }

    private void checkConfirmPassword() {
        if (this.password == null || this.confirmPassword == null) {
            return;
        } else if (!this.password.equals(this.confirmPassword)) {
            this.confirmPassword = null;
        }
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }

    public boolean isOnlyAdmin() {
        return isOnlyAdmin;
    }

    public void setOnlyAdmin(boolean onlyAdmin) {
        isOnlyAdmin = onlyAdmin;
    }


}