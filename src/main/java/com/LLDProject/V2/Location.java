package com.LLDProject.V2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Location {

   private double latitude;

   private double longitude;


    public double calcDistance( Location two) {
        // Euclidean Distance I will use this
        // Haversine formula (Two Point on sphere) I will use this
        double dx = this.getLatitude() - two.getLatitude();
        double dy = this.getLongitude() - two.getLongitude();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
