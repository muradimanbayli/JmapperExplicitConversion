import com.googlecode.jmapper.annotations.JMap;

public class Source {

    @JMap("name")
    private InnerClass inner;

    @JMap("name2")
    private InnerClass inner2;

    public InnerClass getInner() {
        return inner;
    }

    public void setInner(InnerClass inner) {
        this.inner = inner;
    }

    public InnerClass getInner2() {
        return inner2;
    }

    public void setInner2(InnerClass inner2) {
        this.inner2 = inner2;
    }
}
