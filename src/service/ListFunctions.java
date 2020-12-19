package service;

import model.roster.Roster;
import model.roster.RosterItem;


public interface ListFunctions {

    void editName(String newName);

    void addRosterItem(String content);

    void editRosterItem(String newContent);

    void addRoster(String name);

    void deleteRosterItem(RosterItem rosterItem);

    void deleteRoster(Roster roster);

    void save();
}
