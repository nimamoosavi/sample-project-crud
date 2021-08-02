package app.ladderproject.integration.domain.view.accmap;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccMapValidate {
    @NotNull
    private Long accId;
    @NotNull
    private Long detailId;
}
