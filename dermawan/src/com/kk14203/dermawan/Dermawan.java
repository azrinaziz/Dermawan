/*
 * Name:        Dermawan.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

final class Dermawan {

    // Main execution point of this application
    private void execute() {
        System.out.println("Dermawan [Version 1.0.2016]");
        System.out.println("(c) 2016 Azrin Aziz. All rights reserved.");
        System.out.println();

        this.mainMenu();
        this.userSelection();
    }

    private void mainMenu() {
        System.out.println(Utility.horizontalLine('*', 80));
        System.out.println("MAIN MENU");
        System.out.println(Utility.horizontalLine('*', 80));
        System.out.println();
        System.out.println("1    Add donor");
        System.out.println("2    Delete donor");
        System.out.println("3    Edit donor");
        System.out.println("4    View Donor");
        System.out.println("5    Exit");
        System.out.println();
        System.out.print("Please enter your selection: ");
    }

    // Assigned to: Ezra Simon Takom and Sebastian Primus
    private void userSelection() {}

    // Assigned to: Sebastian Primus
    private void add() {}

    // Assigned to: Azrin Aziz
    private void edit() {}

    // Assigned to: Ezra Simon Takom
    private void delete() {}

    // Assigned to: Ahmad Syaiful
    private void view() {}

    // Entry point of this application
    public static void main(String[] args) {
        Dermawan dermawan = new Dermawan();
        dermawan.execute();
    }
}
