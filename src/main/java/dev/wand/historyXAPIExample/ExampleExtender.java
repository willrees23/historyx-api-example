package dev.wand.historyXAPIExample;

import dev.wand.historyx.api.entry.CustomEntry;
import dev.wand.historyx.api.extender.BanPluginExtender;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ExampleExtender implements BanPluginExtender<ExampleObject> {
    @Override
    public List<CustomEntry> getHistory(UUID uuid) {
        /*
        As this is not a punishment plugin, I will just return a list of 10 CustomEntries.
        You will need to replace this with your own implementation with however you retrieve your player's punishment history.
         */
        List<CustomEntry> entries = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            entries.add(
                    /*
                    Use the createEntry method which is defined below.
                    Make sure to use the CUSTOM entry source!
                     */
                    createEntry(new ExampleObject(), CustomEntry.EntrySource.CUSTOM)
            );
        }
        return entries;
    }

    @Override
    public CustomEntry createEntry(ExampleObject exampleObject, CustomEntry.EntrySource entrySource) {
        /*
         You use the Punishment object (in this case ExampleObject) to get the data.
         You will need to pass this data to the CustomEntry constructor.
         */
        return new CustomEntry(
                1L,
                "ban",
                "testUiD",
                null,
                "cheating",
                null,
                "hey",
                null,
                null,
                null,
                100L,
                200L,
                null, null, false, false, false, 10L, entrySource
        );
    }
}
