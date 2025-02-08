package luaj;

public class Prototype {
    public int[] code;
    public int is_vararg;
    public LuaValue[] k;
    public int lastlinedefined;
    public int linedefined;
    public int[] lineinfo;
    public LocVars[] locvars;
    public int maxstacksize;
    public int numparams;
    public Prototype[] p;
    public LuaString source;
    int tailPos;
    public Upvaldesc[] upvalues;
    private static final Upvaldesc[] NOUPVALUES = new Upvaldesc[0];
    private static final Prototype[] NOSUBPROTOS = new Prototype[0];

    public Prototype() {
        throw new RuntimeException("Stub!");
    }

    public Prototype(int n_upvalues) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public LuaString getlocalname(int number, int pc) {
        throw new RuntimeException("Stub!");
    }

    public String shortsource() {
        throw new RuntimeException("Stub!");
    }
}