/*
 * Name:        Utility.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

import java.io.File;
import java.io.IOException;
import java.util.List;

final class Utility {

    static List<Object> loadFile(File file, Object object, boolean createNewFile) throws IOException {
        /*
        List<Object> donatorsList = new ArrayList<>();

        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);

            if (file.length() > 0) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                    donatorsList = (List<Object>) objectInputStream.readObject();
                }
                catch (ClassNotFoundException e) {
                    return null;
                }
            }

            fileInputStream.close();
            return donatorsList;

        } else {
            if (createNewFile) {
                if (file.createNewFile())
                    return donatorsList;
                else
                    return null;
            } else
                return null;
        }
        */
        return null;
    }
}
