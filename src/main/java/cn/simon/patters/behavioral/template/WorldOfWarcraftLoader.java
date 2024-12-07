package cn.simon.patters.behavioral.template;

public class WorldOfWarcraftLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local data for World of Warcraft...");
        // Some code to load local data for World of Warcraft...
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating objects for World of Warcraft...");
        // Some code to create objects for World of Warcraft...
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files for World of Warcraft...");
        // Some code to download additional files for World of Warcraft...
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading profiles for World of Warcraft...");
        // Some code to load profiles for World of Warcraft...
    }
}
