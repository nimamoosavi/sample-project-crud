package app.ladderproject.integration.domain.view.people;

import lombok.Data;

@Data
public class PeopleResVM {

    private Long id;
    private String birthCity;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String gender;
    private String nationalCode;
}
