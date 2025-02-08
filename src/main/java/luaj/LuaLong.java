package luaj;

public class LuaLong extends LuaNumber {
    public static final LuaLong MAX_VALUE = new LuaLong(Long.MAX_VALUE);
    public static final LuaLong MIN_VALUE = new LuaLong(Long.MIN_VALUE);
    private static final LuaLong[] longValues = new LuaLong[512];
    private static final LuaString[] luaStrings = new LuaString[512];
    private static final String[] strings = new String[512];
    public final long v;

    public static LuaLong valueOf(long l) {
        throw new RuntimeException("Stub!");
    }

    LuaLong(long l) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isint() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isinttype() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean islong() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isintnumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean islongnumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public byte tobyte() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public char tochar() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double todouble() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public float tofloat() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int toint() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public long tolong() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public short toshort() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double optdouble(double defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int optint(int defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaLong optinteger(LuaLong defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public long optlong(long defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    private String getStr() {
        throw new RuntimeException("Stub!");
    }

    private LuaString getLuaStr() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString strvalue() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString optstring(LuaString defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue tostring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String optjstring(String defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaLong checkinteger() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public static int hashCode(long x) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue neg() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue bnot() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean eq_b(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean raweq(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue add(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue sub(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue mul(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue pow(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue div(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue idiv(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue mod(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue band(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue bor(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue bxor(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue shl(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue shr(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean lt_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean lteq_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean gt_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean gteq_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int checkint() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public long checklong() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double checkdouble() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String checkjstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString checkstring() {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue shl(long n, long m) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue shr(long n, long m) {
        throw new RuntimeException("Stub!");
    }

    public static long floorDiv(long x, long y) {
        throw new RuntimeException("Stub!");
    }

    public static long mod(long a, long b) {
        throw new RuntimeException("Stub!");
    }
}