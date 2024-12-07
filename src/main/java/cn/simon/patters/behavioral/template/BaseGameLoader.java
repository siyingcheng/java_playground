package cn.simon.patters.behavioral.template;

public abstract class BaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract byte[] loadLocalData();

    abstract void createObjects(byte[] data);

    abstract void downloadAdditionalFiles();

    abstract void initializeProfiles();

    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
        // Some code to clean temporary files
    }
}
