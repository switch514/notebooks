package normal;

public class No154CompareVersion {
    public int compareVersion(String version1, String version2) {
        if (null == version1 && null != version2) {
            return -1;
        }
        if (null != version1 && null == version2) {
            return 1;
        }
        if (null == version1 && null == version2) {
            return 0;
        }

        String[] version1s = version1.split("\\.");
        String[] version2s = version2.split("\\.");

        return compareVersions(version1s, version2s);

    }

    private int compareVersions(String[] version1s, String[] version2s) {
        int length = version1s.length > version2s.length ? version1s.length : version2s.length;

        for (int i = 0; i < length; i++) {
            int v1 = 0;
            if (i < version1s.length) {
                v1 = Integer.parseInt(version1s[i]);
            }
            int v2 = 0;
            if (i < version2s.length) {
                v2 = Integer.parseInt(version2s[i]);
            }
            if (v1 > v2) {
                return 1;
            }
            if (v1 < v2) {
                return -1;
            }
        }

        return 0;
    }

}
