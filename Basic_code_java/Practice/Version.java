package Practice;

import java.util.ArrayList;
import java.util.List;

class Version {
    private String version;
    private boolean hasBug;

    public Version(String version, boolean hasBug){
        this.version=version;
        this.hasBug=hasBug;
    }

    public String getVersion(){
        return version;
    }
    public boolean getHasBug(){
        return hasBug;
    }
}
class Main{
    public static void main(String[] args) {
        List<Version> versions = new ArrayList<>();
        versions.add(new Version("1.0.0", false));
        versions.add(new Version("2.0.0", false));
        versions.add(new Version("3.0.0", true));
        versions.add(new Version("4.0.0", false));
        versions.add(new Version("5.0.0", true));
        versions.add(new Version("6.0.0", true));
        
        System.out.println("Version with Bugs: ");
        for(Version version : versions){
            if (version.getHasBug()) {
                System.out.println(version.getVersion());
            }
        }

    }
}

