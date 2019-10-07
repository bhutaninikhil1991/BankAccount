import java.util.ArrayList;

public abstract class Measurable2 implements Comparable<Measurable2> {

    abstract float getMeasure();

    public static <T extends Measurable2> float average(ArrayList<T> list) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getMeasure();
        }

        return sum / list.size();
    }

    @Override
    public int compareTo(Measurable2 items) {
        if (this.getMeasure() > items.getMeasure())
            return 1;
        else if (this.getMeasure() < items.getMeasure())
            return -1;
        else
            return 0;
    }

}