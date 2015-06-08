package com.jamesbond;

import com.jamesbond.skytv.Channel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serkan.Tugrul on 08/06/2015.
 */
public class HardCodedDatabase {

    private static List<Channel> dataStore = new ArrayList<Channel>();

    public HardCodedDatabase() {
        dataStore.add(new Channel("Sean Connery", "Goldfinger", "Goldfinger", "No programmes available", "Moonraker", "Moonraker", "No programmes available", "Dr. No"));
        dataStore.add(new Channel("George Lazenby", "No programmes available", "Skyfall", "Skyfall", "No programmes available", "No programmes available", "Licence to Kill", "Licence to Kill"));
        dataStore.add(new Channel("Roger Moore", "Thunderball", "Thunderball", "No programmes available", "Die Another Day", "Die Another Day", "No programmes available", "No programmes available"));
        dataStore.add(new Channel("Timothy Dalton", "On Her Majesty's Secret Service", "On Her Majesty's Secret Service", "No programmes available", "No programmes available", "Casino Royal", "Casino Royal", "Casino Royal"));
        dataStore.add(new Channel("Pierce Brosnan", "No programmes available", "No programmes available", "No programmes available", "A View to Kill", "A View to Kill", "No programmes available", "No programmes available"));
        dataStore.add(new Channel("Daniel Craig", "Quantum of Solace", "Quantum of Solace", "No programmes available", "No programmes available", "You Only Live Twice", "You Only Live Twice", "No programmes available"));
    }

    public List<Channel> getChannels() {
        return dataStore;
    }
}
