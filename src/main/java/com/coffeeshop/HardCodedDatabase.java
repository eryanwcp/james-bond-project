package com.coffeeshop;

import com.coffeeshop.coffee.Channel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serkan.Tugrul on 08/06/2015.
 */
public class HardCodedDatabase {

    private static List<Channel> dataStore = new ArrayList<Channel>();

    public HardCodedDatabase() {
        dataStore.add(new Channel("Sean Connery", null, null, "A View To Kill", null, null, "Casino Royal", null));
        dataStore.add(new Channel("Roger Moore", null, "Thunderball", null, null, null, null, "Die Another Day"));
    }

    public List<Channel> getChannels() {
        return dataStore;
    }
}
