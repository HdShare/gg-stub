package luaj;

public class LuaDouble extends LuaNumber {
    public static final String JSTR_NAN = "nan";
    public static final String JSTR_NEGINF = "-inf";
    public static final String JSTR_POSINF = "inf";
    private static final double MAX_LONG = 9.007199254740992E15d;
    final double v;
    public static final LuaDouble NAN = new LuaDouble(Double.NaN);
    public static final LuaDouble POSINF = new LuaDouble(Double.POSITIVE_INFINITY);
    public static final LuaDouble NEGINF = new LuaDouble(Double.NEGATIVE_INFINITY);

    public static LuaNumber valueOf(double d) {
        throw new RuntimeException("Stub!");
    }

    private LuaDouble(double d) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
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
    public LuaLong checkinteger() {
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

    private boolean noint(String op, LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue ddiv(double lhs, double rhs) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue didiv(double lhs, double rhs) {
        throw new RuntimeException("Stub!");
    }

    public static double ddiv_d(double lhs, double rhs) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue dmod(double lhs, double rhs) {
        throw new RuntimeException("Stub!");
    }

    public static double dmod_d(double lhs, double rhs) {
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
    public String tojstring() {
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

    @Override
    public boolean isvalidkey() {
        throw new RuntimeException("Stub!");
    }
}