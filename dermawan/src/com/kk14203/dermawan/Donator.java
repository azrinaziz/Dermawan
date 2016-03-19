/*
 * Name:        Donator.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

import java.io.Serializable;

final class Donator implements Serializable {

    private final String NAME;
    private final double TOTAL_CONTRIBUTION;

    Donator(String name, double totalContribution) {
        NAME = name;
        TOTAL_CONTRIBUTION = totalContribution;
    }

    String getName() { return NAME; }

    double getTotalContribution() { return TOTAL_CONTRIBUTION; }
}
