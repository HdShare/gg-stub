package luaj;

public class LuaArgError extends LuaError {
    private static final long serialVersionUID = -3358127546674542239L;
    public final String funcname;
    public final int iarg;
    public final String msg;

    private String msg() {
        throw new RuntimeException("Stub!");
    }

    private String funcname(String funcname) {
        throw new RuntimeException("Stub!");
    }

    public LuaArgError(int iarg, String funcname, String msg) {
        super((String) null);
        throw new RuntimeException("Stub!");
    }

    public LuaArgError(LuaArgError src) {
        super((String) null, src);
        throw new RuntimeException("Stub!");
    }
}