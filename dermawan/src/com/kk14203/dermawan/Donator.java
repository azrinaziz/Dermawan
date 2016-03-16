/*
 * Name:        Donator.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

final class Donator {

    private String name;
    private double totalContribution;

    Donator(String name, double totalContribution) {
        this.name = name;
        this.totalContribution = totalContribution;
    }

    String getName() { return this.name; }

    double getTotalContribution() { return this.totalContribution; }
}
