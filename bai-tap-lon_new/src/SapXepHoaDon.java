import java.util.Comparator;

public class SapXepHoaDon implements Comparator<HoaDon> {
    @Override
    public int compare(HoaDon o1,HoaDon o2){
        if(o1.tongTien()> o2.tongTien())
            return 1;
        if(o1.tongTien()< o2.tongTien())
            return -1;
        return 0;
    }
}
