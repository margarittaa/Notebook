package service;

import model.diary.Entry;


public interface DiaryFunctions {
    void addEntry(String contentEntry);

    void editEntry(String newContentEntry);

    void deleteEntry(Entry entry);

    void save();
}
