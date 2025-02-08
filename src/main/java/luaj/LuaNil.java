package luaj;

public class LuaNil extends LuaValue {
    public static LuaValue s_metatable;

    @Override
    public int type() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String typename() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue not() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean toboolean() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isnil() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue checknotnil() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isvalidkey() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean optboolean(boolean defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaClosure optclosure(LuaClosure defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double optdouble(double defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaFunction optfunction(LuaFunction defval) {
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
    public LuaNumber optnumber(LuaNumber defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaTable opttable(LuaTable defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaThread optthread(LuaThread defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String optjstring(String defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString optstring(LuaString defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue optvalue(LuaValue defval) {
        throw new RuntimeException("Stub!");
    }
}