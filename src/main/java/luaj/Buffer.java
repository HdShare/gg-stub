package luaj;

public final class Buffer {
    private static final int DEFAULT_CAPACITY = 64;
    private static final int MAXUNICODE = 1114111;
    private static final byte[] NOBYTES = new byte[0];
    private byte[] bytes;
    private int length;
    private int offset;
    private LuaValue value;

    public Buffer() {
        throw new RuntimeException("Stub!");
    }

    public Buffer(int initialCapacity) {
        throw new RuntimeException("Stub!");
    }

    public Buffer(LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue value() {
        throw new RuntimeException("Stub!");
    }

    public Buffer setvalue(LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public int length() {
        throw new RuntimeException("Stub!");
    }

    public final LuaString tostring() {
        throw new RuntimeException("Stub!");
    }

    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public final Buffer append(byte b) {
        throw new RuntimeException("Stub!");
    }

    public final Buffer appendCodePoint(int cp) {
        throw new RuntimeException("Stub!");
    }

    public final Buffer append(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public final Buffer append(LuaString str) {
        throw new RuntimeException("Stub!");
    }

    public final Buffer append(String str) {
        throw new RuntimeException("Stub!");
    }

    public final Buffer append(byte[] b, int start, int n) {
        throw new RuntimeException("Stub!");
    }

    public Buffer concatTo(LuaValue lhs) {
        throw new RuntimeException("Stub!");
    }

    public Buffer concatTo(LuaString lhs) {
        throw new RuntimeException("Stub!");
    }

    public Buffer concatTo(LuaNumber lhs) {
        throw new RuntimeException("Stub!");
    }

    public Buffer prepend(LuaString s) {
        throw new RuntimeException("Stub!");
    }

    public final void makeroom(int nbefore, int nafter) {
        throw new RuntimeException("Stub!");
    }

    private final void realloc(int newSize, int newOffset) {
        throw new RuntimeException("Stub!");
    }
}