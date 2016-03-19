/*
 * Name:        Utility.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

import java.io.*;
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

    static boolean saveFile(File file, List<Donator> donatorList) {
        if (donatorList != null && !donatorList.isEmpty()) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(file, false); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(donatorList);
                return true;
            } catch (IOException e) {
                return false;
            }
        }
        else return false;
    }

    @SuppressWarnings("unchecked")
    static List<Donator> deserialise(FileInputStream fileInputStream) {
        List<Donator> donatorList = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            donatorList = (List<Donator>) objectInputStream.readObject();
            return donatorList;
        }
        catch (IOException | ClassNotFoundException e) {
            return donatorList;
        }
    }
}
