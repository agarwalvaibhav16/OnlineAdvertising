/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ad;

/**
 *
 * @author vaibhavagarwal
 */
public class AdImpression {

    //int size;
    int width;
    int height;

    int clicks = 0;

    public int calcClicks() {
        this.clicks = clicks + 1;
        return clicks;
    }

    /*public void setClicks(int clicks) {
     this.clicks = clicks;
     }*/
    private int impressionno;// more the number less is the preffred location for ad

    public AdImpression() {
        //this.impressionno=this.impressionno+1;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getImpressionno() {
        return this.impressionno;
    }

    public void setImpressionno(int impressionno) {
        this.impressionno = impressionno;
    }

    @Override
    public String toString() {
        return String.valueOf(this.impressionno);
    }

}
