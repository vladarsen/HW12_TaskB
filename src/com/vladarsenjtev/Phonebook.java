package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Phonebook {
    private final List<Recording> phonebook = new ArrayList<>();


    public void addPhone(String name, String phone) {
        phonebook.add(new Recording(name, phone));
    }

    public List<Recording> getPhonebook() {
        return phonebook;
    }

    public Recording find(String name) {
        for (Recording recording : phonebook) {
            if (recording.getName().equals(name)) {
                return recording;
            }
        }
        return null;
    }

    public ArrayList<Recording> findAll(String name) {
        Iterator<Recording> iterator = phonebook.iterator();
        ArrayList<Recording> arrayList = new ArrayList<>();

        while (iterator.hasNext()) {
            for (Recording recording : phonebook) {
                if (recording.getName().equals(name)) {
                    arrayList.add(recording);
                }
            }
            return arrayList;
        }
        return null;
    }
}