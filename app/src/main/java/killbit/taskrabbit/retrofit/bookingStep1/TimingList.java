
package killbit.taskrabbit.retrofit.bookingStep1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimingList {

    @SerializedName("1")
    @Expose
    private String _1;
    @SerializedName("0")
    @Expose
    private String _0;
    @SerializedName("2")
    @Expose
    private String _2;
    @SerializedName("3")
    @Expose
    private String _3;

    public String get1() {
        return _1;
    }

    public void set1(String _1) {
        this._1 = _1;
    }

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public String get2() {
        return _2;
    }

    public void set2(String _2) {
        this._2 = _2;
    }

    public String get3() {
        return _3;
    }

    public void set3(String _3) {
        this._3 = _3;
    }

}
