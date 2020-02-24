import com.googlecode.jmapper.annotations.JMap;
import com.googlecode.jmapper.annotations.JMapConversion;

public class Destination {

    @JMap("inner")
    private String name;

    @JMap("inner2")
    private String name2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @JMapConversion(to={"name", "name2"}, from={"inner", "inner2"})
    public String conversion(InnerClass str){
        return "converted to string  "+str.getName();
    }

    @JMapConversion(from={"name","name2"}, to={"inner","inner2"})
    public InnerClass conversion2(String str){
        return new InnerClass(str, " converted to nested object");
    }
}
