package main;

import java.util.List;

public class PackageGroup {

    private String groupKey;
    private List<Package> packages;

    public PackageGroup() {
    }

    public PackageGroup(String groupKey, List<Package> packages) {
        this.groupKey = groupKey;
        this.packages = packages;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "PackageGroup{" +
                "groupKey='" + groupKey + '\'' +
                ", packages=" + packages +
                '}';
    }
}
