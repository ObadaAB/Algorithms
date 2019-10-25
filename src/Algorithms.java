import java.util.NoSuchElementException;

public class Algorithms
{
    void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (a[j + 1] < a[j])
                {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }

    public int getKthMinimum(int[] a, int k)
    {
        if (k < 0 || k >= a.length)
            throw new NoSuchElementException();
        sort(a);
        return a[k];
    }

    public int getMiddle(int[] a)
    {
        return getKthMinimum(a, a.length / 2);
    }
}
