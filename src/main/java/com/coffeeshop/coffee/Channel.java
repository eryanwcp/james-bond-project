package com.coffeeshop.coffee;

/**
 * Created by Serkan.Tugrul on 08/06/2015.
 */
public class Channel {

    private String name;
    private String nineAm;
    private String tenAm;
    private String elevenAm;
    private String twelvePm;
    private String onePm;
    private String twoPm;
    private String threePm;

    public Channel(String name, String nineAm, String tenAm, String elevenAm, String twelvePm, String onePm,
                   String twoPm, String threePm) {
        this.name = name;
        this.nineAm = nineAm;
        this.tenAm = tenAm;
        this.elevenAm = elevenAm;
        this.twelvePm = twelvePm;
        this.onePm = onePm;
        this.twoPm = twoPm;
        this.threePm = threePm;
    }

    public String getName() {
        return name;
    }

    public String getNineAm() {
        return nineAm;
    }

    public String getTenAm() {
        return tenAm;
    }

    public String getElevenAm() {
        return elevenAm;
    }

    public String getTwelvePm() {
        return twelvePm;
    }

    public String getOnePm() {
        return onePm;
    }

    public String getTwoPm() {
        return twoPm;
    }

    public String getThreePm() {
        return threePm;
    }
}
