package io.berndos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goggles {

    @JsonProperty
    private Boolean curly;

}
