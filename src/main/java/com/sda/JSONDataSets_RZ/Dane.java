package com.sda.JSONDataSets_RZ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dane {

    private String computed_region_cbhk_fwbd;
    private String computed_region_nnqa_25f4;
    private String fall;
    private Geolocation geolocation;
    private String id;
    private String mass;
    private String name;
    private String nametype;
    private String recclass;
    private String reclat;
    private String reclong;
    private String year;

}
