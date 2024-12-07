package cn.simon.patters.behavioral.template;

public class DiabloLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local data for Diablo...");
        // Some code to load local data for Diablo
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating objects for Diablo...");
        // Some code to create objects for Diablo
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files for Diablo...");
        // Some code to download additional files for Diablo
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing profiles for Diablo...");
        // Some code to initialize profiles for Diablo
    }
}
