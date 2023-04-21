package com.example.phonebookapi.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "contacts",uniqueConstraints = @UniqueConstraint(columnNames = "phoneNumber"))
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Length(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    @Pattern(regexp = "\\d+", message = "Phone number must contain only digits")
    private String phoneNumber;
}

