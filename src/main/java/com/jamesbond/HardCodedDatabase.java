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
        dataStore.add(new Channel("Sean Connery", "Goldfinger", "Goldfinger", "Moonraker", "Moonraker", "Golden Eye", "Golden Eye", "Dr. No"));
        dataStore.add(new Channel("George Lazenby", "Skyfall", "Skyfall", "Skyfall", "The Spy Who Loved Me", "The Spy Who Loved Me", "Licence to Kill", "Licence to Kill"));
        dataStore.add(new Channel("Roger Moore", "Thunderball", "Thunderball", "Die Another Day", "Die Another Day", "Diamonds Are Forever", "Diamonds Are Forever", "From Russia With Love"));
        dataStore.add(new Channel("Timothy Dalton", "On Her Majesty's Secret Service", "On Her Majesty's Secret Service", "The Living Day Lights", "The Living Day Lights", "Casino Royal", "Casino Royal", "Casino Royal"));
        dataStore.add(new Channel("Pierce Brosnan", "Tomorrow Never Dies", "Tomorrow Never Dies", "For Your Eyes Only", "For Your Eyes Only", "A View to Kill", "A View to Kill", "Live and Let Die"));
        dataStore.add(new Channel("Daniel Craig", "Quantum of Solace", "Quantum of Solace", "The World Is Not Enough", "The World Is Not Enough", "You Only Live Twice", "You Only Live Twice", "Octopussy"));
    }

    public List<Channel> getChannels() {
        return dataStore;
    }
}
