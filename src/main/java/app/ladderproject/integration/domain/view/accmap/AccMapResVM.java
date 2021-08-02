package app.ladderproject.integration.domain.view.accmap;

import lombok.Data;

@Data
public class AccMapResVM {
    private Long id;
    private String name;
    private String description;
    private String code;
    private Long detailTypeId;
}
