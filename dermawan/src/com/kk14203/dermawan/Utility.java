/*
 * Name:        Utility.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

final class Utility {

    static FileInputStream loadFile(File file) {
        if (file.exists() && file.length() > 0) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                return fileInputStream;
            }
            catch (IOException e) {
                return null;
            }
        }
        else return null;
    }

    @SuppressWarnings("unchecked")
    static List<Donator> deserialise(FileInputStream fileInputStream) {
        List<Donator> donatorsList = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            donatorsList = (List<Donator>) objectInputStream.readObject();
            return donatorsList;
        }
        catch (IOException | ClassNotFoundException e) {
            return donatorsList;
        }
    }
}
