package com.sda.JSONDataSets_RZ_NoblePrice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laureates {

    private String id;
    private String firstname;
    private String surname;
    private String motivation;
    private String share;

}
