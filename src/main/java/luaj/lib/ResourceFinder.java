package luaj.lib;

import java.io.InputStream;

public interface ResourceFinder {
    InputStream findResource(String str);
}