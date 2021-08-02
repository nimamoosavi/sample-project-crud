package app.ladderproject.integration.domain.view.formfield;

import app.ladderproject.integration.domain.enums.FiledType;
import lombok.Data;

@Data
public class FormFieldsResVM {
    private Long id;

    private String label;

    private FiledType type;

    private Integer minLength;

    private Integer maxLength;

    private Double minValue;

    private Double maxValue;

    private String apiVal;

    private String dateFormatVal;

    private Boolean required;

    private Boolean unique;

    private String description;

    private Integer sortNumber;

    private Long costId;
}
