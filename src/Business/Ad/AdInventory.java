/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ad;

import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class AdInventory {

    ArrayList<AdImpression> impressions = new ArrayList<>();

    public ArrayList<AdImpression> getImpressions() {
        return impressions;
    }

    public void setImpressions(ArrayList<AdImpression> impressions) {
        this.impressions = impressions;
    }

    public AdImpression createandaddAdImpression() {
        AdImpression adi = new AdImpression();
        impressions.add(adi);
        return adi;

    }

}
