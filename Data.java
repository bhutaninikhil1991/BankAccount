import java.util.ArrayList;

public class Data{
    public static <T extends Measurable> float average(ArrayList<T> list)
    {
        float sum = 0;
        for(int i=0;i < list.size();i++)
        {
            sum += list.get(i).getMeasure();
        }
        
        return sum/list.size();
    }
}