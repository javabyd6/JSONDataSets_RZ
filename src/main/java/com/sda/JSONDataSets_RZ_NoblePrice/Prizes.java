package com.sda.JSONDataSets_RZ_NoblePrice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prizes {

    private String year;
    private String category;
    private String overallMotivation;
    private List<Laureates> laureates;


}
