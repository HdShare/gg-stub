package luaj;

import android.ext.Message;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoadState {
    public static final int LUAC_FORMAT = 0;
    public static final int LUAC_HEADERSIZE = 12;
    public static final int LUAC_VERSION = 82;
    public static final int LUA_TBOOLEAN = 1;
    public static final int LUA_TFUNCTION = 6;
    public static final int LUA_TINT = -2;
    public static final int LUA_TNIL = 0;
    public static final int LUA_TNONE = -1;
    public static final int LUA_TNUMBER = 3;
    public static final int LUA_TSTRING = 4;
    public static final int LUA_TTABLE = 5;
    public static final int LUA_TTHREAD = 8;
    public static final int LUA_TUSERDATA = 7;
    public static final int LUA_TVALUE = 9;
    public static final int NUMBER_FORMAT_FLOATS_OR_DOUBLES = 0;
    public static final int NUMBER_FORMAT_INTS_ONLY = 1;
    public static final int NUMBER_FORMAT_NUM_PATCH_INT32 = 4;
    public static final String SOURCE_BINARY_STRING = "=?";
    private byte[] buf = new byte[512];
    public final DataInputStream is;
    private int luacFormat;
    private boolean luacLittleEndian;
    private int luacNumberFormat;
    private int luacSizeofInstruction;
    private int luacSizeofInt;
    private int luacSizeofLuaNumber;
    private int luacSizeofSizeT;
    private int luacVersion;
    String name;
    public static final Globals.Undumper instance = new GlobalsUndumper(null);
    public static String encoding = null;
    public static final byte[] LUA_SIGNATURE = {Message.CMD_SC_GET_MEMORY, 76, 117, 97};
    public static final byte[] LUAC_TAIL = {Message.CMD_SC_APP_LIST, -109, 13, 10, Message.CMD_SC_MEM, 10};
    private static final LuaValue[] NOVALUES = new LuaValue[0];
    private static final Prototype[] NOPROTOS = new Prototype[0];
    private static final LocVars[] NOLOCVARS = new LocVars[0];
    private static final Upvaldesc[] NOUPVALDESCS = new Upvaldesc[0];
    private static final int[] NOINTS = new int[0];
    public static volatile boolean badHeader = false;

    public static class BadHeader {
    }

    public static void install(Globals globals) {
        throw new RuntimeException("Stub!");
    }

    int loadInt() throws IOException {
        throw new RuntimeException("Stub!");
    }

    int[] loadIntArray() throws IOException {
        throw new RuntimeException("Stub!");
    }

    long loadInt64() throws IOException {
        throw new RuntimeException("Stub!");
    }

    LuaString loadString() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue longBitsToLuaNumber(long bits) {
        throw new RuntimeException("Stub!");
    }

    LuaValue loadNumber() throws IOException {
        throw new RuntimeException("Stub!");
    }

    void loadConstants(Prototype f) throws IOException {
        throw new RuntimeException("Stub!");
    }

    void loadUpvalues(Prototype f) throws IOException {
        throw new RuntimeException("Stub!");
    }

    void loadDebug(Prototype f) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public Prototype loadFunction() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void loadHeader() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static Prototype undump(InputStream stream, String chunkname) throws IOException {
        throw new RuntimeException("Stub!");
    }

    private static Prototype fillSource(Prototype p, LuaString def) {
        throw new RuntimeException("Stub!");
    }

    public static String getSourceName(String name) {
        throw new RuntimeException("Stub!");
    }

    private LoadState(InputStream stream, String name) {
        throw new RuntimeException("Stub!");
    }

    private static final class GlobalsUndumper implements Globals.Undumper {
        private GlobalsUndumper() {
            throw new RuntimeException("Stub!");
        }

        GlobalsUndumper(GlobalsUndumper globalsUndumper) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Prototype undump(InputStream stream, String chunkname) throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}