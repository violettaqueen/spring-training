package com.cydeo.dto;
import com.cydeo.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {

    private Long id;

    @Size(max =100, min = 2, message = "Title should be 2-100 characters long.")
    @NotBlank(message = "Title is a required field.")
    private String title;

    @NotBlank(message = "Phone Number is a required field.")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" // +111 (202) 555-0125  +1 (202) 555-0125
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"                                  // +111 123 456 789
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$", message = "Phone Number is required field and may be in any valid phone number format.")
    private String phone;

    @Size(max =100, min = 2, message = "Title should be 2-100 characters long.")
    @NotBlank(message = "Website is a required field.")
    private String website;

    @Valid
    @NotNull(message = "Address is a required field")
    private AddressDto address;

    private CompanyStatus companyStatus;
}